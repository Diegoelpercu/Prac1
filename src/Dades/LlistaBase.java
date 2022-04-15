package Dades;

import java.util.Iterator;

public class LlistaBase<T extends Comparable<T>> implements TADLlistaDE<T>, Iterator<T> {

 //Atributs
    private Node<T> primer;
    private Node<T> ultim;
    private int nElem=0;    
//Constructor
    public LlistaBase() {
        this.primer=null;
        this.ultim=null;
    }
public int getnElem() {
        return nElem;
    }
    public void setnElem(int nElem) {
        this.nElem = nElem;
    }
    //Getters i Setters
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

//Metodes

   
    public void Inserir(T data) {
       Node<T> node = new Node<T>(data, null ,null );
       if (primer==null){    //Si la llista està buida
           ultim=node;
           primer=node;
       }else {
            node.setAnterior(ultim);
            ultim.setSeguent(node);
            ultim=node;
       }
       nElem++;
       
    }

    public void Inserir(int posicio, T data) {
        
        if (posicio>nElem || (posicio==nElem && primer!=null)){

            System.out.println("No existeix aquesta posicio en la llista");//excepcio
        }else{
            Node<T> node = new Node<T>(data, null ,null );
            if (primer==null){    //Si la llista està buida
                ultim=node;
                 primer=node;
            }else {
                if (posicio==0){    //Per a inserir en la posicio 0
                    node.setSeguent(primer);
                    primer.setAnterior(node); 
                    primer=node;
                }else{
                    Node<T> aux= primer;
                    int counter=0;
                    while (counter<posicio && aux.getSeguent() != null){
                        aux= aux.getSeguent();
                        counter++;
                    }
                        node.setAnterior(aux.getAnterior());
                        node.setSeguent(aux);
                        (aux.getAnterior()).setSeguent(node);   //Importa ordre amb el de baix!
                        aux.setAnterior(node);
                
                }  
                } nElem++;    //Si el posarem baix, quan no insertem també sumaríem 1 a nElem
        }
    }


    public int Longitud() {
        return nElem;   
    }

    public void Esborrar(int posicio) {

        if (primer == null || posicio>=nElem)  System.out.println("No es pot eliminar");//excepcio
        else{
            if (posicio==0){   //Si es vol eliminar el primer 
                primer= primer.getSeguent();
                primer.setAnterior(null);

                }else{
                    if(posicio==nElem-1){   //Si es vol eliminar l'ultim
                        ultim= ultim.getAnterior();
                        ultim.setAnterior(null);
                    }else{
                        Node<T> aux= primer;
                        int counter=0;
                        while (counter<posicio && aux.getSeguent() != null){
                            aux= aux.getSeguent();
                            counter++;
                        }
                        (aux.getAnterior()).setSeguent(aux.getSeguent());
                        (aux.getSeguent()).setAnterior(aux.getAnterior());
                    }

                } nElem--;
            }
        }
        
    


    public int Buscar(T data) {
        int nElem=0;
        int counter=0;
        Node<T> aux= primer;
        while (counter<this.nElem && aux.getSeguent() != null && (aux.getElem()).compareTo(data)==0){
           aux=aux.getSeguent();
           nElem++;
        }
        if ((aux.getElem()).compareTo(data)!=0) System.out.println("Element no trobat");
        //Excepcio element no trobat
        
        return nElem;
    }


    public T Obtenir(int posicio) {
        if (primer == null) return null;//excepcio
        if (posicio>=nElem) return null;//excepcio
        else {
            Node<T> aux= primer;
            int counter=0;
            while (counter<posicio && aux.getSeguent() != null){
                aux= aux.getSeguent();
                counter++;
            }
                return aux.getElem();
            
        }
    }

    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }
    public T next() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
