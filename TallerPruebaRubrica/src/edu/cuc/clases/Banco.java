/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.clases;

import edu.cuc.listas.ListaSimple;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author FAMILIA ALARCON MOZO
 */
public class Banco {
    
    protected ListaSimple<Cuenta> listadoCuentas = new ListaSimple<>();
    
    //metodos generales
    @Override
    public String toString() {
        return "Cuentas: " + listadoCuentas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.listadoCuentas);
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
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.listadoCuentas, other.listadoCuentas)) {
            return false;
        }
        return true;
    }
    
    
    
    //metodos especificos
    public void adicionarCuenta(Cuenta cuentaAdicionar){
        listadoCuentas.adicionarAlFinal(cuentaAdicionar);
    }
    
    public boolean eliminarCuenta(Cuenta cuentaEliminar){
        return listadoCuentas.eliminar(cuentaEliminar);
    }
    
    public boolean buscarCuenta(Cuenta cuentaBuscar){
        return listadoCuentas.buscar(cuentaBuscar);
    }
    
    public  ArrayList<Cuenta> cuentasPorTitular(String titular){
        int longitud = listadoCuentas.longitud();
        ArrayList<Cuenta> cuentasRepetidasPorNombres = new ArrayList<>();
        
        for (int i = 0; i < longitud; i++) {
            Cuenta usuario = listadoCuentas.buscarPorPosicion(i);
            if (usuario.getTitularCuenta().equals(titular)){
                cuentasRepetidasPorNombres.add(usuario);
            }
        }
        return cuentasRepetidasPorNombres;
    }
    
    public ArrayList<Cuenta> cuentasPorSaldo(double saldo){
        int longitud = listadoCuentas.longitud();
        ArrayList<Cuenta> cuentasRepetidasPorSaldo = new ArrayList<>();
        
        for (int i = 0; i < longitud; i++) {
            Cuenta cuentas = listadoCuentas.buscarPorPosicion(i);
            if (cuentas.getSaldoCuenta() == saldo){
                cuentasRepetidasPorSaldo.add(cuentas);
            }
        }
        return cuentasRepetidasPorSaldo;
    }
    
    public double promedioSaldo(){
        int longitud = listadoCuentas.longitud();
        double promedio = 0;
        
        for (int i = 0; i < longitud; i++) {
            Cuenta cuenta = listadoCuentas.buscarPorPosicion(i);
            promedio += cuenta.getSaldoCuenta();
        }
        return promedio/longitud;
    }
    
    public Cuenta mayorSaldo(){
        int longitud = listadoCuentas.longitud();
        double mayor = Double.MIN_VALUE;
        Cuenta cuentaMayorSaldo = null;
        
        for (int i = 0; i < longitud; i++) {
            Cuenta cuenta = listadoCuentas.buscarPorPosicion(i);
            if (cuenta.getSaldoCuenta() > mayor){
                mayor = cuenta.getSaldoCuenta();
                cuentaMayorSaldo = cuenta;
            }
        }
        return cuentaMayorSaldo;
    }
    
}
