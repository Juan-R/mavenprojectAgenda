/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author hp
 */

/*  Nombre del alumno: Juan Guerrero Martín.  
    Grado: Doble Grado en Ingeniería del Software e Ingenieria Informática. */ 

public class Cita {
    
    //Atributos
    
    private Reloj horaComienzo;
    private Reloj horaFin;
    private String lugar;
    private String asunto;
    private String prioridad;
    private int id;
    private static int cont;
    
    //Constructores
    
    public Cita(Reloj horaComienzo, Reloj horaFin, String lugar,
            String asunto, String prioridad) {
        
        this.horaComienzo=horaComienzo;
        this.horaFin=horaFin;
        this.lugar=lugar;
        this.asunto=asunto;
        this.prioridad=prioridad;
        cont++;
        this.id=cont;
            
    }
       
    public Cita (Reloj horaComienzo, String asunto) {
        
        this(horaComienzo, new Reloj(23,59,59), null, asunto, "Normal");
    
    }
    
    //Metodos

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Reloj getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(Reloj horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public Reloj getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Reloj horaFin) {
        this.horaFin = horaFin;
    }

    public int getId() {
        return id;
    }
    
    /* En teoría, no debería poder usarse este set, ya que, los id de Cita
    se asignan automáticamente con el constructor
    
    public void setId(int id) {
        this.id = id;
    } 
     
    */

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        
        if ( (prioridad.equalsIgnoreCase("Baja")) | (prioridad.equalsIgnoreCase("Alta")) | (prioridad.equalsIgnoreCase("Normal")) ) 
            this.prioridad=prioridad; 
    }
     
    @Override
    public String toString () {
    
        return ("ID: " + id + "\n"
                +"Hora de comienzo: " + horaComienzo.toString() + "\n"
                + "Hora de fin: " + horaFin.toString() + "\n"
                + "Lugar: " + lugar + "\n"
                + "Asunto: " + asunto + "\n"
                + "Prioridad: " + prioridad + "\n");
    
    }    
    
}
