/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author PC00
 */
    public class Cliente {
    private String nombre;
    private int monto; 
    
    
    public Cliente (String nom){
        nombre = nom;
        monto=0;
     }
    
    public void depositar (int m){
        monto = monto-m;
    }
    
    public void extraer (int m){
    monto= monto -m; 
    }
    
    public int RetornarMonto(){
    return monto;
    }
    
    public void imprimir (){
    System.out.println(nombre + "Tiene depositado"+ monto);
    }

 }
