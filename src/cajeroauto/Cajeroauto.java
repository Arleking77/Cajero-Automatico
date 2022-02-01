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
public class Cajeroauto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
    
        String nombcliente1="cliente1";
        Cliente clien1 = new Cliente(nombcliente1, 100000);
        String nombcliente2="cliente2";
        Cliente clien2 = new Cliente(nombcliente2, 50000);
        String nombcliente3="cliente3";
        Cliente clien3 = new Cliente(nombcliente3, 20000);
                   
        boolean respuesta = false;
        int opcion, montodepo, montoretiro;        
                
        String menu="--- Cajero Automatico --- \n"
                    + "1.- Depositar Dinero\n"
                    + "2.- Retirar Dinero\n"
                    + "3.- Ver Saldo CTA-CTE\n"
                    + "4.- Salir\n";        
                
        do { 
            
            int claveusuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su clave"+"\n"+"ingrese = 0Salir "));            
            switch (claveusuario) {
                
                case 1:
                respuesta = true;
                if((respuesta == true)) {
                    do {
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
                        switch (opcion) {                
                        case 1: montodepo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Depositar "));                           
                                clien1.Saldo_ctacte = clien1.Saldo_ctacte + montodepo;  
                                clien1.act_Monto_Deposito(montodepo);                            
                                respuesta = true;break;                           
                        case 2: montoretiro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Retirar ")); 
                                if (clien1.Saldo_ctacte >= montoretiro) {
                                    clien1.Saldo_ctacte = clien1.Saldo_ctacte - montoretiro;
                                    clien1.act_Monto_Retiro(montoretiro); 
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                                }
                                respuesta = true;break;                    
                        case 3: clien1.mostar_Saldo_Cta_Cte();                   
                                respuesta = true;break; 
                        case 4: JOptionPane.showMessageDialog(null, "Ingresar otro ID "); 
                                respuesta = false;break;
                        }//fin switch                
                    }while(opcion!=4);             
                }            
                else {
                    JOptionPane.showMessageDialog(null, "clave Invalida");
                }                
                break;
                
                
                
                case 2:
                respuesta = true;
                if((respuesta == true)) {
                    do {
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
                        switch (opcion) {                
                        case 1: montodepo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Depositar "));                           
                                clien2.Saldo_ctacte = clien2.Saldo_ctacte + montodepo;  
                                clien2.act_Monto_Deposito(montodepo);
                                respuesta = true;break;                          
                        case 2: montoretiro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Retirar ")); 
                                if (clien2.Saldo_ctacte >= montoretiro) {
                                    clien2.Saldo_ctacte = clien2.Saldo_ctacte - montoretiro;
                                    clien2.act_Monto_Retiro(montoretiro); 
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                                }
                                respuesta = true;break;                  
                        case 3: clien2.mostar_Saldo_Cta_Cte();                   
                                respuesta = true;break; 
                        case 4: JOptionPane.showMessageDialog(null, "Ingresar otro ID "); 
                                respuesta = false;break;                 
                        }//fin switch               
                    }while(opcion!=4);              
                }            
                else {
                    JOptionPane.showMessageDialog(null, "clave Invalida");
                }          
                break;
                
                
                case 3:
                respuesta = true;
                if((respuesta == true)) {
                    do {
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
                        switch (opcion) {                
                        case 1: montodepo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Depositar "));                           
                                clien3.Saldo_ctacte = clien3.Saldo_ctacte + montodepo;  
                                clien3.act_Monto_Deposito(montodepo);
                                respuesta = true;break;                           
                        case 2: montoretiro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a Retirar ")); 
                                if (clien3.Saldo_ctacte >= montoretiro) {
                                    clien3.Saldo_ctacte = clien3.Saldo_ctacte - montoretiro;
                                    clien3.act_Monto_Retiro(montoretiro); 
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                                }
                                respuesta = true;break;                   
                        case 3: clien3.mostar_Saldo_Cta_Cte();                   
                                respuesta = true;break; 
                        case 4: JOptionPane.showMessageDialog(null, "Ingresar otro ID "); 
                                respuesta = false;break;                 
                        }//fin switch    
                    }while(opcion!=4);              
                }            
                else {
                    JOptionPane.showMessageDialog(null, "clave Invalida");
                }           
                break;
                           
                default:
                break;
                
                case 0: JOptionPane.showMessageDialog(null, "Salir de la Aplicacion"); 
                        respuesta = true;break;                          
               
                
            }
            
        }
        while(!respuesta);       
    }  
}
