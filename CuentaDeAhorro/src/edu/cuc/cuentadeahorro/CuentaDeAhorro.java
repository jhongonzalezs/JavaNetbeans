
package edu.cuc.cuentadeahorro;

import java.util.Objects;

/**
 *
 * @author invitado
 */
public class CuentaDeAhorro {

    //Atributos
    private int numerodeCuenta;
    private String titularCuenta;
    private double saldoCuenta = 0;
    
    //Constructor

    public CuentaDeAhorro(int numerodeCuenta, String titularCuenta) {
        this.numerodeCuenta = numerodeCuenta;
        this.titularCuenta = titularCuenta;
    }
   
    
    //Getters and Setters
    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(int numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
   
    
    //toString
    @Override
    public String toString() {
        return "CuentaDeAhorro: \n" + "Numero de Cuenta: " + numerodeCuenta + "\n" +"Titular de la Cuenta: " + titularCuenta + "\n" +", Saldo de la cuenta: " + saldoCuenta;
    }
    
    //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numerodeCuenta;
        hash = 59 * hash + Objects.hashCode(this.titularCuenta);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.saldoCuenta) ^ (Double.doubleToLongBits(this.saldoCuenta) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaDeAhorro other = (CuentaDeAhorro) obj;
        if (this.numerodeCuenta != other.numerodeCuenta) {
            return false;
        }
        return true;
    }
    
       //Metodos
       public void consignar(double dineroconsignar){
           if (dineroconsignar>0) {
               //Incrementar Saldo
               this.saldoCuenta = dineroconsignar;
           }else{
               System.out.println("El monto debe ser mayor a cero");
           }
       }
    
    
    
    
}
