package Main;



import Dades.Ciutada;
import Dades.LlistaBase;


public class App {
    public static <T> void main(String[] args) throws Exception {
        
//*****************************************************  TEST INSERIR al final, OBTENIR i ITERATOR  **********************************************************
       
        System.out.println("TEST INSERIR al final, OBTENIR i ITERATOR\n");


        LlistaBase<Integer> llista = new LlistaBase<Integer>();

        //Obtenir 
        System.out.println("valor "+llista.obtenir(0)); //Amb llista buida
        
        //Inserir
        llista.inserir(1);

        //Obtenir
        System.out.println("\nvalor "+llista.obtenir(0)); //Amb llista amb 1 sol element

        //Inserir
        llista.inserir(2);
        llista.inserir(3);
        llista.inserir(4);
        llista.inserir(5);
        
        //Obtenir
        System.out.println("\nvalor "+llista.obtenir(0)); //Valor 1
        System.out.println("valor "+llista.obtenir(1)); //Valor 2
        System.out.println("valor "+llista.obtenir(2)); //Valor 3
        System.out.println("valor "+llista.obtenir(3)); //Valor 4
        System.out.println("valor "+llista.obtenir(4)); //Valor 5
        System.out.println("valor "+llista.obtenir(5)); //Excepció, no hi ha element
        System.out.println("\n");

        //Iterator
        LlistaBase<Integer> llistaIteratorInt= new LlistaBase<Integer>();
        llistaIteratorInt = llista.copiaIterable(); // "llistaItaratorInt" és una còpia de la llista. I ara treballem amb ella amb next i hasNext per poder iterar còmodament
        while (llistaIteratorInt.hasNext()){                            //Printem 1,2,3,4,5
            System.out.println(llistaIteratorInt.next().toString());
        }
        
//************************************************************  TEST INSERIR EN POSICIO I ITERATOR **********************************************************

        System.out.println("\nTEST INSERIR EN POSICIO\n");
       
        LlistaBase<String> llistaPos = new LlistaBase<String>();
        llistaPos.inserir(1, "H");  //No existeix posició
        llistaPos.inserir(0, "B"); 
        System.out.println("valor en pos 0 "+llistaPos.obtenir(0));  //Inserim "B" en posicio 0 
        llistaPos.inserir(0, "A");
        System.out.println("valor en pos 0 "+llistaPos.obtenir(0));  //Inserim "A" en posicio 0. Per tant queda "A" en posicio 0 i "B" en posicio 1
        System.out.println("valor en pos 1 "+llistaPos.obtenir(1));  //"B"

        llistaPos.inserir(1, "C"); 
        System.out.println("\nvalor en pos 1\n"+llistaPos.obtenir(1));  //"C"

        LlistaBase<String> llistaIteratorPos= new LlistaBase<String>();
        llistaIteratorPos = llistaPos.copiaIterable(); 
        while (llistaIteratorPos.hasNext()){                         //Printem "A","C","B"
            System.out.println(llistaIteratorPos.next().toString());
        }

//***************************************  TEST LONGITUD  *****************************************************************************************
        
        System.out.println("\nTEST LONGITUD\n");
        LlistaBase<String> llistaBuida = new LlistaBase<String>();
        System.out.println("\nnElem="+ llista.longitud());  //5 elements
        System.out.println("nElem="+ llistaPos.longitud()); //3 elements
        System.out.println("nElem="+ llistaBuida.longitud()); //0 elements, llista buida
    
//***********************************************  TEST ESBORRAR (treballem amb la pirmera llista creada)  ********************************************
        
        System.out.println("\nTEST ESBORRAR (treballem amb la pirmera llista creada)\n");
        
        llista.esborrar(0); //Esborrem primera posicio (esborrem el 0)

        llistaIteratorInt = llista.copiaIterable(); 
        while (llistaIteratorInt.hasNext()){                            //Printem 2,3,4,5
            System.out.println(llistaIteratorInt.next().toString());
        }
        
        System.out.println("\n");

        llista.esborrar(3); //Esborrem ultima posicio (esborrem el 5)         

        llistaIteratorInt = llista.copiaIterable(); 
        while (llistaIteratorInt.hasNext()){                            //Printem 2,3,4
            System.out.println(llistaIteratorInt.next().toString());
        }

        System.out.println("\n");


        llista.esborrar(1); //Esborrem en posicio intermedia (esborrem el 3)

        llistaIteratorInt = llista.copiaIterable(); 
        while (llistaIteratorInt.hasNext()){                            //Printem 2,4
            System.out.println(llistaIteratorInt.next().toString());
        }

//*********************************************  TEST BUSCAR (i compareTo) amb T=Integer  *****************************************************
        
        System.out.println("\nTEST BUSCAR (amb Integer, String i Ciutada)\n");

        LlistaBase<Integer> llistaBuscar = new LlistaBase<Integer>();
        System.out.println("\nNombre iteracions="+llistaBuscar.buscar(2));  //No trobat amb 0 iteracions. Llista buida

        llistaBuscar.inserir(1);
        llistaBuscar.inserir(2);
        llistaBuscar.inserir(3);
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(1));  //Sí trobat amb 1 iteració
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(2));  //Sí trobat amb 2 iteracions
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(3));  //Sí trobat amb 3 iteracions
        System.out.println("Nombre iteracions="+llistaBuscar.buscar(4));  //NO trobat amb 3 iteracions*/

//*******************************************  TEST COMPARETO CIUTADA   ********************************************************************************

        System.out.println("\nTEST COMPARETO CIUTADA\n");
        LlistaBase<Ciutada> llistaCiutada = new LlistaBase<Ciutada>();
        Ciutada ciutada1 = new Ciutada("Rafael", "Ojeda", "02492095F");
        Ciutada ciutada2 = new Ciutada("Antonio", "Díaz", "24467895A");
        Ciutada ciutada3 = new Ciutada("Pavoqui", "Treu", "67467895P");
        llistaCiutada.inserir(ciutada1);
        llistaCiutada.inserir(ciutada2);
        llistaCiutada.inserir(ciutada3);
        System.out.println("\n\nNombre iteracions="+llistaCiutada.buscar(ciutada1));  //Sí trobat amb 1 iteració
        System.out.println("Nombre iteracions="+llistaCiutada.buscar(ciutada2));  //Sí trobat amb 2 iteracions
        System.out.println("Nombre iteracions="+llistaCiutada.buscar(ciutada3));  //Sí trobat amb 3 iteracions

//******************************************  TEST COPIAITERABLE  *******************************************************************************

        System.out.println("\nTEST COPIAITERABLE\n");
        LlistaBase<Ciutada> llistaIterator= new LlistaBase<Ciutada>();

        llistaIterator = llistaCiutada.copiaIterable(); // "llistaItarator" és una còpia de la llistaCiutada. I ara treballem amb ella amb next i hasNext per poder iterar còmodament

       System.out.println("\n\nvalor "+llistaIterator.obtenir(2)); //ciutada3
    }   
}
