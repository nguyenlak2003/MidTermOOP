/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import java.util.Date;

/**
 *
 * @author Le Van Phong Tu
 */
public class Employee extends Person{
    private int salary;
    private String Type, maNV;

    public Employee(int salary, String Type, String maNV, String name, String gender, String address, String phoneNumber, String dob) {
        super(name, gender, address, phoneNumber, dob);
        this.salary = salary;
        this.Type = Type;
        this.maNV = maNV;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    
    
    
}
