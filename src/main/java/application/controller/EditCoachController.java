/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.Coach;
import application.form.Form4;
import application.form.FrameForm4;
import application.func.CoachFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class EditCoachController {
    private FrameForm4 frame;
    private CoachFunc coachFunc;
    private Form4 form4;
    private Form4Controller form4controller;


    public EditCoachController(FrameForm4 frame, Form4 form4){
        this.frame=frame;
        coachFunc= new CoachFunc();
        frame.addListennerEdit(new EditListener());
        this.form4 = form4;
    }
    public void showFrame(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(FrameForm4.DISPOSE_ON_CLOSE);
    }
    class EditListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Coach coach = frame.getCrimeInfo();

            if (coach != null) {

                coachFunc.edit(coach);
                frame.setVisible(false);
                form4controller =  new Form4Controller(form4);
                form4controller.ResetListTable();
            }
        }
    }
}
