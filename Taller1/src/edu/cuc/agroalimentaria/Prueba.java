/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.agroalimentaria;

import javax.swing.JOptionPane;

/**
 *
 * @author jgonzale120
 */
public class Prueba {
    public static void main(String[] args) {
        String fecha, pais;
        int lote;
        
        fecha=JOptionPane.showInputDialog("Digite la fecha de caducidad: ");
        pais=JOptionPane.showInputDialog("Digite el pais de origen del producto ");
        lote=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del lote del producto: "));
        
        productos product1 = new productos(fecha, lote);
        System.out.println("producto #1: "+product1);
        product_frescos Product2 = new product_frescos(fecha, pais);
        
    }
    
}
