/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.Coach;
import application.form.Form3;
import application.func.CoachFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form3Controller {
    private CoachFunc coachFunc;
    private Form3 view;

    public Form3Controller(Form3 view) {
        this.view = view;
        coachFunc = new CoachFunc();

        view.addAddHLVListener(new Form3Controller.addHLVListener());
        //System.out.println("controll");

    }

    class addHLVListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("action");
            Coach coach = view.getCoachInfoFrame();
            if (coach != null) {
                coachFunc.add(coach);
                //c.showStudent(student);
                //studentView.showListStudents(studentDao.getListStudents());
                view.showMessage("Thêm thành công!");
                view.resetField();
            }
        }
    }
    public void showForm3(){

    }
}
