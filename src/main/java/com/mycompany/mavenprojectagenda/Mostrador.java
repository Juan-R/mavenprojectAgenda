/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Mostrador.java
 *
 * Created on 26-nov-2011, 14:33:37
 */
package com.mycompany.mavenprojectagenda;

import java.util.logging.Logger;

/**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class Mostrador extends javax.swing.JPanel {

    /** Creates new form Mostrador */
    public Mostrador(String contenido) {
        initComponents();
        this.textoAMostrar.setText(contenido);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textoAMostrar = new javax.swing.JTextArea();

        textoAMostrar.setBackground(new java.awt.Color(156, 237, 231));
        textoAMostrar.setColumns(20);
        textoAMostrar.setEditable(false);
        textoAMostrar.setRows(5);
        jScrollPane1.setViewportView(textoAMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textoAMostrar;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(Mostrador.class.getName());
}
