
package tiempo;
import java.util.Scanner;
/**
 * 
 * @author Jose Salazar
 * @version 
 * @see Hora
 */
public class Reloj {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        Hora h1=new Hora();
        int respuesta;
       do{
          System.out.println("Reloj"); 
          System.out.println("------");  
          System.out.println("1. Mostrar hora 12");
          System.out.println("2. Mostrar hora 24");
          System.out.println("3. Modificar horas");
          System.out.println("4. Modificar minutos");
          System.out.println("5. Modificar segundos");
          System.out.println("6. Salir.");
          respuesta=sc.nextInt();
       
          switch(respuesta){
              case 1:h1.mostrarhora12();
                  break;
              case 2:h1.mostrarhora24(); break;
              case 3:h1.setHora(sc.nextInt()); break;
              case 4:h1.setMinuto(sc.nextInt()); break;
              case 5:h1.setSegundo(sc.nextInt()); break;
              case 6: break;
          }
       }while(respuesta!=6);

          
          
    
    
    
            
                   
                           
    }
 
        
}
