/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MostrarUnaCita.java
 *
 * Created on 22-nov-2011, 20:44:58
 */
package practica6;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class MostrarUnaCita extends javax.swing.JPanel {

    /** Creates new form MostrarUnaCita */
    public MostrarUnaCita() {
        initComponents();        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        busqAsunto = new javax.swing.JButton();
        busqHoraCom = new javax.swing.JButton();

        busqAsunto.setBackground(new java.awt.Color(156, 237, 231));
        busqAsunto.setText("Buscar una cita por asunto");
        busqAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqAsuntoActionPerformed(evt);
            }
        });

        busqHoraCom.setBackground(new java.awt.Color(156, 237, 231));
        busqHoraCom.setText("Buscar una cita por hora de comienzo");
        busqHoraCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqHoraComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(busqAsunto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(busqHoraCom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(busqAsunto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busqHoraCom)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void busqAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqAsuntoActionPerformed
// TODO add your handling code here:
    
    CitaPorAsunto cA = new CitaPorAsunto();
    
    while (cA.extraerAsunto().length()==0 && JOptionPane.showConfirmDialog(this, cA, "Buscar una cita por asunto",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)!=JOptionPane.CANCEL_OPTION)
    
    if(cA.extraerAsunto().length()==0)  
        JOptionPane.showMessageDialog(cA, "Debe introducir un asunto.", "Informacion", WIDTH);
         
     if( AgendaPrincGrafica.agenda.esVacia() )
           
           JOptionPane.showMessageDialog(cA, "La agenda esta vacia.", "Informacion", WIDTH);
     
     else if (cA.extraerAsunto().length()>0){
    
        Mostrador m = new Mostrador (AgendaPrincGrafica.agenda.mostrarCita(cA.extraerAsunto()));    
        JOptionPane.showMessageDialog(cA, m, "Cita buscada", WIDTH);
        
    }    
        
}//GEN-LAST:event_busqAsuntoActionPerformed

private void busqHoraComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqHoraComActionPerformed
// TODO add your handling code here:
    
    CitaPorHoraCom cHC = new CitaPorHoraCom();
        
    if(JOptionPane.showConfirmDialog(this, cHC, "Buscar una cita por hora de comienzo",
    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
    == JOptionPane.OK_OPTION) 
        
         if( AgendaPrincGrafica.agenda.esVacia() )
           
           JOptionPane.showMessageDialog(cHC, "La agenda esta vacia.", "Informacion", WIDTH);
         
         else {
        
        JOptionPane.showMessageDialog(cHC, "Si no hay una cita a esta hora en concreto"
        + "\n" + "se mostrara la siguiente.", "Informacion", WIDTH);
        Mostrador m = new Mostrador (AgendaPrincGrafica.agenda.mostrarCita(cHC.extraerHoraInicio()));
        JOptionPane.showMessageDialog(cHC, m, "Cita buscada", WIDTH); 
         
        }
    
}//GEN-LAST:event_busqHoraComActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton busqAsunto;
    private javax.swing.JButton busqHoraCom;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
