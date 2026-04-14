import Implementacion.ConjuntoDinamico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoDinamico();
        c.InicializarConjunto();

        int idVotante = 3;

        if (!c.Pertenece(idVotante)) {
            c.Agregar(idVotante);
            System.out.println("Voto registrado para el ID: " + idVotante);
        } else {
            System.out.println("El ID " + idVotante + " ya votó. No puede votar dos veces");
        }
    }
}