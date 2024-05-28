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
import java.util.List;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form2Controller {
    private GymerFunc gymerFunc;
    private Form2 view;
    private TEST frame;
    public Form2Controller(Form2 view){
        this.view=view;
        gymerFunc = new GymerFunc();
        view.addDeleteGymerListener(new DeleteGymerListener());
        view.addEditGymerListener(new EditGymerListener());
//        view.addSearchVisitListener(new SearchVisitListener());
        view.addResetListener(new ResetGymerListener());
        view.addSortGymerListener(new SortGymerListener());
        view.addSearchGymerListener(new SearchGymerListener());

    }
    public void showForm2(){
        List<GymerMember> gymerList = gymerFunc.getListGymers();
        view.showGymer(gymerList);
    }
    public void ResetListTable(){
        gymerFunc = new GymerFunc();
        view.showGymer(gymerFunc.getListGymers());
    }

    public class SearchGymerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String timkiem = view.timkiemString();
            int index = view.getIndexSort();
            if(index==0){

               if(timkiem!=null||timkiem.equals("")){
                
                view.showGymer(gymerFunc.getListGymersByID(timkiem));
           }
            }
            if(index==1){
                 if(timkiem!=null||timkiem.equals("")){
                view.showGymer(gymerFunc.getListGymersByName(timkiem));
            }
            }
            if(index==2){
                if(timkiem!=null||timkiem.equals("")){
                view.showGymer(gymerFunc.getListGymersByCoach(timkiem));
            }
            }
            if(index==3){
                if(timkiem!=null||timkiem.equals("")){
                view.showGymer(gymerFunc.getListGymersByGender(timkiem));
            }
            }
            
        }
    }
    public class DeleteGymerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GymerMember gymer = view.getGymerInfo();
            if (gymer != null) {
                gymerFunc.delete(gymer);
                //view.clearCrimeInfo();
                view.showGymer(gymerFunc.getListGymers());
                view.showMessage("Xóa thành công!");
            }
        }
    }
     class SortGymerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           int index = view.getIndexSort();
           if(index==0){
               gymerFunc.sortGymerById();
               List<GymerMember> gymerList = gymerFunc.getListGymers();
               view.showGymer(gymerList);
           }
            if(index==1){
                gymerFunc.sortGymerByName();
                List<GymerMember> crimeList = gymerFunc.getListGymers();
                view.showGymer(crimeList);
            }
            if(index==2){
                gymerFunc.sortGymerByCoach();
                List<GymerMember> crimeList = gymerFunc.getListGymers();
                view.showGymer(crimeList);
            }
            if(index==3){
                gymerFunc.sortGymerByGender();
                List<GymerMember> crimeList = gymerFunc.getListGymers();
                view.showGymer(crimeList);
            }
            
        }
    }
     
//    class SearchGymerListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            int index = view.getIndexSearch();
//            String infor = view.getFieldSearch().trim();
//            System.out.println(infor);
//            if(index==0){
//                visitfunc = new VisitFunc();
//                view.showVisit(visitfunc.getListVisitById(Integer.parseInt(infor)));
//            }
//            else if(index==1){
//                view.showVisit(visitfunc.getListVisitByIdPrison(infor));
//            } else if(index==2){
//                view.showVisit(visitfunc.getListVisitByVisitDay(infor));
//            } else if(index==3){
//                view.showVisit(visitfunc.getListVisitByLocation(infor));
//            } else if (index==4) {
//                view.showVisit(visitfunc.getListVisitByNameVisiter(infor));
//            }else if (index==5) {
//                view.showVisit(visitfunc.getListVisitByRelasionship(infor));
//            }
//
//        }
//    }
    public class ResetGymerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gymerFunc = new GymerFunc();
            view.showGymer(gymerFunc.getListGymers());

        }
    }
    class EditGymerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GymerMember gym = view.getGymerInfo();
            if (gym != null) {
                //visitfunc.edit(crime);
                frame = new TEST(gym);
                EditGymerController controller = new EditGymerController(frame,view);
                controller.showFrame();
//                CrimeView.showCrime(Crime);
//                CrimeView.showListCrimes(CrimeDao.getListCrimes());
//                CrimeView.showMessage("Cập nhật thành công!");
            }
        }
    }
}
