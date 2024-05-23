/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.view.other;

import java.awt.Component;
import javax.accessibility.AccessibleContext;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


/**
 *
 * @author San
 */
public class TableRenderer extends DefaultTableCellRenderer{

    public TableRenderer(Color c1, Color c2) {
        this.c1 = c1;
        this.c2 = c2;
        setOpaque(false);
    }

    public TableRenderer() {
        this(Color.decode("#3f4041"), Color.decode("#a8a8ad"));
    }

    
    private Color c1,c2;
    private int x, w;
    private boolean selectedCheck;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component _component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Rectangle cellRec = table.getCellRect(row, column, true);
        x =- cellRec.x;
        w=table.getWidth()-cellRec.x;
        this.selectedCheck=isSelected;
        return _component;
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g.create();
        if(selectedCheck){
            g2.setPaint(new GradientPaint(x ,0 ,c1,w ,0 ,c2));
            g2.fill(new Rectangle2D.Double(0 ,0 ,getWidth() ,getHeight()));
        }
      
        g2.dispose(); 
        super.paintComponent(g);
        
    }
   
}
