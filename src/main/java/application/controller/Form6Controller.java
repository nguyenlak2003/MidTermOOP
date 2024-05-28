/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.Employee;
import application.form.Form6;
import application.form.FrameForm6;
import application.func.EmployFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form6Controller {
    private EmployFunc employFunc;
    private Form6 view;
    private FrameForm6 frame;
    public Form6Controller(Form6 view){
        this.view=view;
        employFunc = new EmployFunc();
        view.addDeleteEmployeeListener(new DeleteEmployeeListener());
        view.addEditEmployeeListener(new EditEmployeeListener());
//        view.addSearchVisitListener(new SearchVisitListener());
        view.addResetListener(new ResetEmployeeListener());
        view.addSortEmployeeListener(new SortEmployeeListener());
        view.addSearchEmployeeListener(new SearchEmployeeListener());

    }
    public void showForm6(){
        List<Employee>employeeList = employFunc.getListEmployees();
        view.showEmployee(employeeList);
    }
    public void ResetListTable(){
        employFunc = new EmployFunc();
        view.showEmployee(employFunc.getListEmployees());
    }

    public class SearchEmployeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String timkiem = view.timkiemString();
            int index = view.getIndexSort();
            if(index==0){

               if(timkiem!=null||timkiem.equals("")){
                
                view.showEmployee(employFunc.getListEmployeesByID(timkiem));
           }
            }
            if(index==1){
                 if(timkiem!=null||timkiem.equals("")){
                view.showEmployee(employFunc.getListEmployeeByName(timkiem));
            }
            }
            
            
            if(index==2){
                if(timkiem!=null||timkiem.equals("")){
                view.showEmployee(employFunc.getListEmployeessByGender(timkiem));
            }
            }
            
    }
    }
    public class DeleteEmployeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Employee employee = view.getEmployeeInfo();
            if (employee != null) {
                employFunc.delete(employee);
                //view.clearCrimeInfo();
                view.showEmployee(employFunc.getListEmployees());
                view.showMessage("Xóa thành công!");
            }
        }
    }
     class SortEmployeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           int index = view.getIndexSort();
           if(index==0){
               employFunc.sortEmployeeById();
               List<Employee> gymerList = employFunc.getListEmployees();
               view.showEmployee(gymerList);
           }
            if(index==1){
                employFunc.sortEmloyeeByName();
                List<Employee> crimeList = employFunc.getListEmployees();
                view.showEmployee(crimeList);
            }
           
            if(index==2){
                employFunc.sortEmloyeeByGender();
                List<Employee> crimeList = employFunc.getListEmployees();
                view.showEmployee(crimeList);
            }
            
        }
    }
     
//    class SearchGymerListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            int index = view.getIndexSearch();
//            String infor = view.getFieldSearch().trim();
//            System.out.println(infor);
//            if(index==0){
//                visitfunc = new VisitFunc();
//                view.showVisit(visitfunc.getListVisitById(Integer.parseInt(infor)));
//            }
//            else if(index==1){
//                view.showVisit(visitfunc.getListVisitByIdPrison(infor));
//            } else if(index==2){
//                view.showVisit(visitfunc.getListVisitByVisitDay(infor));
//            } else if(index==3){
//                view.showVisit(visitfunc.getListVisitByLocation(infor));
//            } else if (index==4) {
//                view.showVisit(visitfunc.getListVisitByNameVisiter(infor));
//            }else if (index==5) {
//                view.showVisit(visitfunc.getListVisitByRelasionship(infor));
//            }
//
//        }
//    }
    public class ResetEmployeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            employFunc = new EmployFunc();
            view.showEmployee(employFunc.getListEmployees());

        }
    }
    class EditEmployeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Employee employee = view.getEmployeeInfo();
            if (employee != null) {
                //visitfunc.edit(crime);
                frame = new FrameForm6(employee);
                EditEmployeeController controller = new EditEmployeeController(frame,view);
                controller.showFrame();
//                CrimeView.showCrime(Crime);
//                CrimeView.showListCrimes(CrimeDao.getListCrimes());
//                CrimeView.showMessage("Cập nhật thành công!");
            }
        }
    }
}
