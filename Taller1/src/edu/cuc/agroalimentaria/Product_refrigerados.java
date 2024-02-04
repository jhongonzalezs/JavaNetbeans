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
public class Product_refrigerados {
    
    protected int  codigosupervisionalimentaria;
    protected  String fechaEmvasado;
    protected int temperaturarecomendada;
    protected String  paisdeorigen;

    public Product_refrigerados(int codigosupervisionalimentaria, String fechaEmvasado, int temperaturarecomendada, String paisdeorigen) {
        this.codigosupervisionalimentaria = codigosupervisionalimentaria;
        this.fechaEmvasado = fechaEmvasado;
        this.temperaturarecomendada = temperaturarecomendada;
        this.paisdeorigen = paisdeorigen;
    }

    @Override
    public String toString() {
        return "Datos del producto refrigerado \n" + "Codigo de supervision alimentaria: " + codigosupervisionalimentaria +"\n"+ "Fecha de Emvasado: " + fechaEmvasado +"\n"+ "Temperatura recomendada: " + temperaturarecomendada +"\n"+ "Pais de origen:" + paisdeorigen + '}';
    }
    
    
    
    
}
