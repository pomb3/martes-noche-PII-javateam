import Implementacion.Estrategia_1;
import Implementacion.Estrategia_2;
import Interfaces.PilaEj6TDA;

public class Ejercicio6 {

    public static void main(String[] args) {
        PilaEj6TDA pila = new Estrategia_2();

        pila.InicializarPila();

        /*
        Navegación de Directorios: Entrás a C:/, luego a Usuarios, luego a
        Documentos.o Consigna: ¿Cómo usás una Pila para que el sistema sepa a qué
        carpeta volver si apretás "Subir un nivel"?
        * */

        pila.Apilar("C:/");
        System.out.printIn("Entraste a: ");
        pila.Apilar("/Usuarios");
        pila.Apilar("/Documentos");


    }


}
