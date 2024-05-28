/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.func;

import application.entity.Coach;

import application.entity.Gym;
import application.untils.FileUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Le Van Phong Tu
 */
public class CoachFunc {
    private static final String Coach_FILE_NAME = "Coach.xml";
    private List<Coach> listCoaches = this.readListCoaches();

    public CoachFunc() {
        this.listCoaches = readListCoaches();
        if(listCoaches == null){
            listCoaches = new ArrayList<Coach>();
        }
    }
    
   
    
     public void writeListCoaches(List<Coach> Coaches) {
        Gym gym = new Gym();
        gym.setCoach(Coaches);
        FileUtils.writeXMLtoFile(Coach_FILE_NAME, gym);
    }
    
    public List<Coach> readListCoaches() {
        List<Coach> list = new ArrayList();
        Gym gym = (Gym)FileUtils.readXMLFile(Coach_FILE_NAME, Gym.class);
        if (gym != null) {
            list = gym.getCoach();
        }

        return (List)list;
    }
    public void add(Coach coach) {
        System.out.println("add");
        this.listCoaches.add(coach);
        this.writeListCoaches(this.listCoaches);
    }

    public void edit(Coach coach) {
        int size = this.listCoaches.size();
        for(int i = 0; i < size; ++i) {
            if (((Coach)this.listCoaches.get(i)).getMaCoach().equals(coach.getMaCoach())) {
                ((Coach)this.listCoaches.get(i)).setName(coach.getName());
                ((Coach)this.listCoaches.get(i)).setGender(coach.getGender());
                ((Coach)this.listCoaches.get(i)).setDob(coach.getDob());
                ((Coach)this.listCoaches.get(i)).setAddress(coach.getAddress());
                ((Coach)this.listCoaches.get(i)).setPhoneNumber(coach.getPhoneNumber());
                ((Coach)this.listCoaches.get(i)).setRentMoney(coach.getRentMoney());
                ((Coach)this.listCoaches.get(i)).setSalary(coach.getSalary());
                System.out.println("ngu");
                this.writeListCoaches(this.listCoaches);
                break;
            }
        }

    }

    public boolean delete(Coach coach) {
        boolean isFound = false;
        int size = this.listCoaches.size();

        for(int i = 0; i < size; ++i) {
            if (((Coach)this.listCoaches.get(i)).getMaCoach()== coach.getMaCoach()) {
                coach = (Coach)this.listCoaches.get(i);
                isFound = true;
                break;
            }
        }

        if (isFound) {
            this.listCoaches.remove(coach);
            this.writeListCoaches(this.listCoaches);
            return true;
        } else {
            return false;
        }
    }

    public void sortCoachByName() {
        Collections.sort(this.listCoaches, new Comparator<Coach>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(Coach Coach1, Coach Coach2) {
                String[] parts1 = Coach1.getName().split(" ");
                String[] parts2 = Coach2.getName().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    public void sortCoachById() {
        Collections.sort(this.listCoaches, new Comparator<Coach>() {
            public int compare(Coach Coach1, Coach Coach2) {
                return Coach1.getMaCoach().compareTo(Coach2.getMaCoach());
            }
        });
    }
    public void sortCoachByGender() {
        Collections.sort(this.listCoaches, new Comparator<Coach>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(Coach Coach1, Coach Coach2) {
                String[] parts1 = Coach1.getGender().split(" ");
                String[] parts2 = Coach2.getGender().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    
    
    public List<Coach> getListcCoachs() {
        return this.listCoaches;
    }
    public List<Coach> getListCoachsByID(String Id){
        List<Coach> result = new ArrayList<>();
        for (Coach i: this.listCoaches) {

                if(i.getMaCoach().contains(Id) ){
                    result.add(i);
                    //System.out.println(Id);
                }
        }
        return result;
    }
    public List<Coach> getListCoachsByName(String Name){
        List<Coach> result = new ArrayList<>();
        for (Coach i: this.listCoaches) {
            if(i.getName().contains(Name) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<Coach> getListCoachsByBirth(String Birth){
        List<Coach> result = new ArrayList<>();
        for (Coach i: this.listCoaches) {
            if(i.getDob().contains(Birth) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<Coach> getListCoachsByGender(String Gen){
        List<Coach> result = new ArrayList<>();
        for (Coach i: this.listCoaches) {
            if(i.getGender().contains(Gen)){
                result.add(i);
            }
        }
        return result;
    }
    public String getCountCoach(){
        return String.valueOf( this.listCoaches.size());
    }
    public void setListCoaches(List<Coach> listCoaches) {
        this.listCoaches = listCoaches;
    }
    
    public boolean hasCoach(String coach){
        for(Coach i: listCoaches){
            if(i.getName().equals(coach)) return true;
        }
        return false;
    }
    public int tinhTien(String coach){
        int tien = 0;
        for(Coach i : listCoaches){
            if(i.getName().equals(coach)){
                tien = i.getRentMoney();
            }
        }
        return tien;
    }
    public int tongTienLuongHLV(){
        int tien = 0;
        for(Coach i : listCoaches){
            tien+=i.getSalary();
        }
        return tien;
    }
    
    
    
}
