package edu.cuc.listas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * Implementación Lista Simple
 *
 * @author adelahoz6
 */
public class ListaSimple<E> implements Lista<E>, Serializable {

    protected NodoSimple<E> nodoInicial;

    /**
     * Adicionar dato al inicio
     *
     * @param elemento
     */
    @Override
    public void adicionarAlInicio(E elemento) {
        NodoSimple<E> nodoNuevo = new NodoSimple<>(elemento);
        if (estaVacia()) {
            //Caso Lista Vacia
            nodoInicial = nodoNuevo;
        } else {
            //Caso con al menos un elemento en la lista            
            nodoNuevo.siguiente = nodoInicial; //nodoNuevo -> nodoInicial
            nodoInicial = nodoNuevo;
        }
    }

    @Override
    public void adicionarAlFinal(E elemento) {
        NodoSimple<E> nodoNuevo = new NodoSimple<>(elemento);
        if (estaVacia()) {
            //Caso Lista Vacia
            nodoInicial = nodoNuevo;
        } else {
            NodoSimple<E> actual = nodoInicial;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            if (actual.siguiente == null) {
                actual.siguiente = nodoNuevo;
            }
        }
    }

    @Override
    public E eliminarAlInicio() {
        if (estaVacia()) {
            //Caso Lista Vacia
            return null;
        } else {
            //Caso lista con elementos
            E dato = nodoInicial.dato;
            nodoInicial = nodoInicial.siguiente; //nodoInicial -> nodoInicial
            return dato;
        }
    }

    @Override
    public E eliminarAlFinal() {
        if (estaVacia()) {
            //Caso Lista Vacia
            return null;
        } else {
            //Busqueda de información
            NodoSimple<E> previo = null;
            NodoSimple<E> actual = nodoInicial;
            while (actual.siguiente != null) {
                previo = actual;
                actual = actual.siguiente;
            }
            //Caso Dato no encontrado
            if (actual == null) {
                return null;
            } else {
                //Caso Dato Encontrado
                if (actual.siguiente == null) {
                    //Dato se encuentra en el ultimo nodo
                    previo.siguiente = null;
                    return actual.dato;
                }
            }
            return null;
        }
    }

    @Override
    public E ultimoElemento() {
        if (estaVacia()) {
            //Caso Lista Vacia
            return null;
        } else {
            //Busqueda de información
            NodoSimple<E> previo = null;
            NodoSimple<E> actual = nodoInicial;
            while (actual.siguiente != null) {
                previo = actual;
                actual = actual.siguiente;
            }
            //Caso Dato no encontrado
            if (actual == null) {
                return null;
            } else {
                //Caso Dato Encontrado
                if (actual.siguiente == null) {
                    //Dato se encuentra en el ultimo nodo
                    E dato = actual.dato;
                    return dato;
                }
            }
            return null;
        }
    }

    @Override
    public E penultimo() {
        //Caso Lista Vacia
        if (estaVacia()) {
            return null;
        } else {
            //Caso lista con elementos
            NodoSimple<E> previo = null;
            NodoSimple<E> actual = nodoInicial;
            while (actual != null) {
                if (actual.siguiente == null) {
                    return previo.dato;
                }
                previo = actual;
                actual = actual.siguiente;
            }
            return previo.dato;
        }
    }

    @Override
    public boolean buscar(E datoABuscar
    ) {
        //Caso Lista Vacia
        if (estaVacia()) {
            return false;
        } else {
            //Caso lista con elementos
            NodoSimple<E> actual = nodoInicial;
            while (actual != null) {
                if (actual.dato.equals(datoABuscar)) {
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }
    }

    @Override
    public int num_apariciones(E datoABuscar) {
        //Caso Lista Vacia
        if (estaVacia()) {
            return 0;
        } else {
            //Caso lista con elementos
            int cont = 0;
            NodoSimple<E> actual = nodoInicial;
            while (actual != null) {
                if (actual.dato.equals(datoABuscar)) {
                    cont = cont + 1;
                }
                actual = actual.siguiente;
            }
            return cont;
        }
    }

    @Override
    public ArrayList num_posicion(E datoABuscar
    ) {
        ArrayList<Integer> posiciones = new ArrayList();
        if (estaVacia()) {
            return posiciones;
        } else {
            int posicion = 0;
            NodoSimple<E> actual = nodoInicial;
            while (actual != null) {
                if (actual.dato.equals(datoABuscar)) {
                    posiciones.add(posicion);
                    posicion = posicion + 1;
                } else {
                    posicion = posicion + 1;
                }
                actual = actual.siguiente;
            }
            return posiciones;
        }
    }

    @Override
    public ArrayList mayor_menor(int menor, int mayor) {
        ArrayList<Integer> posiciones = new ArrayList();
        if (estaVacia()) {
            return posiciones;
        } else {
            if (menor >= 0 && menor < mayor && mayor<=longitud()-1) {
                int posicion = 0;
                NodoSimple<E> actual = nodoInicial;
                while (actual != null) {
                    System.out.println();
                    if (posicion>menor && posicion<mayor) {
                        posiciones.add((Integer) actual.dato);
                        posicion = posicion + 1;
                    } else {
                        posicion = posicion + 1;
                    }
                    actual = actual.siguiente;
                }
            }else{
                return posiciones;
            }
            return posiciones;
        }
    }

    @Override
    public E eliminar_posicion(int dato
    ) {
        if (estaVacia() || dato < 0) {
            throw new IndexOutOfBoundsException("Indice: " + dato);
        } else {
            NodoSimple<E> previo = null;
            NodoSimple<E> actual = nodoInicial;
            int contador = 0;
            while (actual != null && contador < dato) {
                contador++;
                previo = actual;
                actual = actual.siguiente;
            }
            if (dato == 0) {
                eliminarAlInicio();
                return actual.dato;
            }
            if (actual == null) {
                return null; //NO existe la posición 
            } else {
                if (actual.siguiente == null) {
                    //Dato se encuentra en el ultimo nodo
                    previo.siguiente = null;
                    return actual.dato;
                } else {
                    //Caso Nodo Intermedio
                    previo.siguiente = actual.siguiente;
                    return actual.dato;
                }
            }
        }
    }

    @Override
    public boolean eliminar_apariciones(E datoABuscar
    ) {
        ArrayList<Integer> posiciones = new ArrayList();
        if (estaVacia()) {
        } //Nodo Inicial
        if (nodoInicial.dato.equals(datoABuscar)) {
            eliminarAlInicio();
        }
        //Busqueda de información
        NodoSimple<E> previo = null;
        NodoSimple<E> actual = nodoInicial;
        int tamaño = longitud();
        for (int i = 1; i < tamaño; i++) {
            previo = actual;
            actual = actual.siguiente;
            if (actual.siguiente == null && actual.dato.equals(datoABuscar)) {
                eliminarAlFinal();
            }
            if (actual.dato.equals(datoABuscar)) {
                //Caso Dato Encontrado
                if (actual.siguiente == null) {
                    //Dato se encuentra en el ultimo nodo
                    previo.siguiente = null;
                } else {
                    //Caso Nodo Intermedio
                    previo.siguiente = actual.siguiente;
                }
            }
        }
        return true;
    }

    /**
     * Indica si la lista está vacía
     *
     * @return
     */
    @Override
    public boolean estaVacia() {
        return nodoInicial == null;
    }

    /**
     * Elimina todos los elementos de la lista
     */
    @Override
    public void limpiar() {
        nodoInicial = null;
    }

    @Override
    public boolean intercambiar() {
        //Busqueda de información
        if (estaVacia() || longitud() < 2) {
            return false;
        } else {
            NodoSimple<E> primero = null;
            NodoSimple<E> actual = nodoInicial;
            NodoSimple<E> ultimo = null;
            primero = actual;
            eliminarAlInicio();
            adicionarAlFinal((E) primero);
            return true;
        }
    }
    
    @Override
    public boolean dezplazar() {
        //Busqueda de información
        if (estaVacia() || longitud() < 2) {
            return false;
        } else {
            NodoSimple<E> ultimo = null;
            NodoSimple<E> actual = nodoInicial;
            while (actual!=null) {                
                if (actual.siguiente==null) {
                    ultimo=actual;
                    actual=actual.siguiente;
                    eliminarAlFinal();
                }else{
                    actual=actual.siguiente;
                }
            }
            adicionarAlInicio((E) ultimo);
            return true;
        }
    }

    @Override
    public ArrayList invertir() {
        //Busqueda de información
        if (estaVacia() || longitud() < 2) {
            return null;
        } else {
            NodoSimple<E> actual = nodoInicial;
            ArrayList<E> datos = new ArrayList();
            while (actual != null) {
                datos.add(actual.dato);
                actual = actual.siguiente;
            }
            while (datos.listIterator().hasPrevious()) {

            }
            for (int i = 0, j = datos.size() - 1; i < j; i++) {
                datos.add(i, datos.remove(j));
            }
            return datos;
        }
    }

    /**
     * Indica la cantidad de elementos en la lista
     *
     * @return
     */
    @Override
    public int longitud() {
        NodoSimple<E> actual = nodoInicial;
        int contador = 0;
        while (actual != null) {
            actual = actual.siguiente;
            contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        String info = "";
        NodoSimple<E> actual = nodoInicial;
        while (actual != null) {
            info += actual.dato + " ";
            actual = actual.siguiente;
        }
        return info;
    }

    /**
     * Método para buscar un elemento por posición
     *
     * @param dato la posición del elemento a buscar, si existe
     * @return
     */
    @Override
    public E buscarPorPosicion(int dato
    ) {
        if (estaVacia() || dato < 0) {
            throw new IndexOutOfBoundsException("Indice: " + dato);
        } else {
            NodoSimple<E> actual = nodoInicial;
            int contador = 0;
            while (actual != null && contador < dato) {
                contador++;
                actual = actual.siguiente;
            }
            if (actual == null) {
                return null; //NO existe la posición 
            } else {
                return actual.dato;
            }
        }
    }

    /**
     * Método para eliminar un elemento por información
     *
     * @param dato el elemento a eliminar
     * @return
     */
    @Override
    public boolean eliminar(E dato
    ) {
        //Lista Vacia
        if (estaVacia()) {
            return false;
        } else {
            //Nodo Inicial
            if (nodoInicial.dato.equals(dato)) {
                eliminarAlInicio();
                return true;
            } else {
                //Busqueda de información
                NodoSimple<E> previo = null;
                NodoSimple<E> actual = nodoInicial;
                while (actual != null && !actual.dato.equals(dato)) {
                    previo = actual;
                    actual = actual.siguiente;
                }
                //Caso Dato no encontrado
                if (actual == null) {
                    return false;
                } else {
                    //Caso Dato Encontrado
                    if (actual.siguiente == null) {
                        //Dato se encuentra en el ultimo nodo
                        previo.siguiente = null;
                        return true;
                    } else {
                        //Caso Nodo Intermedio
                        previo.siguiente = actual.siguiente;
                        return true;
                    }
                }
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nodoInicial);
        return hash;

    }

    /**
     * Clase Nodo Simple
     */
    protected class NodoSimple<E> implements Serializable {

        E dato;
        NodoSimple<E> siguiente;

        public NodoSimple(E dato) {
            this.dato = dato;
        }

        public E getDato() {
            return dato;
        }

        public void setDato(E dato) {
            this.dato = dato;
        }

        public NodoSimple<E> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoSimple<E> siguiente) {
            this.siguiente = siguiente;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 89 * hash + Objects.hashCode(this.dato);
            hash = 89 * hash + Objects.hashCode(this.siguiente);
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
            final NodoSimple<?> other = (NodoSimple<?>) obj;
            if (!Objects.equals(this.dato, other.dato)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return dato.toString();
        }

    }

    /**
     * Método para serializar la instancia actual de la lista
     *
     * @param nombreArchivo
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void guardar(String nombreArchivo) throws FileNotFoundException, IOException {
        FileOutputStream fileOutput = new FileOutputStream(nombreArchivo);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(this);
        objectOutput.close();
        fileOutput.close();
    }

    /**
     * Método para deserializar una lista
     *
     * @param nombreArchivo
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static ListaSimple abrir(String nombreArchivo) throws
            FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(nombreArchivo);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        ListaSimple listaLeida = (ListaSimple) objectInput.readObject();
        return listaLeida;
    }

}
