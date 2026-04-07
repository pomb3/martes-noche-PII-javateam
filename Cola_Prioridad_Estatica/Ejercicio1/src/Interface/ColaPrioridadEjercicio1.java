package Interface;

public interface ColaPrioridadEjercicio1 {
    void InicializarColaPrioridad();
    void AcolarPrioridad(String cliente, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    String Primero();
    int Prioridad();
}