/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;
/**
 * 
 * @author Jose Salazar
 * @version 
 * @see Reloj
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;
    
   public Hora(){
   
       hora=0;
       minuto=0;
       segundo=0;
       
   }
   /**
    * 
    * @param nhora
    * @param nminuto
    * @param nsegundo 
    */
   public Hora(int nhora, int nminuto, int nsegundo){
   
       this.hora=nhora;
       this.minuto=nminuto;
       this.segundo=nsegundo;
       
   }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int nuevaHora) {
        if (nuevaHora>=24) {
            this.hora += nuevaHora-24;
        }else{
            this.hora+=nuevaHora;
        }
        
    }

    public void setMinuto(int nuevoMinuto) {
        if (nuevoMinuto>=60) {
            setHora((nuevoMinuto/60));
            this.minuto=nuevoMinuto%60;
        }else{
                this.minuto=nuevoMinuto;
    }
       
    }
                                    
    public void setSegundo(int nuevoSegundo) {
        //this.segundo = segundo;
        
         if (nuevoSegundo>=60) {
            setMinuto(nuevoSegundo/60);
            this.segundo=nuevoSegundo%60;
        }else{
            this.segundo=nuevoSegundo;
        }
    }
    public void mostrarhora24(){
        System.out.println("son las "+this.hora+"h"+this.minuto+"m"+this.segundo+"s");
        
    }
    public void mostrarhora12(){
        
        
            if (this.hora>=1 && this.hora<=12) {
                System.out.println("son las "+this.hora+"h"+this.minuto+"m"+this.segundo+"s de la mañana");
            }else {
                System.out.println("son las "+(this.hora-12)+"h"+this.minuto+"m"+this.segundo+"s de la tarde");
            }
            
                
    }

}
   
    

