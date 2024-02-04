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
public class product_frescos {
    
    protected  String fechaEmvasado;
    protected String paisOrigen;

    public product_frescos(String fechaEmvasado, String paisOrigen) {
        this.fechaEmvasado = fechaEmvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Datos del producto fresco \n" + "Fecha de Emvasado: " + fechaEmvasado + "\n"+"Pais de origen: " + paisOrigen;
    }
   
    
    
    
}
