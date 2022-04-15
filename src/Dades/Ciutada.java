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
        if (this.dni.equals(ciutada.dni)) return 0; //DNI idèntics
        return 1;  //DNI diferents
    }


    @Override
    public String toString() {
        return "Ciutada [cognom=" + cognom + ", dni=" + dni + ", nom=" + nom + "]";
    }

    
}

