/**
 *
 * @author Luis Carrasco
 * @version 12-10-2023
 */
public abstract class Libro {
    protected String titulo;
    protected double precio;
    protected int numeroPaginas,edad;

    public Libro() {
    }

    public Libro(String titulo, double precio, int numeroPaginas, int edad) {
        this.titulo = titulo;
        this.precio = precio;
        this.numeroPaginas = numeroPaginas;
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", numeroPaginas=" + numeroPaginas + ", edad=" + edad + '}';
    }
    
    
    
}
