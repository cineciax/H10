/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.h10.setup;

import com.h10.views.*;
import javax.swing.JFrame;
import javax.swing.UIManager;
//import com.jtattoo.plaf.mcwin.McWinLookAndFeel

/**
 *
 * @author PC-10
 */
public class H10 {

    public static void main(String[] args) {
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            
            // start application
             JFrame iform=InitialForm.getInstance();
             iform.setVisible(true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
       
    }
    
}
