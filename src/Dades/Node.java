package Dades;

public class Node<T> {

    //Atributs
    private Node<T> seguent, anterior;
    private T dades;


    public Node (T dades, Node<T> seguent, Node<T> anterior){
        this.dades=dades;
        this.seguent=seguent;
        this.anterior=anterior;
    }

    public Node<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Node<T> anterior) {
        this.anterior = anterior;
    }

    public Node<T> getSeguent() {
        return seguent;
    }

    public T getElem() {
        return dades;
    }

    public void setElem(T elem) {
        this.dades = elem;
    }

    public void setSeguent(Node<T> seguent) {
        this.seguent = seguent;
    }

    @Override
    public String toString() {
        return " dades=" + dades;
    }

}