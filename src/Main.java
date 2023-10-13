
import java.util.Scanner;
/**
 *
 * @author Luis Carrasco
 * @version 12-10-2023
 */
public class Main {
    public static void main(String[] args) {
        Tecnico lirbo1 = new Tecnico(false, "Aprende Java", 21.990, 999, 21);
        Infantil libro2 = new Infantil(9, 12, "El Principito", 9900, 50,12);
        
        int opcion=0;
        Scanner leer= new Scanner(System.in);
        do {
            opcion=leer.nextInt();
            System.out.println("Menu Biblioteca Virtual");
            System.out.println("1.-Mostrar Listado");
            System.out.println("2.-Eliminar Libor");
            System.out.println("3.-Salir");
            switch(opcion){

            case 1:
                System.out.println(RegistroLibro.class);
            break;

            case 2:

            break;

            case 3:
            System.out.println("Adios.");
            break;

            default:
            System.out.println("Error, numero no definido");

                          }

            } while (opcion!=3);
    }
    
//no alcance a complerar el menu porque no enendia lo del ICalculable <3
