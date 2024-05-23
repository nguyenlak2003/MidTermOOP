
package application.view;

import application.entity.User;
import application.func.UserFunc;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import raven.popup.GlassPanePopup;
import raven.toast.Notifications;
/**
 *
 * @author Admin
 */
public class Home extends JFrame{

    public Home() {
        //GlassPanePopup.install(home);
        
        initComponents();
        setSize(new Dimension(1366, 768));
        setLocationRelativeTo(null);
        
        this.loginForm = new LoginForm();
        this.userDao = new UserFunc();
        this.mainForm = new MainForm();
        
        loginForm.addActionListener(new LoginListener());
        setContentPane(loginForm);
        Notifications.getInstance().setJFrame(this);
    }
    
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setUndecorated(true);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        pack();
    }
    
    public static void setSelectedMenu(int index, int subIndex) {
        home.mainForm.setSelectedMenu(index, subIndex);
    }
    
    public static void showForm(Component component) {
        component.applyComponentOrientation(home.getComponentOrientation());
        home.mainForm.showForm(component);
    }
    
    public static void logout() {
        FlatAnimatedLafChange.showSnapshot();
        home.setContentPane(home.loginForm);
        home.loginForm.applyComponentOrientation(home.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(home.loginForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void main(String args[]) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("theme");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            home = new Home();
            home.setVisible(true);
        });
    }
    
    private static Home home;
    private final LoginForm loginForm;
    private UserFunc userDao;
    private final MainForm mainForm;
    
    class LoginListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            User user = loginForm.getUser();
       
            if(userDao.checkUser(user)){
                FlatAnimatedLafChange.showSnapshot();
                mainForm.applyComponentOrientation(getComponentOrientation());
                setSelectedMenu(0, 0);
                mainForm.hideMenu();
                setContentPane(mainForm);
                SwingUtilities.updateComponentTreeUI(mainForm);
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            }
            else{
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Username or Password is incorrect");
            }
        }
    }
}
