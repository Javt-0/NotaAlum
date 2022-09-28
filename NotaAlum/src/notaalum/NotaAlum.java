
package notaalum;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class NotaAlum {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Dame la nota del alumno:");
        float nota = teclado.nextFloat();
        
        //Nos pide la nota hasta que se introduzca una nota valida
        while(nota<0 || nota>10){
            System.out.print("La nota no es valida ingrese de nuevo:");
            nota = teclado.nextFloat();
        }
        
        //verificamos las nota ingresada
        if(nota>=0 && nota<5){
            System.out.println("El alumno esta suspenso con la nota " + nota);
        }else if(nota == 5){
            System.out.println("El alumno esta aprobado con la nota " + nota);
        }else if(nota>5 && nota<=7){
            System.out.println("El alumno esta aprobado con un bien con la nota " + nota);
        }else if(nota>7 && nota<9){
            System.out.println("El alumno esta aprobado con un notable con la nota " + nota);
        }else if(nota==9 && nota==10){
            System.out.println("El alumno esta aprobado con sobresalienta con la nota " + nota);
        }
    }
    
}
