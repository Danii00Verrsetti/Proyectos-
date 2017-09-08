/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodedados;

/**
 *
 * @author PC00
 */
public class JuegoDeDados {
    private dados dado1, dado2, dado3;
    
    public JuegoDeDados (){
        dado1= new dados ();
        dado2= new dados ();
        dado3= new dados ();
    }
    public void Jugar (){
        dado1.tirar();
        dado1.imprimir();
        dado2.tirar();
        dado2.imprimir();
        dado3.tirar();
        dado3.imprimir();
        
        if (dado1.RetornarValor()==dado2.RetornarValor()&&
               dado1.RetornarValor()==dado3.RetornarValor ())
            System.out.println("GANASTE! ");
        else 
            System.out.println("PERDISTE");
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JuegoDeDados j= new JuegoDeDados ();
        j.Jugar();
    }
    
}
