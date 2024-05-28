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

/**
 *
 * @author Le Van Phong Tu
 */
public class EditEmployeeController {
    private FrameForm6 frame;
    private EmployFunc emlpoyFunc;
    private Form6 form6;
    private Form6Controller form6controller;


    public EditEmployeeController(FrameForm6 frame, Form6 form6){
        this.frame=frame;
        emlpoyFunc= new EmployFunc();
        frame.addListennerEdit(new EditListener());
        this.form6 = form6;
    }
    public void showFrame(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(FrameForm6.DISPOSE_ON_CLOSE);
    }
    class EditListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Employee employee = frame.getCrimeInfo();

            if (employee != null) {

                emlpoyFunc.edit(employee);
                frame.setVisible(false);
                form6controller =  new Form6Controller(form6);
                form6controller.ResetListTable();
            }
        }
    }
}
