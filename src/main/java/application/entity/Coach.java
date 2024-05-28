/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import application.entity.Person;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Van Phong Tu
 */
@XmlRootElement(
        name = "Coach"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class Coach extends Person{
    private int salary;
    private int rentMoney;
    private String maCoach;

    public Coach(int salary, int rentMoney, String maCoach, String name, String gender, String address, String phoneNumber, String dob) {
        super(name, gender, address, phoneNumber, dob);
        this.salary = salary;
        this.rentMoney = rentMoney;
        this.maCoach = maCoach;
    }

    public Coach() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(int rentMoney) {
        this.rentMoney = rentMoney;
    }

    public String getMaCoach() {
        return maCoach;
    }

    public void setMaCoach(String maCoach) {
        this.maCoach = maCoach;
    }

    
    
    
}
