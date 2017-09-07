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
public class Banco {
private Cliente cliente1, cliente2, cliente3;
public Banco (){
    cliente1 = new Cliente ("Juan");
    cliente2 = new Cliente ("Maria");
    cliente3 = new Cliente ("Pedro");
    
}
public void Operar(){
    cliente1.depositar(100);
    cliente2.depositar(150);
    cliente3.depositar(200);
    cliente3.extraer(150);
}
public void DepositosTotales (){
    int t = cliente1.RetornarMonto()+
            cliente2.RetornarMonto()+
            cliente3.RetornarMonto();
            System.out.println("Total dinero en el banco: "+t);
    cliente1.imprimir();
    cliente2.imprimir ();
    cliente3.imprimir ();
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco1 = new Banco ();
        banco1.Operar ();
        banco1.DepositosTotales ();
        
    }
    
}
