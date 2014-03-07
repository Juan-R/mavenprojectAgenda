/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectagenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

    /**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class Agenda {
    
    //Atributos
    
    private ArrayList <Cita> agenda;
    private Iterator <Cita> it;  
    private final int SEGUNDOS_DIA = 86400;
    
    //Constructores   
    
    public Agenda () {
        
        //Crea una agenda totalmente nueva.
        
        this.agenda = new ArrayList <Cita> ();
        
    }
    
    public Agenda (ArrayList <Cita> agenda) {
        
        //Crea una agenda a partir de otra ya existente.
        
        this.agenda=agenda;
        
    }
    
    //Métodos
    
    public ArrayList<Cita> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Cita> agenda) {
        this.agenda = agenda;
    }

    public Iterator<Cita> getIt() {
        return it;
    }

    public void setIt(Iterator<Cita> it) {
        this.it = it;
    }
    
    //Devuelve un string para trabajar con la interfaz gráfica.
    
    public boolean esVacia () {
        
        return agenda.isEmpty();
        
    }
    
    public String mostrarAgenda () {
        
        if (agenda.isEmpty()) {
            
            return ("La agenda esta vacia." + "\n" + "Vuelva al menu principal"
                    + " y pulse sobre el boton" + "\n" + "\" Añadir una cita \".");
        }
        
        else {
            
            String todasCitas = "Agenda." + "\n" + "\n";
            Cita c;
            it=agenda.iterator(); //El programa no me deja inicializarlo en la sección de atributos.
    
            while (it.hasNext()) {

                c = it.next();
                todasCitas = todasCitas + c.toString() + "\n";
                    
            }

            todasCitas+=("La agenda tiene " + agenda.size() + " cita(s).");
            
            return todasCitas;
        }
                    
    }

    public String mostrarCita (Reloj horaComienzo) {
          
        Cita c = null; 
        Cita aux = null;
        
        int difAnt = SEGUNDOS_DIA;
        
        it=agenda.iterator();
        
       
        while (it.hasNext()) {
            
            c = it.next();
            int dif = c.getHoraComienzo().diferenciaHoraria(horaComienzo);
            if ( (dif>=0)&&(dif<difAnt) ){
                    aux=c;
                    difAnt=dif;
                    
            }
        
        }
        
        if (aux==null) {
            return ("No hay ninguna cita que se ajuste a la busqueda.");
        }
        else {
            return (aux.toString());
        }
           
    }
    
    public String mostrarCita (String asunto) {
    
        Cita c = null;
        it=agenda.iterator();
        boolean formaParte = false;
       
        while ( (it.hasNext()) && (!formaParte) ) {
            
            c = it.next();
            formaParte = (c.getAsunto().contains(asunto));
        
        }
        
        if (formaParte) {
            return (c.toString());
        }   
        else {   
            return ("No hay ninguna cita que se ajuste a la busqueda.");
        }   

    }
    
    public boolean existeCita (Reloj horaComienzo) {
        
        /* He modificado el método existeCita, para que, además de comprobar
        si existe una determinada cita, muestre un mensaje por pantalla certificándolo */
        
        //Buscador
        
        Cita c = null;
        this.it=agenda.iterator();
        boolean encontrada = false;
       
        while ( (it.hasNext()) && (!encontrada) ) {
            
            c = it.next();
            encontrada = (c.getHoraComienzo().esIgualA(horaComienzo));
        
        }
        
        //Buscador
        
        return encontrada;
   
    }
    
    public int posicionCita (Reloj horaComienzo) {
        
        /* Esta parte del algoritmo (Buscador) se repite en varios métodos de la clase, pero
        prefiero no meterla en un método aparte para evitar problemas con punteros */
        
        Cita c = null;
        this.it=agenda.iterator();
        boolean encontrada = false;
       
        while ( (it.hasNext()) && (!encontrada) ) {
            
            c = it.next();
            encontrada = (c.getHoraComienzo().esIgualA(horaComienzo));
        
        }
        
        return(encontrada?this.agenda.indexOf(c):-1);
 
    }
    
    public int idCita (Reloj horaComienzo) {
        
        Cita c = null;
        this.it=agenda.iterator();
        boolean encontrada = false;
       
        while ( (it.hasNext()) && (!encontrada) ) {
            
            c = it.next();
            encontrada = (c.getHoraComienzo().esIgualA(horaComienzo));
        
        }
                
        return(encontrada?c.getId():-1); 
    
    }
    
    public void aniadirCita (Cita cita) {
    
        this.agenda.add(cita);
    
    }
    
    public void aniadirCita (Reloj horaComienzo, String asunto) {
   
        this.agenda.add(new Cita (horaComienzo, asunto)); 
    
    }
    
    public void aniadirCita (Reloj horaComienzo, Reloj horaFin, String lugar, String asunto) {
        
        this.agenda.add(new Cita (horaComienzo, horaFin, lugar, asunto, "Normal"));
    
    }
    
    public void eliminarCita (Reloj horaComienzo) {
    
        Cita c = null;
        this.it=agenda.iterator();
        boolean encontrada = false;
       
        while ( (it.hasNext()) && (!encontrada) ) {
            
            c = it.next();
            encontrada = (c.getHoraComienzo().esIgualA(horaComienzo));
        
        }
        
    }
    private static final Logger LOG = Logger.getLogger(Agenda.class.getName()); 
    
}
