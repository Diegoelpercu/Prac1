package Dades;

import java.util.Iterator;

public class LlistaIterator<T extends Comparable<T>> implements Iterator<T> {
    private LlistaBase<T> llistaClone;
    private int posicioIterator=0;

    public LlistaIterator (LlistaBase<T> llista){   //Clonem llista original per no maxacar-la
		llistaClone = new LlistaBase<T>();
        Node<T> aux= llista.getPrimer();
        int counter=0;
        while (counter<llista.getnElem() && aux.getSeguent() != null){
           llistaClone.inserir(aux.getElem());
            aux= aux.getSeguent();
            counter++;
        }
    }
   
    public boolean hasNext() {
        
        return (posicioIterator<llistaClone.getnElem() && llistaClone.obtenir(posicioIterator)!= null);
    }

    
    public T next() {
       T aux= llistaClone.obtenir(posicioIterator);
       posicioIterator++;
        return aux;
    }


    
}
