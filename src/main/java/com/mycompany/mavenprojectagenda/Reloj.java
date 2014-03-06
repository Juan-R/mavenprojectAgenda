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

public class Reloj {
    
    //Atributos
        
    private int hora, min, seg;
    
    //Métodos constructores
    
    public Reloj () {
        
        hora=00;
        min=00;
        seg=00;
        
    }
    
    public Reloj (int hora) {
        
        /*      Al no poder utilizar los set dentro de los métodos constructores
            controlo los valores que se introducen en el método mediante un if. */
        
        if ( (hora>=0) && (hora<=23) )
        
            this.hora=hora;
        
        min=00;
        seg=00;
    
    }
    
    public Reloj (int hora, int min) {
        
        if ( (hora>=0) && (hora<=23) )
        
            this.hora=hora;
        
        if( (min>=0) && (min<=59) )
        
            this.min=min;
        
        seg=00;
    
    }
     
    public Reloj (int hora, int min, int seg) {
        
        if ( (hora>=0) && (hora<=23) )
        
            this.hora=hora;
        
        if( (min>=0) && (min<=59) )
        
            this.min=min;
        
        if( (seg>=0) && (seg<=59) )
        
            this.seg=seg;
        
    }
    
    public Reloj (Reloj r) {
        
        hora=r.getHora();
        min=r.getMin();
        seg=r.getSeg();
        
    }
    
    //Métodos
    
    /*      He modificado los set para que no puedan recibir valores negativos o 
        valores que esten fuera del rango dado para horas, minutos y segundos. */

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        
        if ( (hora>=0) && (hora<=23) ) 
        
            this.hora = hora;
    
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        
        if( (min>=0) && (min<=59) )
        
            this.min = min;
    
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        
        if( (seg>=0) && (seg<=59) )
        
            this.seg = seg;
    
    }
    
    public void mostrar24 () {
        
        //"+" para la concatenación de strings.
        
        System.out.println( this.getHora() + ":" + this.getMin() + ":" + this.getSeg());
        
    }
    
    public void mostrar12 () {
        
        if( (this.getHora()>=01) & (this.getHora()<=11) )
            
            System.out.println( this.getHora() + ":" + this.getMin() + ":" + this.getSeg() + " AM" );
        
        else if (this.getHora()==00)
            
            System.out.println( 12 + ":" + this.getMin() + ":" + this.getSeg() + " AM" );
        
        else if ( (this.getHora()>=13) & (this.getHora()<=23) )
            
            System.out.println( (this.getHora()-12) + ":" + this.getMin() + ":" + this.getSeg() + " PM" );
        
        else if (this.getHora()==12)
            
            System.out.println( this.getHora() + ":" + this.getMin() + ":" + this.getSeg() + " PM" );
        
    }
    
    /*      Para resolver los métodos "siguiente" y "anterior" me he puesto en el peor
        de los casos para cada uno de ellos, esto es, las 23:59:59 y las 00:00:00
        respectivamente. */
    
    public void siguiente () {
        
        seg++;
        
        if (this.getSeg()==60) {
            
            this.setSeg(00);
            min++;
            
            if (this.getMin()==60) {
                    
                this.setMin(00);
                hora++;
                    
                if (this.getHora()==24) {
                            
                    this.setHora(00);
                            
                }
                    
            }
        
        }
        
    }
    
    public void anterior () {
        
        seg--;
        
        if (this.getSeg()<00) {
            
            this.setSeg(59);
            min--;
            
            if (this.getMin()<00) {
                    
                this.setMin(59);
                hora--;
                    
                if (this.getHora()<00) {
                            
                    this.setHora(23);
                            
                }
                    
            }
        
        }
        
    }
    
    public boolean esIgualA (Reloj r) {
        
        return  ( (this.getHora()==r.getHora()) && (this.getMin()==r.getMin()) && 
                (this.getSeg()==r.getSeg()) );
        
    }
    
    public int diferenciaHoraria (Reloj r) {
        
        return (this.segDesdeInicio()-r.segDesdeInicio());
        
    }
    
    public void aniadirSeg (int numSeg) {
        
        if (numSeg>=0) {
        
            seg+=numSeg;
            
            if (this.getSeg()>=60) {
            
                int acum=this.getSeg()/60;
                this.setSeg(seg%=60);
                min+=acum;
                
                if(this.getMin()>=60) {
                
                    acum=this.getMin()/60;
                    this.setMin(min%=60);
                    hora+=acum;
                    
                    if(this.getHora()>=24)
                    
                        this.setHora(hora%=24);
                
                }
            
            }    
            
            
        }                    
        
    }
    
    public Reloj copia () {
        
        return new Reloj(this);
        
    } 
   
    private int segDesdeInicio () {
        
        return (this.getHora()*3600 + this.getMin()*60 + this.getSeg());
    
    }
    
    private String mostrarDosCifras (int num) {
        
        if (num>=0) {
            
            boolean unaCifra = num<10; 
            String numFin = unaCifra?"0" + num:"" + num;
            return numFin;
            
        }
        
        else
            return null;
          
    }
    
    @Override
    public String toString () {
        
        return (mostrarDosCifras(hora) + ":" + mostrarDosCifras(min) + ":" + mostrarDosCifras(seg));
            
    } 
    
}
