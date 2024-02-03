package edu.cuc.pruebas;

import edu.cuc.listas.ListaSimple;

public class PruebaLista04 {

    public static void main(String[] args) {
        ListaSimple<Integer> ascendente = new ListaSimple<>();
        ascendente.adicionarAlFinal(1);
        ascendente.adicionarAlFinal(2);
        ascendente.adicionarAlFinal(3);
        ascendente.adicionarAlFinal(4);
        ascendente.adicionarAlFinal(5);
        ascendente.adicionarAlFinal(6);
        ascendente.adicionarAlFinal(7);
        ascendente.adicionarAlFinal(8);
        ascendente.adicionarAlFinal(9);
        System.out.println("Lista ascendente:  " + ascendente);
        System.out.println(ascendente.dezplazar());
        System.out.println("Lista ascendente:  " + ascendente);

    }
}
