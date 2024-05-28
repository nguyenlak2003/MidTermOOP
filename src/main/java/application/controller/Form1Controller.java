/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.GymerMember;
import application.form.Form1;
import application.func.GymerFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form1Controller {
    private GymerFunc gymerFuns;
    private Form1 view;

    public Form1Controller(Form1 view) {
        this.view = view;
        gymerFuns = new GymerFunc();

        view.addAddGymerListener(new Form1Controller.addGymerListener());
        //System.out.println("controll");

    }

    class addGymerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("action");
            GymerMember gymer = view.getGymerInfo();
            if (gymer != null) {
                gymerFuns.add(gymer);
                //c.showStudent(student);
                //studentView.showListStudents(studentDao.getListStudents());
                view.showMessage("Thêm thành công!");
                view.resetField();
            }
        }
    }
    public void showForm1(){

    }
}
