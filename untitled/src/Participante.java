public class Participante extends Persona {

    private Invitacion invitacion;//Dependencia de la clase Invitacion
    private Evento evento;//Relacion con Evento

    //Constructor
    public Participante(String nombre, String apellido, String numeroDeCedula, int edad, Invitacion invitacion, Evento evento) {
        super(nombre, apellido, numeroDeCedula, edad);
        this.invitacion = invitacion;
        this.evento = evento;
    }

    //Implementacion del metodo abstracto de Persona
    @Override
    public void mostrarInformacion() {
        System.out.println("Participante: " + getNombre() + " " + getApellido() +
                "\nCédula: " + getNumeroDeCedula() +
                "\nEdad: " + getEdad() +
                "\nTipo de invitación: " + invitacion.getTipo() +
                "\nRol de invitación: " + invitacion.getRol() +
                "\nEvento: " + evento.getNombre() + " (" + evento.getFecha() + ")");
    }

    //metodo para mostrar la invitacion
    public void mostrarInvitacion() {
        System.out.println("Invitación de " + getNombre() + ":");
        System.out.println("Tipo: " + invitacion.getTipo());
        System.out.println("Rol: " + invitacion.getRol());
    }

    //Getter y Setter para la invitacion
    public Invitacion getInvitacion() {
        return invitacion;
    }

    public void setInvitacion(Invitacion invitacion) {
        this.invitacion = invitacion;
    }

    //Getter y Setter para el evento
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
