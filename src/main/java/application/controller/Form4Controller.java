/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.controller;

import application.entity.Coach;
import application.entity.GymerMember;
import application.form.Form2;
import application.form.Form4;
import application.form.FrameForm4;
import application.form.TEST;
import application.func.CoachFunc;
import application.func.GymerFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form4Controller {
    private CoachFunc coachFunc;
    private Form4 view;
    private FrameForm4 frame;
    public Form4Controller(Form4 view){
        this.view=view;
        coachFunc = new CoachFunc();
        view.addDeleteHLVListener(new DeleteHLVListener());
        view.addEditHLVListener(new EditHLVListener());
//        view.addSearchVisitListener(new SearchVisitListener());
        view.addResetListener(new ResetHLVListener());
        view.addSortHLVListener(new SortHLVListener());
        view.addSearchHLVListener(new SearchHLVListener());

    }
    public void showForm4(){
        List<Coach> coachsList = coachFunc.getListcCoachs();
        view.showCoach(coachsList);
    }
    public void ResetListTable(){
        coachFunc = new CoachFunc();
        view.showCoach(coachFunc.getListcCoachs());
    }

    public class SearchHLVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String timkiem = view.timkiemString();
            int index = view.getIndexSort();
            if(index==0){

               if(timkiem!=null||timkiem.equals("")){
                
                view.showCoach(coachFunc.getListCoachsByID(timkiem));
           }
            }
            if(index==1){
                 if(timkiem!=null||timkiem.equals("")){
                view.showCoach(coachFunc.getListCoachsByName(timkiem));
            }
            }
            
            if(index==2){
                if(timkiem!=null||timkiem.equals("")){
                view.showCoach(coachFunc.getListCoachsByGender(timkiem));
            }
            }
            
        }
    }
    public class DeleteHLVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Coach coach = view.getCoachInfo();
            if (coach != null) {
                coachFunc.delete(coach);
                //view.clearCrimeInfo();
                view.showCoach(coachFunc.getListcCoachs());
                view.showMessage("Xóa thành công!");
            }
        }
    }
     class SortHLVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           int index = view.getIndexSort();
           if(index==0){
               coachFunc.sortCoachById();
               List<Coach> coachList = coachFunc.getListcCoachs();
               view.showCoach(coachList);
           }
            if(index==1){
                coachFunc.sortCoachByName();
                List<Coach> coachList = coachFunc.getListcCoachs();
                view.showCoach(coachList);
            }
            
            if(index==2){
                coachFunc.sortCoachByGender();
                List<Coach> coachList = coachFunc.getListcCoachs();
                view.showCoach(coachList);
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
    public class ResetHLVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            coachFunc = new CoachFunc();
            view.showCoach(coachFunc.getListcCoachs());

        }
    }
    class EditHLVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Coach coach = view.getCoachInfo();
            if (coach != null) {
                //visitfunc.edit(crime);
                frame = new FrameForm4(coach);
                EditCoachController controller = new EditCoachController(frame,view);
                controller.showFrame();
//                CrimeView.showCrime(Crime);
//                CrimeView.showListCrimes(CrimeDao.getListCrimes());
//                CrimeView.showMessage("Cập nhật thành công!");
            }
        }
    }
}
