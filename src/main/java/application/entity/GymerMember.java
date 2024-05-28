/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Van Phong Tu
 */
@XmlRootElement(
        name = "gymermember"
)
@XmlAccessorType(XmlAccessType.FIELD)

public class GymerMember extends Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String startDay, ticket;
    private int time;
    private int price;
    private String coach;

    public GymerMember(String id, String name, String gender, String dob, String address, String phoneNumber, String startDay, String ticket, int time, String coach, int price) {
        super(name, gender, address, phoneNumber, dob);
        this.id = id;
        this.startDay = startDay;
        this.ticket = ticket;
        this.time = time;
        this.price = price;
        this.coach = coach;
    }

    

    public GymerMember() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    
}
    
    
    

    
