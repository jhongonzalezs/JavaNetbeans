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
public class Product_congelados {
    protected  String fechaEmvasado;
    protected int temperaturarecomendada;
    protected String  paisdeorigen;

    public Product_congelados(String fechaEmvasado, int temperaturarecomendada, String paisdeorigen) {
        this.fechaEmvasado = fechaEmvasado;
        this.temperaturarecomendada = temperaturarecomendada;
        this.paisdeorigen = paisdeorigen;
    }

    public String getFechaEmvasado() {
        return fechaEmvasado;
    }

    public void setFechaEmvasado(String fechaEmvasado) {
        this.fechaEmvasado = fechaEmvasado;
    }

    public int getTemperaturarecomendada() {
        return temperaturarecomendada;
    }

    public void setTemperaturarecomendada(int temperaturarecomendada) {
        this.temperaturarecomendada = temperaturarecomendada;
    }

    public String getPaisdeorigen() {
        return paisdeorigen;
    }

    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }
    
    
    public void  congeladosporaire (String composiciondelaire){
        
    }
    
}
