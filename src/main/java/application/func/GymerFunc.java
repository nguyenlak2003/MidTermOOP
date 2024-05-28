/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.func;

import application.entity.Gym;
import application.entity.GymerMember;
import application.entity.GymerMemberXML;
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
public class GymerFunc {
    private static final String Gymer_FILE_NAME = "gymer.xml";
    private List<GymerMember> listGymers = this.readListGymers();
    
    public GymerFunc() {
//        this.listGymers = readListGymers();
//        if(listGymers == null){
//            listGymers = new ArrayList<GymerMember>();
//        }
    }
    
    public void writeListGymers(List<GymerMember> Gymers) {
        System.out.println("write");
        GymerMemberXML xml = new GymerMemberXML();
        xml.setGymerMember(Gymers);
        FileUtils.writeXMLtoFile("gymer.xml", xml);
    }

    private List<GymerMember> readListGymers() {
        List<GymerMember> list = new ArrayList<>();
        GymerMemberXML xml = (GymerMemberXML) FileUtils.readXMLFile("gymer.xml", GymerMemberXML.class);
        if (xml != null) {
            list = xml.getGymerMember();
        }

        return (List)list;
    }
    
   
    
    public void add(GymerMember gymer) {
        System.out.println("add");
        this.listGymers.add(gymer);
        this.writeListGymers(this.listGymers);
    }
    
    public void edit(GymerMember gymer) {
        int size = this.listGymers.size();
        for(int i = 0; i < size; ++i) {
            if (((GymerMember)this.listGymers.get(i)).getId().equals(gymer.getId())) {
                ((GymerMember)this.listGymers.get(i)).setName(gymer.getName());
                ((GymerMember)this.listGymers.get(i)).setGender(gymer.getGender());
                ((GymerMember)this.listGymers.get(i)).setAddress(gymer.getAddress());
                ((GymerMember)this.listGymers.get(i)).setDob(gymer.getDob());
                ((GymerMember)this.listGymers.get(i)).setPhoneNumber(gymer.getPhoneNumber());
                ((GymerMember)this.listGymers.get(i)).setStartDay(gymer.getStartDay());
                ((GymerMember)this.listGymers.get(i)).setTicket(gymer.getTicket());
                ((GymerMember)this.listGymers.get(i)).setTime(gymer.getTime());
                ((GymerMember)this.listGymers.get(i)).setCoach(gymer.getCoach());
                ((GymerMember)this.listGymers.get(i)).setPrice(gymer.getPrice());
                System.out.println("ngu");
                this.writeListGymers(this.listGymers);
                break;
            }
        }

    }
    
    public boolean delete(GymerMember gymer) {
        boolean isFound = false;
        int size = this.listGymers.size();

        for(int i = 0; i < size; ++i) {
            if (((GymerMember)this.listGymers.get(i)).getId()== gymer.getId()) {
                gymer = (GymerMember)this.listGymers.get(i);
                isFound = true;
                break;
            }
        }

        if (isFound) {
            this.listGymers.remove(gymer);
            this.writeListGymers(this.listGymers);
            return true;
        } else {
            return false;
        }
    }
     
//    public void sortCrimeByName() {
//        Collections.sort(this.listCrimes, new Comparator<Crime>() {
//            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
//            public int compare(Crime Crime1, Crime Crime2) {
//                String[] parts1 = Crime1.getName().split(" ");
//                String[] parts2 = Crime2.getName().split(" ");
//                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
//                    return collator.compare ((parts1[0]),(parts2[0]));
//                }
//                else
//                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
//            }
//        });
//    }
    public void sortGymerByName() {
        Collections.sort(this.listGymers, new Comparator<GymerMember>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(GymerMember gymer1, GymerMember gymer2) {
                String[] parts1 = gymer1.getName().split(" ");
                String[] parts2 = gymer2.getName().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    
    public void sortGymerByCoach() {
        Collections.sort(this.listGymers, new Comparator<GymerMember>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(GymerMember gymer1, GymerMember gymer2) {
                String[] parts1 = gymer1.getCoach().split(" ");
                String[] parts2 = gymer2.getCoach().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    
    public void sortGymerByGender() {
        Collections.sort(this.listGymers, new Comparator<GymerMember>() {
            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
            public int compare(GymerMember gymer1, GymerMember gymer2) {
                String[] parts1 = gymer1.getGender().split(" ");
                String[] parts2 = gymer2.getGender().split(" ");
                if(collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]))==0){
                    return collator.compare ((parts1[0]),(parts2[0]));
                }
                else
                return collator.compare ((parts1[parts1.length-1]),(parts2[parts2.length-1]));
            }
        });
    }
    
    public void sortGymerById() {
        Collections.sort(this.listGymers, new Comparator<GymerMember>() {
            public int compare(GymerMember gymer1, GymerMember gymer2) {
                return gymer1.getId().compareTo(gymer2.getId());
            }
        });
    }
    
    
    public boolean hasGymerMember(String id){
        for(GymerMember i: listGymers){
            if(i.getId().equals(id)) return true;
        }
        return false;
    }
    public List<GymerMember> getListGymers() {
        return this.listGymers;
    }
    
    public List<GymerMember> getListGymersByName(String Name){
        List<GymerMember> result = new ArrayList<>();
        for (GymerMember i: this.listGymers) {
            if(i.getName().contains(Name) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<GymerMember> getListGymersByID(String ID){
        List<GymerMember> result = new ArrayList<>();
        for (GymerMember i: this.listGymers) {
            if(i.getId().contains(ID) ){
                result.add(i);
            }
        }
        return result;
    }
    public List<GymerMember> getListGymersByCoach(String Coach){
        List<GymerMember> result = new ArrayList<>();
        for (GymerMember i: this.listGymers) {
            if(i.getCoach().contains(Coach)){
                result.add(i);
            }
        }
        return result;
    }
     public List<GymerMember> getListGymersByGender(String Gender){
        List<GymerMember> result = new ArrayList<>();
        for (GymerMember i: this.listGymers) {
            if(i.getGender().contains(Gender)){
                result.add(i);
            }
        }
        return result;
    }
    public String getCountGymer(){
        return String.valueOf(this.listGymers.size());
    }
    public void setListGymer(List<GymerMember> listGymers) {
        this.listGymers = listGymers;
    }
    public int tinhTongDoanhthu(){
        int tongTien = 0;
        for(GymerMember x : listGymers){
            tongTien+=x.getPrice();
        }
        return tongTien;
    }
}

