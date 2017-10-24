/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.h10.views;

import com.h10.vo.prueba;
import com.model.dao.ProjectModel;
import java.awt.Color;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

/**
 *clase de la ventana principal
 * @author PC-10
 * @version 1.0
 * 
 */
public class MainForm extends javax.swing.JFrame {

   /**
    * representa la instancia unica de MainForm
    */
   public static JFrame MAIN_FORM=null;
    /**
     * Metodo constructor del formulario principal
     */
    private MainForm(){
        /*ImageIcon ImageIcon = new ImageIcon(getClass().getResource("com/h10/resources/images/logo.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);*/
        setSize(1233,700);
        JPanel pn=new JPanel();
        pn.setBackground(Color.WHITE);
        setContentPane(pn);
        setBackground(new Color(255,255,255));
        setTitle("H10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initComponents();
        
        fillTree();
        /*JButton btn=new JButton("Clickeame");
        btn.setBounds(20,20,100,20);
        pn.add(btn);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbolProyectos = new javax.swing.JTree();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemNuevoProyecto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem3.setText("Nuevo Proyecto");
        jMenuItem3.setActionCommand("");
        jMenuItem3.setName("actionNewProyect"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem1.setText("Eliminar Proyecto");
        jMenuItem1.setName("DeleteProyect"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem4.setText("Actualizar");
        jMenuItem4.setName("refresh"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H10");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1233, 700));
        setPreferredSize(new java.awt.Dimension(1233, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/h10/resources/images/new.png"))); // NOI18N
        jButton2.setToolTipText("Agregar un proyecto");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 2, 1230, 30));

        arbolProyectos.setComponentPopupMenu(jPopupMenu1);
        arbolProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolProyectosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbolProyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 590));

        desktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1000, 620));

        jMenu1.setText("Archivo");

        itemNuevoProyecto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemNuevoProyecto.setText("Nuevo Proyecto");
        itemNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(itemNuevoProyecto);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("AbrirProyecto");
        jMenu1.add(jMenuItem2);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Tools");

        jMenuItem7.setText("Notepad");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Word");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Excel");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("Help Content");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("About");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void itemNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoProyectoActionPerformed
        JFrame npf=NuevoProyectoForm.getInstance();
        npf.setSize(desktopPane.getWidth(), desktopPane.getHeight());
        //desktopPane.add(npf);
        npf.setVisible(true);
    }//GEN-LAST:event_itemNuevoProyectoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JFrame newProyect=NuevoProyectoForm.getInstance();
       newProyect.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // elimina proyecto
       int rpta= aviso("Esta seguro de eliminar el proyecto");
       if(rpta==0){
           mensaje("se acepto");
           DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)arbolProyectos.getSelectionPath().getLastPathComponent();
           DefaultMutableTreeNode parenth=(DefaultMutableTreeNode) selectedNode.getParent();
           parenth.remove(selectedNode);
           DefaultTreeModel modelo=(DefaultTreeModel) arbolProyectos.getModel();
           modelo.reload();
           //reloadTree();
       }else{
           mensaje("se denego");
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void arbolProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolProyectosMouseClicked
        
    // TODO add your handling code here:
        
        //obtener indice apartir del padre
     /*   DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)arbolProyectos.getSelectionPath().getLastPathComponent();
        int indexSelectedNode=selectedNode.getParent().getIndex(selectedNode);
        //obtiene el indice de la fila en general
        TreeSelectionModel model=(TreeSelectionModel)arbolProyectos.getModel();
        int fila= model.getSelectionRows()[0];
        //actualizar un arbol
        DefaultTreeModel modelo=(DefaultTreeModel)arbolProyectos.getModel();
        modelo.reload();*/
     
        TreeSelectionModel model=(TreeSelectionModel)arbolProyectos.getSelectionModel();
        if(arbolProyectos.getSelectionPath()!=null && model.getSelectionRows()[0]!=0 ){
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)arbolProyectos.getSelectionPath().getLastPathComponent();
        
        DatosGeneralProyectoInternalFrame dg=(DatosGeneralProyectoInternalFrame) DatosGeneralProyectoInternalFrame.getInstance();
        
            if(!dg.isVisible()){
            desktopPane.add(dg);
            dg.txtCodigo.setText(selectedNode.toString()+"");
            dg.show();
            }else{
                dg.txtCodigo.setText(selectedNode.toString()+"");
            }
        }
    }//GEN-LAST:event_arbolProyectosMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        reloadTree();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame npf=NuevoProyectoForm.getInstance();
        npf.setSize(desktopPane.getWidth(), desktopPane.getHeight());
        //desktopPane.add(npf);
        npf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * este metodo retorna la instancia actual de la clase mainform
     * @return JFrame
     */
    public static JFrame getInstance(){
        if(MAIN_FORM!=null)
            return MAIN_FORM;
        else{
            MAIN_FORM=new MainForm();
            return MAIN_FORM;
        }
    }
    
    /**
     * rellena el arbolProyectos con los datos extraidos de la base de datos
     */
        public void fillTree(){
            DefaultMutableTreeNode root=new DefaultMutableTreeNode("Proyectos");
            ArrayList<prueba> pruebas=new ProjectModel().List();
            for (int i=0;i<pruebas.size();i++) {
                DefaultMutableTreeNode newnode=new DefaultMutableTreeNode(pruebas.get(i).getNombre());
                root.add(newnode);
               /* for (String subproyecto : subproyectos) {
                DefaultMutableTreeNode newsubnode=new DefaultMutableTreeNode(subproyecto);
                newnode.add(newsubnode);
                }*/
            }
            DefaultTreeModel modelo=new DefaultTreeModel(root);
            arbolProyectos.setModel(modelo);
        }
        /**
         * recarga un arbol actualizando la data que se muestra en el
         */
        public void reloadTree(){
            
            arbolProyectos.setModel(null);
            fillTree();
           /* DefaultTreeModel modelo=(DefaultTreeModel) arbolProyectos.getModel();
            modelo.reload();*/
        }
        /**
         * muestra un mensaje en pantalla
         * @param textoMensaje recibe el parametro texto que ira en el mensaje
         */
        public void mensaje(String textoMensaje){
		JOptionPane.showMessageDialog(this,textoMensaje,"H10",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/com/h10/resources/images/logo ico.png")));
	}
	/**
         * muestra un aviso en pantalla
         * @param textoAviso recibe el texto que ira en el aviso
         * @return devuelve un valor entero que resepresenta la respuesta 
         * <table border="2">
         *  <tr>
         *      <td>Valor</td><td>Significado</td>
         *  </tr>
         *  <tr>
         *      <td>0</td><td>se dio a aceptar ( Si )</td>
         *  </tr>
         *  <tr>
         *      <td>1</td><td>la respuesta fue negativa ( No )</td>
         *  </tr>
         * </table> 
         */
	public int aviso(String textoAviso){
		int seleccion = JOptionPane.showOptionDialog(this,textoAviso,"Alerta",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/com/h10/resources/images/logo ico.png")), new Object[] {"Si", "No"}, "No");
	return seleccion;
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolProyectos;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemNuevoProyecto;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
