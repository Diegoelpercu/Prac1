package Dades;

public class Ciutada implements Comparable<Ciutada>  {
    
    String nom, cognom, dni;


    public Ciutada(String nom, String cognom, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }


    @Override
    public int compareTo(Ciutada ciutada) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

