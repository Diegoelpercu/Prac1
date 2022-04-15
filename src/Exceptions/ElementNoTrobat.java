package Exceptions;

import Dades.Node;

public class ElementNoTrobat extends Exception {
    private static final long serialVersionUID = 1L;

    public <T> ElementNoTrobat (int nIteracions, int nElemLlista, Node<T> primer){
        super("Excepció: Element no trobat");
        if (nIteracions==nElemLlista) {
            System.out.println("Causa: L'element no es troba present en la llista");
        }
        if (primer==null){
            System.out.println("Causa: La llista està buida");
        }
    }
}
