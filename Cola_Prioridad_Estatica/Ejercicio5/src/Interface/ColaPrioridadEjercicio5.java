package Interface;

/*
En este caso no vamos a trabajar con prioridades, en la fila todos tienen la misma prioridad, asi que el vibe coder va a tener que furmarse la fila asi como esta
*
*/

public interface ColaPrioridadEjercicio5 {
    void IniciarCola();
    void Acolar(String nombre);
    void Desacolar();
    boolean ColaVacia();
    String Primero();

}
