package Interface;

public interface ColaPrioridadTDAE7 {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int numero, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    int Primero();
    int Prioridad();
}