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
public class dados {
    private int valor;
    public void tirar (){
        valor =1 +(int)(Math.random()*6);
        }
    public void imprimir (){
        System.out.println("El valor del dado es: "+valor);
    }
    public int RetornarValor (){
        return valor;
    }
}
    

