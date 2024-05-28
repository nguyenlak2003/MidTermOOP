/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import application.entity.GymerMember;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Van Phong Tu
 */
@XmlRootElement(name = "coaches")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gym {
    
    private List<Coach> coach;

   

    public List<Coach> getCoach() {
        return coach;
    }

    public void setCoach(List<Coach> coach) {
        this.coach = coach;
    }
    
}
