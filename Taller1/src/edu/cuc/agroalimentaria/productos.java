/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.agroalimentaria;

/**
 *
 * @author jgonzale120
 */
public class productos {
    
    protected String fechaCaducidad;
    protected int numerodelote;

    public productos(String fechaCaducada, int numerodelote) {
        this.fechaCaducidad = fechaCaducada;
        this.numerodelote = numerodelote;
    }

    public String getFechaCaducada() {
        return fechaCaducidad;
    }

    public void setFechaCaducada(String fechaCaducada) {
        this.fechaCaducidad = fechaCaducada;
    }

    public int getNumerodelote() {
        return numerodelote;
    }

    public void setNumerodelote(int numerodelote) {
        this.numerodelote = numerodelote;
    }

    @Override
    public String toString() {
        return "Datos del producto \n" + "Fecha de Caducidad: " + fechaCaducidad + "\n"+"Numero de lote: " + numerodelote;
    }
    
    
    
    
}
