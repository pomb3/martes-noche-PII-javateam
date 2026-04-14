import Implementacion.DiccionarioSimpleDinamico;
import Interface.DiccionarioSimpleTDA;

public class Main {
    public static void main(String[] args) {
        DiccionarioSimpleTDA d = new DiccionarioSimpleDinamico();

        d.InicializarDiccionario();

        d.Agregar("Juan", "15-5020-5245");
        d.Agregar("Pepe", "11-6127-6938");
        d.Agregar("Ramon", "14-0564-7789");
        d.Agregar("Pepe", "15-5124-7788"); // actualiza el valor de la clave 2

        System.out.println("Claves del diccionario:");
        String[] claves1 = d.Claves();
        for (String nombre : claves1) {
            System.out.println("-" + nombre);
        }

        d.Eliminar("Pepe");

        System.out.println("Claves luego de eliminar la clave 2:");
        String[] claves2 = d.Claves();
        for (String nombre : claves2) {
            System.out.println("-" + nombre);
        }
    }
}
