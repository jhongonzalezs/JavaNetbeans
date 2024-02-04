
package edu.cuc.cuentadeahorro;

/**
 *
 * @author invitado
 */
public class Pruebas {
    public static void main(String[] args) {
        CuentaDeAhorro cuenta1 = new CuentaDeAhorro(12345, "Juan");
        CuentaDeAhorro cuenta2 = new CuentaDeAhorro(12543, "Pedro");
        CuentaDeAhorro cuenta3 = new CuentaDeAhorro(54321, "Daniels");
        
        System.out.print("Cuenta N°1: "+cuenta1);
        System.out.print("Cuenta N°2: "+cuenta2);
        System.out.print("Cuenta N°3: "+cuenta3);
        System.out.print("Iguales? : "+cuenta1.equals(cuenta3));
        System.out.print("Iguales? : "+cuenta1.equals(cuenta2));
        
        //Consignar
        cuenta1.consignar(1000);
    }
    
}
