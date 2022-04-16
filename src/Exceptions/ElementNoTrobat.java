package Exceptions;

import Dades.Node;

public class ElementNoTrobat extends Exception {
    private static final long serialVersionUID = 1L;

    public <T> ElementNoTrobat (int nIteracions, int nElemLlista, Node<T> primer){

        if (nIteracions==nElemLlista && nIteracions!=0) {   //Sols entrem aci si hem recorregut tota la llista i no hem trobat res (la segona condició és per descartar el cas en que la llsta está buida, on nElem==nIteracions==0, i que vaja al següent if, tot i que som conscients que amb un if-else es podria solucionar)
            System.out.println("Element no trobat. Causa: L'element no es troba present en la llista");
        }
        if (primer==null){
            System.out.println("Element no trobat. Causa: La llista està buida");
        }
    }
}
