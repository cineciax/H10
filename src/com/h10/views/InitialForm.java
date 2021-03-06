/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.h10.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.h10.connection.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *Clase de la ventana InitialForm
 * @see JFrame
 * @author PC-10
 */
public class InitialForm extends javax.swing.JFrame {
    /**
     * INITIAL_FORM es la variable que almacena la instancia de la ventana
     */
    public static JFrame INITIAL_FORM=null;
    int valor=0;
    Timer tm=null;
    /**
     * Constructor privado de la clase
     */
    private InitialForm() {
      
        /*
        //Conexion a la bd
        Connection con=new Conexion().getConnection();
        if(con!=null){
        JOptionPane.showMessageDialog(null,"Conexiion exitosa");
            //ejemplo de consulta
            try {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from users");
                while (rs.next()) {                    
                    int id=rs.getInt("id_usuario");
                    String nombre=rs.getString("nombre");
                    JOptionPane.showMessageDialog(null,"Conexiion exitosa "+nombre);
                }
            } catch (Exception e) {
            }
        }else{
        JOptionPane.showMessageDialog(null,"Conexiion desastrosa");
        }
        
        */
        
        
        setTitle("H10");
        setSize(700,650);
        setPreferredSize(new Dimension(700,650));
        setBackground(Color.white);
        JPanel pn=new JPanel();
        pn.setBackground(Color.WHITE);
        setContentPane(pn);
        setUndecorated(false);
        
        /*ImageIcon ImageIcon = new ImageIcon(getClass().getResource("com/h10/resources/images/logo.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);*/
        initComponents();
        progress.setStringPainted(true);
        //progress.setOrientation(Orientation.HORIZONTAL);
        setLocationRelativeTo(null);

        
        ActionListener accion=new ActionListener(){
                public void actionPerformed(ActionEvent e){
                if(valor==100){
                 TimerEvento();
                 tm.stop();}
                else{
                 valor+=5;
                 progress.setValue(valor);
                }
            }
       
        };
        tm=new Timer(500,accion);
        tm.start();
    }
    /**
     * Este metodo se ejecuta en el timer que controla el pase a la siguiente ventana
     */
    public void TimerEvento(){
        JFrame mf=MainForm.getInstance();
        mf.setVisible(true);
        this.setVisible(false);
        
    }
    
    /**
     * retorna la instancia de la ventana si ha sido creada sino regresa null
     * @return JFrame Instancia de la ventana
     */
    public static JFrame getInstance(){
        if(INITIAL_FORM!=null)
            return INITIAL_FORM;
        else{
            INITIAL_FORM=new InitialForm();
            return INITIAL_FORM;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 574, 590, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/h10/resources/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 240, 260));

        jLabel2.setText("Sistemas H10 ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/h10/resources/images/Twitter.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 50, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/h10/resources/images/Facebook.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 50, 60));

        jLabel5.setText("Siguenos en Twitter");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        jLabel6.setText("Siguenos en Facebook");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
