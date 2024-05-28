/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.GymerMember;
import application.form.Form2;
import application.form.TEST;
import application.func.GymerFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class EditGymerController {
    private TEST frame;
    private GymerFunc gymerFunc;
    private Form2 form2;
    private Form2Controller form2controller;


    public EditGymerController(TEST frame, Form2 form2){
        this.frame=frame;
        gymerFunc= new GymerFunc();
        frame.addListennerEdit(new EditListener());
        this.form2 = form2;
    }
    public void showFrame(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(TEST.DISPOSE_ON_CLOSE);
    }
    class EditListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GymerMember gym = frame.getCrimeInfo();

            if (gym != null) {

                gymerFunc.edit(gym);
                frame.setVisible(false);
                form2controller =  new Form2Controller(form2);
                form2controller.ResetListTable();
            }
        }
    }
}
