/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectagenda;

/**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class AgendaPrinc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Construcción de la agenda.
        
        Agenda a = new Agenda ();
        Cita c1 = new Cita (new Reloj(12,30), new Reloj(13), "Madrid", "POO", "Alta");
        Cita c2 = new Cita (new Reloj(13,30), new Reloj(14), "Valencia", "BD", "Baja");
        a.aniadirCita(c1);
        a.aniadirCita(c2);
        a.aniadirCita(new Reloj(15,20), new Reloj(16), "Barcelona", "TALF");
        
        //Prueba de métodos.
        
        System.out.println(a.mostrarAgenda());
        
        System.out.println(a.mostrarCita(new Reloj(15,10)));
        System.out.println(a.mostrarCita("PO"));
        
        a.existeCita(new Reloj(15,20));
        a.existeCita(new Reloj(12,14));
       
        System.out.println(a.posicionCita(new Reloj(12,30)));
        System.out.println(a.posicionCita(new Reloj(15)));
        
        System.out.println(a.idCita(new Reloj(15,20)));
        
        a.eliminarCita(new Reloj(12,30));
        
        a.mostrarAgenda();
        
        a.getAgenda().clear();
        
        a.mostrarAgenda();
               
    }
}
