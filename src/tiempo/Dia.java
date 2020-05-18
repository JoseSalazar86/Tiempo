
package tiempo;

import java.util.Scanner;

public class Dia {
    int max;
    int min;
    char estado;
    
    public Dia(){
    max=0;
    min=0;
    estado=' ';
    
    }
    public Dia(int Nmax, int Nmin, char Nestado){
        max=Nmax;
        min=Nmin;
        estado=Nestado;
        
    }
    public Dia(Dia dia1){
    max=dia1.getMax();
    min=dia1.getMin();
    estado=dia1.getEstado();
    
    }
    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public char getEstado() {
        return estado;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private void setEstado(char estado) {
        Scanner sc=new Scanner(System.in);
       while(estado!='s' && estado!='n' && estado!='l'){
            System.out.println("vuelve a introducir un estado valido");
            estado=sc.next().charAt(0);
        }
          this.estado=estado;
    }
    
}