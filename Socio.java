/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;
import java.util.Scanner;
/**
 *
 * @author PC00
 */
public class Socio {
    private String nombre;
    private int antiguedad;
    
    public Socio (Scanner teclado){
        System.out.println("Ingrese el nombre de socio: ");
        nombre=teclado.next ();
        System.out.println("Ingrese la antiguedad: ");
        antiguedad=teclado.nextInt();
    }
    public void Imprimir (){
        System.out.println(nombre + 
                "tiene antiguedad de "+ antiguedad);
    }
    public int RetornarAntiguedad(){
        return antiguedad;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
