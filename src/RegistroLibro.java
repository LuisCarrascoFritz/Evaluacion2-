
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Luis Carrasco
 * @version 12-10-2023
 */
public class RegistroLibro {
    private boolean validad;
    private Libro libro;

    public RegistroLibro() {
        List<Libro> listaLibro = new ArrayList();
    }

    public RegistroLibro(boolean validad, Libro libro) {
        this.validad = validad;
        this.libro = libro;
    }

    public boolean isValidad() {
        return validad;
    }

    public void setValidad(boolean validad) {
        this.validad = validad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "RegistroLibro{" + "validad=" + validad + ", libro=" + libro + '}';
    }
    
    public void mostrarLibros(){
        System.out.println(libro);
    }
}
