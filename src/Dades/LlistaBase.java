package Dades;

import java.util.Iterator;

import Exceptions.ElementNoTrobat;
import Exceptions.LlistaBuida;
import Exceptions.PosicioInexistent;

public class LlistaBase<T extends Comparable<T>> implements TADLlistaDE<T>, Iterator<T> {

    // Atributs
    private Node<T> primer;
    private Node<T> ultim;
    private int nElem = 0;
    private int posicioIterator = 0;

    // Constructor
    public LlistaBase() {
        this.primer = null;
        this.ultim = null;
    }

    public int getnElem() {
        return nElem;
    }

    public void setnElem(int nElem) {
        this.nElem = nElem;
    }

    // Getters i Setters
    public Node<T> getPrimer() {
        return primer;
    }

    public void setPrimer(Node<T> primer) {
        this.primer = primer;
    }

    public Node<T> getUltim() {
        return ultim;
    }

    public void setUltim(Node<T> ultim) {
        this.ultim = ultim;
    }

    // Metodes

    public void inserir(T data) {
        Node<T> node = new Node<T>(data, null, null);
        if (primer == null) { // Si la llista està buida
            ultim = node;
            primer = node;
        } else {
            node.setAnterior(ultim);
            ultim.setSeguent(node);
            ultim = node;
        }
        nElem++;

    }

    public void inserir(int posicio, T data) throws PosicioInexistent {

        if (posicio > nElem || (posicio == nElem && primer != null)) {
            throw new PosicioInexistent();
        } else {
            Node<T> node = new Node<T>(data, null, null);
            if (primer == null) { // Si la llista està buida
                ultim = node;
                primer = node;
            } else {
                if (posicio == 0) { // Per a inserir en la posicio 0
                    node.setSeguent(primer);
                    primer.setAnterior(node);
                    primer = node;
                } else {
                    Node<T> aux = primer;
                    int counter = 0;
                    while (counter < posicio && aux.getSeguent() != null) {
                        aux = aux.getSeguent();
                        counter++;
                    }
                    node.setAnterior(aux.getAnterior());
                    node.setSeguent(aux);
                    (aux.getAnterior()).setSeguent(node); // Importa ordre amb el de baix!
                    aux.setAnterior(node);

                }
            }
            nElem++; // Si el posarem baix, quan no insertem també sumaríem 1 a nElem
        }
    }

    public int longitud() {
        return nElem;
    }

    public void esborrar(int posicio) throws LlistaBuida, PosicioInexistent {

        if (primer == null)
            throw new LlistaBuida();
        else {
            if (posicio >= nElem)
                throw new PosicioInexistent();
            else {
                if (primer == ultim) { // Si es vol eliminar l'únic element d'una llista amb 1 element
                    primer = null;
                    ultim = null;
                } else {
                    if (posicio == 0) { // Si es vol eliminar el primer
                        primer = primer.getSeguent();
                        primer.setAnterior(null);
                    } else {
                        if (posicio == nElem - 1) { // Si es vol eliminar l'ultim
                            ultim = ultim.getAnterior();
                            ultim.setAnterior(null);
                        } else {
                            Node<T> aux = primer;
                            int counter = 0;
                            while (counter < posicio && aux.getSeguent() != null) {
                                aux = aux.getSeguent();
                                counter++;
                            }
                            (aux.getAnterior()).setSeguent(aux.getSeguent());
                            (aux.getSeguent()).setAnterior(aux.getAnterior());
                        }
                    }
                }
                nElem--;
            }
        }
    }

    public int buscar(T data) throws ElementNoTrobat {
        boolean trobat = false;
        int nIteracions = 0;
        if (primer != null) {
            Node<T> aux = primer;
            while (nIteracions < this.nElem && !trobat) {
                if ((aux.getElem()).compareTo(data) == 0) {
                    return nIteracions + 1; // Element trobat, retornem cost
                }
                aux = aux.getSeguent();
                nIteracions++;
            }
        } // Element no trobat, donem pas a excepció
        throw new ElementNoTrobat(nIteracions, nElem, primer); // Excepcio element no trobat
    }

    public T obtenir(int posicio) throws LlistaBuida, PosicioInexistent {
        if (primer == null) {
            throw new LlistaBuida();
        } else {
            if (posicio >= nElem) {
                throw new PosicioInexistent();
            } else {
                Node<T> aux = primer;
                int counter = 0;
                while (counter < posicio && aux.getSeguent() != null) {
                    aux = aux.getSeguent();
                    counter++;
                }
                return aux.getElem();
            }
        }
    }

    public LlistaBase<T> copiaIterable() { // Clonem llista original per no maxacar-la
        LlistaBase<T> llistaClone = new LlistaBase<T>();
        Node<T> aux = this.getPrimer();
        int counter = 0;
        while (counter < this.getnElem()) {
            llistaClone.inserir(aux.getElem());
            aux = aux.getSeguent();
            counter++;
        }
        return llistaClone;
    }

    public boolean hasNext() {

        try {
            if (posicioIterator < this.getnElem() && this.obtenir(posicioIterator) != null)
                return true;
        } catch (LlistaBuida e) {
            System.out.println(e);
        } catch (PosicioInexistent e) {
            System.out.println(e);
        }
        return false;

    }

    public T next() {
        try {
            T aux = this.obtenir(posicioIterator);
            posicioIterator++;
            return aux;
        } catch (LlistaBuida e) {
            System.out.println(e);
        } catch (PosicioInexistent e) {
            System.out.println(e);
        }
        return null;
    }

}
