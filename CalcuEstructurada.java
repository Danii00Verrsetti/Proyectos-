/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcuestructurada;
import java.util.Scanner;

public class CalcuEstructurada {
float num1, num2, resultado;
static String Operador; 
public void Inicializar (){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dato 1: ");
    num1= teclado.nextFloat ();
    System.out.println("Dato 2: ");
    num2= teclado.nextFloat();
    System.out.print("Operador (+,-,/,*): ");
    Operador = teclado.next();
    
    
        
    }
public void suma (){
    resultado=num1+num2;
    System.out.println("El resultado de la suma es: "+resultado);
}
public void resta (){
    resultado=num1-num2;
    System.out.println("El resultado de la resta es: "+resultado);
}
public void mutiplicación (){
    resultado=num1*num2;
    System.out.println("El resultado de la multuplicación es: "+resultado);
}
public void división (){
    if (num2==0)
        System.out.println("Lo siento, no se puede dividir: ");
    else {
        resultado=num1/num2;
        System.out.println("El resultado de la división es: "+resultado);
    }
}
    public static void main(String[] args) {
       CalcuEstructurada ce= new CalcuEstructurada();
       ce.Inicializar();
       switch (Operador){
           case "+":{
               ce.suma();
               break;
           }
           case "-":{
               ce.resta();
               break;
           }
           case "*":{
               ce.mutiplicación();
               break;
           }
           case "/":{
               ce.división();
               break;
           }
       }
    }
    
}
