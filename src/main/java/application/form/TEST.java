/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application.form;

import application.entity.GymerMember;
import java.awt.event.ActionListener;

/**
 *
 * @author Le Van Phong Tu
 */
public class TEST extends javax.swing.JFrame {

    /**
     * Creates new form TEST
     */
    public TEST(GymerMember gym) {
        initComponents(gym);
	this.gym = gym;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(GymerMember gym) {

        form11 = new application.form.Form1();
	form11.setGymerInfo(gym);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(form11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public void addListennerEdit(ActionListener listener){

        form11.addAddGymerListener(listener);
    }
    public GymerMember getCrimeInfo(){
        return form11.getGymerInfo();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private application.form.Form1 form11;
    private GymerMember gym;
    // End of variables declaration//GEN-END:variables
}