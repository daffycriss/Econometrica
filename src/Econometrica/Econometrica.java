package Econometrica;

/**
 *
 * @author Μπορότης Βασίλειος
 * @author Ντουλάκης Ευστράτιος
 * @author Ντάφος Χρήστος
 */

import GuiDesign.MainForm;
import java.io.FileNotFoundException;
import java.text.ParseException;
import org.jfree.ui.RefineryUtilities;

public class Econometrica {
    
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Κλήση της βασικής φόρμας GUI της Εφαρμογής
                MainForm mainForm = new MainForm();
                RefineryUtilities.centerFrameOnScreen(mainForm);
                mainForm.setVisible(true);
            }
        });
    }   
}