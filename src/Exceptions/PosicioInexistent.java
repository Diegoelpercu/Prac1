package Exceptions;

public class PosicioInexistent extends Exception {
    private static final long serialVersionUID = 1L;

    public PosicioInexistent() {
        super("No existeix aquesta posicio en la llista");
    }
}
