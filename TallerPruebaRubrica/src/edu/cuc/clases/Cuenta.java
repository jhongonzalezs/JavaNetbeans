/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.clases;

import java.util.Objects;

/**
 *
 * @author FAMILIA ALARCON MOZO
 */
public class Cuenta {
    protected int numeroCuenta;
    protected double saldoCuenta;
    protected String titularCuenta;

    
    
    //constructor
    public Cuenta(int numeroCuenta, double saldoCuenta, String titularCuenta) {
        if (numeroCuenta > 0 && saldoCuenta > 0){
           this.numeroCuenta = numeroCuenta;
           this.saldoCuenta = saldoCuenta; 
        } else {
            throw new ArithmeticException("Numero y saldo de cuenta mayor a cero.");
        }
        this.titularCuenta = titularCuenta;
    }
    
//    public Cuenta(int numeroCuenta, String titularCuenta) {
//        if (numeroCuenta > 0){
//           this.numeroCuenta = numeroCuenta;
//        } else {
//            throw new ArithmeticException("Numero de cuenta mayor a cero.");
//        }
//        this.titularCuenta = titularCuenta;
//    }
    
    
    
    //getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }
    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    
    
    
    //metodos generales
    @Override
    public String toString(){
        return this.numeroCuenta+"-"+this.titularCuenta+"-$"+this.saldoCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.numeroCuenta) ^ (Double.doubleToLongBits(this.numeroCuenta) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.saldoCuenta) ^ (Double.doubleToLongBits(this.saldoCuenta) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.titularCuenta);
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
        final Cuenta other = (Cuenta) obj;
        if (this.numeroCuenta != other.numeroCuenta) {
            return false;
        }
        return true;
    }
    
    
    
    //metodos especificos
    public boolean consignar(double montoConsignar){
        if (montoConsignar < 0){
            return false;
        } else {
            this.saldoCuenta += montoConsignar;
            return true;
        }
    }
    
    public boolean retirar(double montoRetirar){
        if (montoRetirar < 0){
            return false;
        } else {
            if (montoRetirar <= this.saldoCuenta){
                this.saldoCuenta -= montoRetirar;
                return true;
            } else {
                return false;
            }
        }
    }
    
    public boolean transferir(Cuenta cuenta, double montoTransferir){
        //nos aseguramos de que la cuenta a la que se va a enviar sea diferente a esta
        if (!this.equals(cuenta)){
            if (montoTransferir < 0){
                return false;
            } else {
                if (montoTransferir <= this.saldoCuenta){
                    retirar(montoTransferir);
                    cuenta.consignar(montoTransferir);
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            System.out.println("Aqui");
            return false;
        }
    }
}

    

    