/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelAgendaReal.java
 *
 * Created on 22-nov-2011, 17:35:07
 */
package practica6;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class AgendaPrincGrafica extends javax.swing.JFrame {
    
    /* Hago que agenda sea un atributo de clase para poder acceder a él
    desde otras clases. */
    
    static Agenda agenda = new Agenda();
    
    /** Creates new form PanelAgendaReal */
    
    public AgendaPrincGrafica() {
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

        jComboBox1 = new javax.swing.JComboBox();
        panelAgenda = new javax.swing.JPanel();
        mostrarTodasCitas = new javax.swing.JButton();
        mostrarCita = new javax.swing.JButton();
        aniadirCita = new javax.swing.JButton();
        cancelarCita = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de citas");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        panelAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda de citas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N

        mostrarTodasCitas.setBackground(new java.awt.Color(156, 237, 231));
        mostrarTodasCitas.setText("Mostrar todas las citas");
        mostrarTodasCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTodasCitasMouseClicked1(evt);
                mostrarTodasCitasMouseClicked(evt);
            }
        });
        mostrarTodasCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodasCitasActionPerformed(evt);
            }
        });

        mostrarCita.setBackground(new java.awt.Color(156, 237, 231));
        mostrarCita.setText("Mostrar una cita");
        mostrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCitaActionPerformed(evt);
            }
        });

        aniadirCita.setBackground(new java.awt.Color(156, 237, 231));
        aniadirCita.setText("Añadir una cita");
        aniadirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirCitaActionPerformed(evt);
            }
        });

        cancelarCita.setBackground(new java.awt.Color(156, 237, 231));
        cancelarCita.setText("Cancelar una cita");
        cancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgendaLayout = new javax.swing.GroupLayout(panelAgenda);
        panelAgenda.setLayout(panelAgendaLayout);
        panelAgendaLayout.setHorizontalGroup(
            panelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarTodasCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadirCita, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelAgendaLayout.setVerticalGroup(
            panelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mostrarTodasCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aniadirCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarCita)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(panelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

private void cancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCitaActionPerformed
// TODO add your handling code here:
    
    CitaPorHoraCom cC = new CitaPorHoraCom();
    
    if(JOptionPane.showConfirmDialog(this, cC, "Cancelar una cita",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
        == JOptionPane.OK_OPTION) {
        
        
        
        if( agenda.esVacia() )
           
           JOptionPane.showMessageDialog(cC, "La agenda esta vacia.", "Informacion", WIDTH);
       
        else if ( agenda.existeCita(cC.extraerHoraInicio()) ) {
            
            JOptionPane.showMessageDialog(cC, "En caso de que haya citas con la misma hora"
            + "\n" + "se borrara la primera referencia.", "Informacion", WIDTH); 
            agenda.eliminarCita(cC.extraerHoraInicio());
            JOptionPane.showMessageDialog(cC, "La cita ha sido eliminada con exito de la agenda.", "Eliminacion completada con exito", WIDTH);
            
        }
        else {
            
           JOptionPane.showMessageDialog(cC, "La cita no existe o no se ha escrito la hora debidamente"
                   + "\n" + "(Se ha de escribir de forma completa).", "Error", JOptionPane.WARNING_MESSAGE);
                    
        }       
    }
}//GEN-LAST:event_cancelarCitaActionPerformed

private void aniadirCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirCitaActionPerformed
// TODO add your handling code here:
    
    CitaCompleta aC = new CitaCompleta();  
    boolean antiErrores= !( (aC.extraerAsunto().length()>0) & (aC.extraerHoraFin().diferenciaHoraria(aC.extraerHoraInicio())>=0) );
    
    while ( antiErrores && JOptionPane.showConfirmDialog(this, aC, "Añadir una cita", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)!=JOptionPane.CANCEL_OPTION){
    
        antiErrores= !( (aC.extraerAsunto().length()>0) & (aC.extraerHoraFin().diferenciaHoraria(aC.extraerHoraInicio())>=0) );
        
        if (antiErrores)  
            JOptionPane.showMessageDialog(aC, "Falta el asunto o la hora de fin es menor que la de inicio.", "Informacion", WIDTH);
    
    }
    
    if (!antiErrores)
        agenda.aniadirCita(aC.extraerCita());
    
}//GEN-LAST:event_aniadirCitaActionPerformed

private void mostrarTodasCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodasCitasActionPerformed
// TODO add your handling code here:
    
    //Llama al constructor del JPanel MostrarTodasCitas con el método mostrarAgenda
    //de la clase Agenda como parámetro.
    
    Mostrador mTC = new Mostrador(agenda.mostrarAgenda());
    
    if(JOptionPane.showConfirmDialog(this, mTC, "Mostrar todas las citas",
        JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE)
        == JOptionPane.OK_OPTION) {}

}//GEN-LAST:event_mostrarTodasCitasActionPerformed

private void mostrarTodasCitasMouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTodasCitasMouseClicked1
// TODO add your handling code here:
}//GEN-LAST:event_mostrarTodasCitasMouseClicked1

private void mostrarTodasCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTodasCitasMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_mostrarTodasCitasMouseClicked

private void mostrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCitaActionPerformed
// TODO add your handling code here:
    
    MostrarUnaCita mC = new MostrarUnaCita();
    
    if(JOptionPane.showConfirmDialog(this, mC, "Mostrar una cita",
        JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE)
        == JOptionPane.OK_OPTION) {
        
    }
     
}//GEN-LAST:event_mostrarCitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendaPrincGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaPrincGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaPrincGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaPrincGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new AgendaPrincGrafica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadirCita;
    private javax.swing.JButton cancelarCita;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton mostrarCita;
    private javax.swing.JButton mostrarTodasCitas;
    private javax.swing.JPanel panelAgenda;
    // End of variables declaration//GEN-END:variables
}
