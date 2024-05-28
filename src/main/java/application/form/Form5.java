/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package application.form;

import application.entity.Employee;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Le Van Phong Tu
 */
public class Form5 extends javax.swing.JPanel {

    /**
     * Creates new form Form5
     */
    public Form5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonReset = new application.swing.ButtonForm();
        buttondone = new application.swing.ButtonForm();
        texttypenv = new application.swing.TextFielInForm();
        textaddressnv = new application.swing.TextFielInForm();
        genderboxnv = new application.swing.Combobox();
        textsdtnv = new application.swing.TextFielInForm();
        textidnv = new application.swing.TextFielInForm();
        textsalarynv = new application.swing.TextFielInForm();
        textnamenv = new application.swing.TextFielInForm();
        textdobnv = new application.swing.TextFielInForm();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN NHÂN VIÊN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 32, 842, 55));

        buttonReset.setBackground(new java.awt.Color(203, 102, 0));
        buttonReset.setForeground(new java.awt.Color(255, 255, 255));
        buttonReset.setText("RESET");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jPanel2.add(buttonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 140, 50));

        buttondone.setBackground(new java.awt.Color(203, 102, 0));
        buttondone.setForeground(new java.awt.Color(255, 255, 255));
        buttondone.setText("DONE");
        buttondone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondoneActionPerformed(evt);
            }
        });
        jPanel2.add(buttondone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 140, 50));

        texttypenv.setLabelText("Đối tượng");
        texttypenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttypenvActionPerformed(evt);
            }
        });
        jPanel2.add(texttypenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 240, -1));

        textaddressnv.setLabelText("Địa chỉ");
        textaddressnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textaddressnvActionPerformed(evt);
            }
        });
        jPanel2.add(textaddressnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 240, -1));

        genderboxnv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ", "Khác" }));
        genderboxnv.setLabeText("Giới tính");
        genderboxnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxnvActionPerformed(evt);
            }
        });
        jPanel2.add(genderboxnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 90, 50));

        textsdtnv.setLabelText("Số điện thoại");
        textsdtnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsdtnvActionPerformed(evt);
            }
        });
        jPanel2.add(textsdtnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 240, -1));

        textidnv.setLabelText("ID");
        textidnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidnvActionPerformed(evt);
            }
        });
        jPanel2.add(textidnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, -1));

        textsalarynv.setLabelText("Lương");
        textsalarynv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsalarynvActionPerformed(evt);
            }
        });
        jPanel2.add(textsalarynv, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 240, -1));

        textnamenv.setLabelText("Họ và tên");
        textnamenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnamenvActionPerformed(evt);
            }
        });
        jPanel2.add(textnamenv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 390, -1));

        textdobnv.setLabelText("Ngày sinh");
        textdobnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdobnvActionPerformed(evt);
            }
        });
        jPanel2.add(textdobnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 260, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttondoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttondoneActionPerformed

    private void texttypenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttypenvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttypenvActionPerformed

    private void textaddressnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textaddressnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textaddressnvActionPerformed

    private void genderboxnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxnvActionPerformed

    private void textsdtnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsdtnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textsdtnvActionPerformed

    private void textidnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidnvActionPerformed

    private void textsalarynvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsalarynvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textsalarynvActionPerformed

    private void textnamenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnamenvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnamenvActionPerformed

    private void textdobnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdobnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdobnvActionPerformed

    public void setEmployeeInfo(Employee employee){
        textidnv.setText(employee.getMaNV());
        textnamenv.setText(employee.getName());
        if(employee.getGender().equals("Nam")){
            genderboxnv.setSelectedIndex(0);
        }
        if(employee.getGender().equals("Nữ")){
            genderboxnv.setSelectedIndex(1);
        }
        if(employee.getGender().equals("Khác")){
            genderboxnv.setSelectedIndex(2);
        }
        textdobnv.setText(employee.getDob());
        textaddressnv.setText(employee.getAddress());
        textsdtnv.setText(employee.getPhoneNumber());
        texttypenv.setText(employee.getType());
        textsalarynv.setText(String.valueOf(employee.getSalary()));
        
    }
    private boolean validateID() {
        
        String id = textidnv.getText();
        if (id == null || "".equals(id.trim())) {
            textidnv.requestFocus();
            showMessage("ID không được trống.");
            return false;
        }
        
        return true;
    }
    private boolean validateName() {
        String name = textnamenv.getText();
        if (name == null || "".equals(name.trim())) {
            textnamenv.requestFocus();
            showMessage("Tên không được trống");
            return false;
        }
        return true;
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private boolean validateGender() {
        int gen = genderboxnv.getSelectedIndex();
        if (gen==-1) {
            genderboxnv.requestFocus();
            showMessage("Chưa chọn giới tính");
            return false;
        }
        return true;
    }
    private boolean validateDob() {
        String dob = textdobnv.getText();
        if (dob == null || "".equals(dob.trim())) {
            textdobnv.requestFocus();
            showMessage("Tên không được trống");
            return false;
        }
        return true;
    }
    private boolean validateAddress() {
        String address = textaddressnv.getText();
        if (address == null || "".equals(address.trim())) {
            textaddressnv.requestFocus();
            showMessage("Địa chỉ không được trống.");
            return false;
        }
        
        return true;
    }
    private boolean validatePhone() {
        String phone = textsdtnv.getText();
        if (phone == null || "".equals(phone.trim())) {
            textsdtnv.requestFocus();
            showMessage("Số điện thoại không được trống.");
            return false;
        }
        return true;
    }
    
    
    
    public Employee getEmployeeInfo() {
        // validate student
        if (!validateID()|| !validateName()|| !validateGender()|| !validateDob()||!validateAddress()||!validatePhone()) {
            return null;
        }
        try {
            Employee employee = new Employee();
            employee.setMaNV(textidnv.getText());
            employee.setName(textnamenv.getText());
            employee.setGender(genderboxnv.getItemAt( genderboxnv.getSelectedIndex()).toString());
            employee.setDob(textdobnv.getText());
            employee.setAddress(textaddressnv.getText());
            employee.setPhoneNumber(textsdtnv.getText());
            employee.setType(texttypenv.getText());
            
            employee.setSalary(Integer.parseInt( textsalarynv.getText().trim()));
            
            return employee;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }
     
    public void resetField(){
        
        
        textidnv.setText("");
        textnamenv.setText("");
        genderboxnv.setSelectedIndex(-1);
        textdobnv.setText("");
        textsdtnv.setText("");
        textaddressnv.setText("");
        texttypenv.setText("");
        textsalarynv.setText("");
    }
    public void addAddEmployeeListener(ActionListener listener) {
        System.out.println("do");
        buttondone.addActionListener(listener);
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private application.swing.ButtonForm buttonReset;
    private application.swing.ButtonForm buttondone;
    private application.swing.Combobox genderboxnv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private application.swing.TextFielInForm textaddressnv;
    private application.swing.TextFielInForm textdobnv;
    private application.swing.TextFielInForm textidnv;
    private application.swing.TextFielInForm textnamenv;
    private application.swing.TextFielInForm textsalarynv;
    private application.swing.TextFielInForm textsdtnv;
    private application.swing.TextFielInForm texttypenv;
    // End of variables declaration//GEN-END:variables
}
