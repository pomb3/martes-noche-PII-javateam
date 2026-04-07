public enum Prioridades {

    // 1. Definir las constantes y pasarles los valores entre paréntesis
    EMBARAZADA(5, "Embarazada"),
    ADULTO_MAYOR(4, "Adulto Mayor"),
    DISCAPACIDAD(3, "Cliente CNRT"),
    VIP(2, "Clienet VIP"),
    REGULAR(1, "Cliente regular")
    ;


    // 2. Declarar los atributos (es buena práctica hacerlos 'final')
    private final int nivel;
    private final String descripcion;

    // 3. Crear el constructor (en los enum, el constructor siempre es privado por defecto)
    Prioridades(int nivel, String descripcion) {
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    // 4. Crear los Getters para poder leer los datos desde afuera
    public int getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }
}