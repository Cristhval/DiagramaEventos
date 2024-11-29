import java.util.ArrayList;
import java.util.List;

public class Registro {

    private String invitados;
    private List<Invitacion> invitacionList; //Relacion 1 a N con Invitacion

    //Constructor
    public Registro() {
        this.invitados = "";
        this.invitacionList = new ArrayList<>();
    }

    //metodos de la clase Registro
    public void mostrarInvitados() {
        System.out.println("Invitados registrados: " + invitados);
    }

    public void verificarInvitado(String nombre) {
        if (invitados.contains(nombre)) {
            System.out.println("El invitado " + nombre + " está registrado.");
        } else {
            System.out.println("El invitado " + nombre + " no está registrado.");
        }
    }

    public void registrarParticipante(String nuevoInvitado) {
        if (invitados.isEmpty()) {
            invitados = nuevoInvitado;
        } else {
            invitados += ", " + nuevoInvitado;
        }
    }

    //metodos para manejar las invitaciones
    public void agregarInvitacion(Invitacion invitacion) {
        invitacionList.add(invitacion);
    }

    public void mostrarInvitaciones() {
        System.out.println("Invitaciones registradas:");
        for (Invitacion invitacion : invitacionList) {
            System.out.println("Tipo: " + invitacion.getTipo() + ", Rol: " + invitacion.getRol());
        }
    }

    //Getter y Setter para invitados
    public String getInvitados() {
        return invitados;
    }

    public void setInvitados(String invitados) {
        this.invitados = invitados;
    }

    @Override
    public String toString() {
        return "Registro de invitados: " + invitados;
    }
}
