/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.Employee;
import application.form.Form5;
import application.func.EmployFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form5Controller {
    private EmployFunc employFunc;
    private Form5 view;

    public Form5Controller(Form5 view) {
        this.view = view;
        employFunc = new EmployFunc();

        view.addAddEmployeeListener(new Form5Controller.addEmployListener());
        //System.out.println("controll");

    }

    class addEmployListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("action");
            Employee employee = view.getEmployeeInfo();
            if (employee != null) {
                employFunc.add(employee);
                //c.showStudent(student);
                //studentView.showListStudents(studentDao.getListStudents());
                view.showMessage("Thêm thành công!");
                view.resetField();
            }
        }
    }
    public void showForm5(){

    }
}
