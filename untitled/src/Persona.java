public abstract class Persona {

    private String nombre;
    private String apellido;
    private String numeroDeCedula;
    private int edad;

    public Persona(String nombre, String apellido, String numeroDeCedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCedula = numeroDeCedula;
        this.edad = edad;
    }

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo abstracto para implementar en subclases
    public abstract void mostrarInformacion();
}
