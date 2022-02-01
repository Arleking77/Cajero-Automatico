/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroauto;

import javax.swing.JOptionPane;

/**
 *
 * @author pmaca
 */
public class Cliente {
       public String Nombre;
    public int Saldo_ctacte;
    public int Monto_depo;
    public int Monto_reti;
    
    public Cliente(String Nombre, int Saldo_ctacte) {
        this.Nombre = Nombre;
        this.Saldo_ctacte = Saldo_ctacte;        
    }   
    
    public void act_Monto_Deposito(int montodepo) {
        Monto_depo+=montodepo;
    }    
    
    public void act_Monto_Retiro(int montoretiro) {
        Monto_reti+= montoretiro ;
    }    
    
    public int Saldo_CtaCte() {
        return  Saldo_ctacte;
    }    
    
    public void mostar_Saldo_Cta_Cte() {
        
        String saldo="--- Saldo Cuenta Corriente --- \n\n\n"+
                        "Su Nombre es : " + Nombre +"\n\n"+
                        "Su Saldo Actual es : " + Saldo_ctacte +"\n\n"+
                        "La Cantidad Depositada es : " + Monto_depo +"\n\n"+
                        "La Cantidad Retirada es : " + Monto_reti +"\n\n";
        JOptionPane.showMessageDialog(null, saldo);    
    }
    
}
