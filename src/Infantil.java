/**
 *
 * @author Luis Carrasco
 * @version 12-10-2023
 */
public class Infantil extends Libro{
    private int rangoEdadMenor,rangoEdadMayor;

    public Infantil() {
    }

    public Infantil(int rangoEdadMenor, int rangoEdadMayor, String titulo, double precio, int numeroPaginas, int edad) {
        super(titulo, precio, numeroPaginas, edad);
        this.rangoEdadMenor = rangoEdadMenor;
        this.rangoEdadMayor = rangoEdadMayor;
    }

    public int getRangoEdadMenor() {
        return rangoEdadMenor;
    }

    public void setRangoEdadMenor(int rangoEdadMenor) {
        this.rangoEdadMenor = rangoEdadMenor;
    }

    public int getRangoEdadMayor() {
        return rangoEdadMayor;
    }

    public void setRangoEdadMayor(int rangoEdadMayor) {
        this.rangoEdadMayor = rangoEdadMayor;
    }

    @Override
    public String toString() {
        return "Infantil{" + "rangoEdadMenor=" + rangoEdadMenor + ", rangoEdadMayor=" + rangoEdadMayor + '}';
    }

    
    
    
}
