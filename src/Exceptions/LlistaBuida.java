package Exceptions;

public class LlistaBuida extends Exception {
    private static final long serialVersionUID = 1L;
    public LlistaBuida(){
        super("Excepció: La lista està buida");
    }
}
