/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;
import java.util.Scanner; 

public class Club {
    private Socio socio1, socio2, socio3;
    private Scanner teclado;
    
    private Club (){
        teclado=new Scanner(System.in);
        socio1=new Socio (teclado);
        socio2=new Socio (teclado);
        socio3=new Socio (teclado);
        
    }
    public void MayorAntiguedad(){
        System.out.println("Socio con mayor antiguedad: ");
        if (socio1.RetornarAntiguedad()>socio2.RetornarAntiguedad ()&&
            socio1.RetornarAntiguedad()> socio3.RetornarAntiguedad())
            socio1.imprimir ();
        else 
            if (socio2.RetornarAntiguedad ()>socio3.RetornarAntiguedad () )
                socio2.Imprimir ();
             else 
             socio3.imprimir ();
    }
   
    public static void main(String[] args) {
        Club club1 =new Club ();
        club1.MayorAntiguedad();
        
    }
    
}
