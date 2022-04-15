package Main;

import java.util.Iterator;

import Dades.Ciutada;
import Dades.LlistaBase;
import Dades.LlistaIterator;
import Dades.Node;

public class App {
    public static <T> void main(String[] args) throws Exception {
        

//*****************************************************  TEST INSERIR al final I OBTENIR  **********************************************************

       /* LlistaBase<Integer> llista = new LlistaBase<Integer>();
        llista.inserir(1);
        llista.inserir(2);
        llista.inserir(3);
        llista.inserir(4);
        llista.inserir(5);
        
 //TODO: la lista se tiene que printar entera con el iterable, ahorraremos mucho código

        System.out.println("valor "+llista.obtenir(0));
        System.out.println("valor "+llista.obtenir(1));
        System.out.println("valor "+llista.obtenir(2));
        System.out.println("valor "+llista.obtenir(3));
        System.out.println("valor "+llista.obtenir(4));
        System.out.println("valor "+llista.obtenir(5)); //Excepció, no hi ha element

//************************************************************  TEST INSERIR EN POSICIO  **********************************************************

        LlistaBase<String> llistaPos = new LlistaBase<String>();
        llistaPos.inserir(1, "H");  //No existeix posició
        llistaPos.inserir(0, "B"); 
        System.out.println("\n\nvalor "+llistaPos.obtenir(0));  //Inserim "B" en posicio 0 
        llistaPos.inserir(0, "A");
        System.out.println("valor "+llistaPos.obtenir(0));  //Inserim "A" en posicio 0. Per tant queda "A" en posicio 0 i "B" en posicio 1
        System.out.println("valor "+llistaPos.obtenir(1));  //"B"

        llistaPos.inserir(1, "C"); 
        System.out.println("valor "+llistaPos.obtenir(1));  //"C"

        System.out.println("\nvalor "+llistaPos.obtenir(0));  //"A"
        System.out.println("valor "+llistaPos.obtenir(1));  //"C"
        System.out.println("valor "+llistaPos.obtenir(2));  //"B"

//***************************************  TEST LONGITUD  *****************************************************************************************

        System.out.println("\n\nnElem="+ llista.longitud());  //5 elements
        System.out.println("nElem="+ llistaPos.longitud()); //3 elements
        
    
//***********************************************  TEST ESBORRAR (treballem amb la pirmera llista creada)  ********************************************
        
        llista.esborrar(0); //Esborrem primera posicio
        System.out.println("\n\nvalor "+llista.Obtenir(0));
        System.out.println("valor "+llista.obtenir(1));
        System.out.println("valor "+llista.obtenir(2));
        System.out.println("valor "+llista.obtenir(3));
        System.out.println("valor "+llista.obtenir(4)); //No hi ha element

        llista.esborrar(3); //Esborrem ultima posicio
        System.out.println("\n\nvalor "+llista.obtenir(0));
        System.out.println("valor "+llista.obtenir(1));
        System.out.println("valor "+llista.obtenir(2));
        System.out.println("valor "+llista.obtenir(3)); //No hi ha element

        llista.esborrar(1); //Esborrem en posicio intermedia
        System.out.println("\n\nvalor "+llista.obtenir(0));
        System.out.println("valor "+llista.obtenir(1));
        System.out.println("valor "+llista.obtenir(2)); //No hi ha element*/

//*********************************************  TEST BUSCAR (amb Integer, String i Ciutada)  *****************************************************
        
        /*LlistaBase<Integer> llistaBuscar = new LlistaBase<Integer>();
        System.out.println("\n\nNombre iteracions="+llistaBuscar.buscar(2));  //No trobat amb 0 iteracions. Llista buida

        llistaBuscar.inserir(1);
        llistaBuscar.inserir(2);
        llistaBuscar.inserir(3);
        System.out.println("\nNombre iteracions="+llistaBuscar.buscar(1));  //Sí trobat amb 1 iteració
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(2));  //Sí trobat amb 2 iteracions
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(3));  //Sí trobat amb 3 iteracions
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(4));  //NO trobat amb 3 iteracions*/

//*******************************************  TEST COMPARETO CIUTADA   ********************************************************************************

        LlistaBase<Ciutada> llistaCiutada = new LlistaBase<Ciutada>();
        Ciutada ciutada1 = new Ciutada("Rafael", "Ojeda", "02492095F");
        Ciutada ciutada2 = new Ciutada("Antonio", "Díaz", "24467895A");
        Ciutada ciutada3 = new Ciutada("Pavoqui", "Treu", "67467895P");
        llistaCiutada.inserir(ciutada1);
        llistaCiutada.inserir(ciutada2);
        llistaCiutada.inserir(ciutada3);
        System.out.println("Nombre iteracions="+llistaCiutada.buscar(ciutada1));  //Sí trobat amb 1 iteració
        System.out.println("Nombre iteracions="+llistaCiutada.buscar(ciutada2));  //Sí trobat amb 2 iteracions
        System.out.println("Nombre iteracions="+llistaCiutada.buscar(ciutada3));  //Sí trobat amb 3 iteracions

//******************************************  TEST ITERATOR LISTA  *******************************************************************************
        


        Iterator<Ciutada> i= llistaCiutada.iterator(); // "i" és una còpia de la llistaCiutada, però ara no de tipus LlistaBase sinó de tipus LListaIterable, per tant pot treballar amb next i hasNext i iterar còmodament
        
        while (i.hasNext()){
            (i.next()).toString();
            }



    }   
}
