public class Organizador extends Persona implements Gestion {

    private String contacto;

    public Organizador(String nombre, String apellido, String numeroDeCedula, int edad, String contacto) {
        super(nombre, apellido, numeroDeCedula, edad);
        this.contacto = contacto;
    }

    //metodos de la interfaz Gestion
    @Override
    public void crearEvento() {
        System.out.println("Evento creado por el organizador: " + getNombre() + " " + getApellido());
    }

    @Override
    public void modificarEvento() {
        System.out.println("Evento modificado por el organizador: " + getNombre() + " " + getApellido());
    }


    public void gestionarEvento() {
        System.out.println("Gestión general del evento por el organizador: " + getNombre() + " " + getApellido());
    }

    //Implementacion del metodo abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Organizador: " + getNombre() + " " + getApellido() +
                "\nContacto: " + contacto);
    }

    //Getters y Setters
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", numeroDeCedula=" + getNumeroDeCedula() +
                ", edad=" + getEdad() +
                ", contacto=" + contacto +
                '}';
    }
}
