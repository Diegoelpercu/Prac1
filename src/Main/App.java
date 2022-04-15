package Main;

import Dades.LlistaBase;
import Dades.Node;

public class App {
    public static <T> void main(String[] args) throws Exception {
        

        //TEST INSERIR al final I OBTENIR

        LlistaBase<Integer> llista = new LlistaBase<Integer>();
        llista.Inserir(1);
        llista.Inserir(2);
        llista.Inserir(3);
        llista.Inserir(4);
        llista.Inserir(5);
        
 //TODO: la lista se tiene que printar entera con el iterable, ahorraremos mucho código

        System.out.println("valor "+llista.Obtenir(0));
        System.out.println("valor "+llista.Obtenir(1));
        System.out.println("valor "+llista.Obtenir(2));
        System.out.println("valor "+llista.Obtenir(3));
        System.out.println("valor "+llista.Obtenir(4));
        System.out.println("valor "+llista.Obtenir(5)); //Excepció, no hi ha element


        //TEST INSERIR EN POSICIO

        LlistaBase<String> llistaPos = new LlistaBase<String>();
        llistaPos.Inserir(1, "H");  //No existeix posició
        llistaPos.Inserir(0, "B"); 
        System.out.println("\n\nvalor "+llistaPos.Obtenir(0));  //Inserim "B" en posicio 0 
        llistaPos.Inserir(0, "A");
        System.out.println("valor "+llistaPos.Obtenir(0));  //Inserim "A" en posicio 0. Per tant queda "A" en posicio 0 i "B" en posicio 1
        System.out.println("valor "+llistaPos.Obtenir(1));  //"B"

        llistaPos.Inserir(1, "C"); 
        System.out.println("valor "+llistaPos.Obtenir(1));  //"C"

        System.out.println("\nvalor "+llistaPos.Obtenir(0));  //"A"
        System.out.println("valor "+llistaPos.Obtenir(1));  //"C"
        System.out.println("valor "+llistaPos.Obtenir(2));  //"B"


        //TEST LONGITUD

        System.out.println("\n\nnElem="+ llista.Longitud());  //5 elements
        System.out.println("nElem="+ llistaPos.Longitud()); //3 elements
        

        //TEST ESBORRAR (treballem amb la pirmera llista creada)
        
        llista.Esborrar(0); //Esborrem primera posicio
        System.out.println("\n\nvalor "+llista.Obtenir(0));
        System.out.println("valor "+llista.Obtenir(1));
        System.out.println("valor "+llista.Obtenir(2));
        System.out.println("valor "+llista.Obtenir(3));
        System.out.println("valor "+llista.Obtenir(4)); //No hi ha element

        llista.Esborrar(3); //Esborrem ultima posicio
        System.out.println("\n\nvalor "+llista.Obtenir(0));
        System.out.println("valor "+llista.Obtenir(1));
        System.out.println("valor "+llista.Obtenir(2));
        System.out.println("valor "+llista.Obtenir(3)); //No hi ha element

        llista.Esborrar(1); //Esborrem en posicio intermedia
        System.out.println("\n\nvalor "+llista.Obtenir(0));
        System.out.println("valor "+llista.Obtenir(1));
        System.out.println("valor "+llista.Obtenir(2)); //No hi ha element


        //TEST BUSCAR (amb Integer, String i Ciutada)
        llista.Buscar(2);




    }   
}
