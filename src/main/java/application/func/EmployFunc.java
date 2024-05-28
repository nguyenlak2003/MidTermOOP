/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.func;

import application.entity.Employee;
import application.entity.EmployeeXML;
import application.untils.FileUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Le Van Phong Tu
 */
public class EmployFunc {
    private static final String Employee_FILE_NAME = "Employee.xml";
    private List<Employee> listEmployees = this.readListEmployee();
    
    public void writeListEmployees(List<Employee> employees) {
        System.out.println("write");
        EmployeeXML xml = new EmployeeXML();
        xml.setEmployee(employees);
        FileUtils.writeXMLtoFile("Employee.xml", xml);
    }

    private List<Employee> readListEmployee() {
        List<Employee> list = new ArrayList<>();
        EmployeeXML xml = (EmployeeXML) FileUtils.readXMLFile("Employee.xml", EmployeeXML.class);
        if (xml != null) {
            list = xml.getEmployee();
        }

        return (List)list;
    }
    public void add(Employee employee) {
        System.out.println("add");
        this.listEmployees.add(employee);
        this.writeListEmployees(this.listEmployees);
    }

    public void edit(Employee employee) {
        int size = this.listEmployees.size();
        for(int i = 0; i < size; ++i) {
            if (((Employee)this.listEmployees.get(i)).getMaNV().equals( employee.getMaNV())) {
                ((Employee)this.listEmployees.get(i)).setName(employee.getName());
                ((Employee)this.listEmployees.get(i)).setGender(employee.getGender());
                ((Employee)this.listEmployees.get(i)).setDob(employee.getDob());
                ((Employee)this.listEmployees.get(i)).setAddress(employee.getAddress());
                ((Employee)this.listEmployees.get(i)).setPhoneNumber(employee.getPhoneNumber());
                ((Employee)this.listEmployees.get(i)).setType(employee.getType());
                ((Employee)this.listEmployees.get(i)).setSalary(employee.getSalary());
                
                System.out.println("ngu");
                this.writeListEmployees(this.listEmployees);
                break;
            }
        }

    }

    public boolean delete(Employee employee) {
        boolean isFound = false;
        int size = this.listEmployees.size();

        for(int i = 0; i < size; ++i) {
            if (((Employee)this.listEmployees.get(i)).getMaNV()== employee.getMaNV()) {
                employee = (Employee)this.listEmployees.get(i);
                isFound = true;
                break;
            }
        }

        if (isFound) {
            this.listEmployees.remove(employee);
            this.writeListEmployees(this.listEmployees);
            return true;
        } else {
            return false;
        }
    }

    public void sortEmloyeeByName() {
        Collections.sort(this.listEmployees, new Comparator<Employee>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(Employee em1, Employee em2) {
                String[] parts1 = em1.getName().split(" ");
                String[] parts2 = em2.getName().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    public void sortEmloyeeByGender() {
        Collections.sort(this.listEmployees, new Comparator<Employee>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(Employee em1, Employee em2) {
                String[] parts1 = em1.getGender().split(" ");
                String[] parts2 = em2.getGender().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    public void sortEmployeeById() {
        Collections.sort(this.listEmployees, new Comparator<Employee>() {
            public int compare(Employee em1, Employee em2) {
                return em1.getMaNV().compareTo(em2.getMaNV());
            }
        });
    }
    public boolean hasEmployee(String id){
        for(Employee i: listEmployees){
            if(i.getMaNV().equals(id)) return true;
        }
        return false;
    }
    public List<Employee> getListEmployees() {
        return this.listEmployees;
    }
    public List<Employee> getListEmployeesByID(String Id){
        List<Employee> result = new ArrayList<>();
        for (Employee i: this.listEmployees) {

                if(i.getMaNV().contains(Id) ){
                    result.add(i);
                    //System.out.println(Id);
                }
        }
        return result;
    }
    public List<Employee> getListEmployeeByName(String Name){
        List<Employee> result = new ArrayList<>();
        for (Employee i: this.listEmployees) {
            if(i.getName().contains(Name) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<Employee> getListEmployeesByBirth(String Birth){
        List<Employee> result = new ArrayList<>();
        for (Employee i: this.listEmployees) {
            if(i.getDob().contains(Birth) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<Employee> getListEmployeessByGender(String Gen){
        List<Employee> result = new ArrayList<>();
        for (Employee i: this.listEmployees) {
            if(i.getGender().contains(Gen)){
                result.add(i);
            }
        }
        return result;
    }
    public String getCountEmployee(){
        return String.valueOf( this.listEmployees.size());
    }
    public void setListEmployees(List<Employee> listeEmployees) {
        this.listEmployees = listeEmployees;
    }
    
    
    
    
}
