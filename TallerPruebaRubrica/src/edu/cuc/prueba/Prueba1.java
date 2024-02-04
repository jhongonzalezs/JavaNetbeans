/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.prueba;

import edu.cuc.clases.Banco;
import edu.cuc.clases.Cuenta;

/**
 *
 * @author FAMILIA ALARCON MOZO
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(123, 120, "Juan");
        Cuenta cuenta2 = new Cuenta(321, 100, "Mario");
        Cuenta cuenta3 = new Cuenta(456, 400, "Juan");
        Cuenta cuenta4 = new Cuenta(654, 100, "Daniel");
        Cuenta cuenta5 = new Cuenta(789, 300, "Laura");
        Cuenta cuenta6 = new Cuenta(987, 1000, "Jhon");
        Cuenta cuenta7 = new Cuenta(123, 120, "Juan");
        
        Banco banco1 = new Banco();
        banco1.adicionarCuenta(cuenta1);
        banco1.adicionarCuenta(cuenta2);
        banco1.adicionarCuenta(cuenta3);
        banco1.adicionarCuenta(cuenta4);
        banco1.adicionarCuenta(cuenta5);
        banco1.adicionarCuenta(cuenta6);
        banco1.adicionarCuenta(cuenta7);
        System.out.println(banco1);
        System.out.println("");
        System.out.println("Cuentas repetidas por nombre: "+banco1.cuentasPorTitular("Juan"));
        System.out.println("Cuentas repetidas por saldo: " + banco1.cuentasPorSaldo(100));
        System.out.println("Saldo promedio: " + banco1.promedioSaldo());
        System.out.println("Cuenta con mayor saldo: " + banco1.mayorSaldo());
        System.out.println("Eliminada: "+banco1.eliminarCuenta(cuenta6));
        System.out.println("Cuenta con mayor saldo: " + banco1.mayorSaldo());
        System.out.println(banco1.buscarCuenta(cuenta7));
    }
    
}
