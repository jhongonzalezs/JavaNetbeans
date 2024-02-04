package edu.cuc.listas;

import java.util.ArrayList;

/**
 * Interfaz Lista
 * @author adelahoz6
 */
public interface Lista<E> {
    void adicionarAlInicio(E dato);
    void adicionarAlFinal(E dato);
    boolean dezplazar();
    E eliminarAlInicio();
    E eliminarAlFinal();
    E ultimoElemento();
    boolean buscar(E dato);
    boolean estaVacia();
    void limpiar();
    boolean intercambiar();
    ArrayList invertir();
    int longitud();
    E penultimo();
    E eliminar_posicion(int posicion);
    int num_apariciones(E datoABuscar);
    boolean eliminar_apariciones(E datoABuscar);
    E buscarPorPosicion(int posicion);
    ArrayList num_posicion(E datoABuscar);
    ArrayList mayor_menor(int menor, int mayor);
    boolean eliminar(E dato);
}

