/**
 *
 * @author Luis Carrasco
 * @version 12-10-2023
 */
public class Tecnico extends Libro{
    
    private boolean disco;

    public Tecnico() {
    }

    public Tecnico(boolean disco) {
        this.disco = disco;
    }

    public Tecnico(boolean disco, String titulo, double precio, int numeroPaginas, int edad) {
        super(titulo, precio, numeroPaginas, edad);
        this.disco = disco;
    }

    public boolean isDisco() {
        return disco;
    }

    public void setDisco(boolean disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "disco=" + disco + '}';
    }
    
    
}
