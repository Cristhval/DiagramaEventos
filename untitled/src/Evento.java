import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private Date fecha;
    private String direccion;
    private String nombre;
    private int maximoInvitados;
    private boolean esParaMayores;
    private String tipo;
    private String cronograma;

    //Composicion 1 Evento -> 1...N Organizadores
    private List<Organizador> organizadorList;

    //Relacion N Participantes -> 1 Evento
    private List<Participante> participanteList;

    //Agregacion 1 Evento -> 1...N Elementos Adicionales
    private List<ElementoAdicional> elementoAdicionalList;

    public Evento(Date fecha, String direccion, String nombre, int maximoInvitados, boolean esParaMayores, String tipo, String cronograma) {
        this.fecha = fecha;
        this.direccion = direccion;
        this.nombre = nombre;
        this.maximoInvitados = maximoInvitados;
        this.esParaMayores = esParaMayores;
        this.tipo = tipo;
        this.cronograma = cronograma;
        this.organizadorList = new ArrayList<>();
        this.participanteList = new ArrayList<>();
        this.elementoAdicionalList = new ArrayList<>();  // Inicializamos la lista de elementos adicionales
    }

    //metodos para manejar la relacion con Organizadores
    public void agregarOrganizador(Organizador organizador) {
        if (organizador != null) {
            organizadorList.add(organizador);
        }
    }

    //metodos para manejar la relacion con Participantes
    public void agregarParticipante(Participante participante) {
        if (participante != null && participanteList.size() < maximoInvitados) {
            participanteList.add(participante);
        } else {
            System.out.println("No se puede agregar más participantes o el participante es nulo.");
        }
    }

    //metodos para manejar la relacion con Elementos Adicionales
    public void agregarElementoAdicional(ElementoAdicional elementoAdicional) {
        if (elementoAdicional != null) {
            elementoAdicionalList.add(elementoAdicional);
        }
    }

    public List<ElementoAdicional> obtenerElementosAdicionales() {
        return elementoAdicionalList;
    }

    public void mostrarElementosAdicionales() {
        for (ElementoAdicional elemento : elementoAdicionalList) {
            elemento.mostrarDetalles();
        }
    }

    //metodos para mostrar participantes y organizadores
    public void mostrarParticipantes() {
        for (Participante participante : participanteList) {
            participante.mostrarInformacion();
        }
    }

    public void mostrarOrganizadores() {
        for (Organizador organizador : organizadorList) {
            System.out.println("Organizador: " + organizador.toString());
        }
    }

    //Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaximoInvitados() {
        return maximoInvitados;
    }

    public void setMaximoInvitados(int maximoInvitados) {
        this.maximoInvitados = maximoInvitados;
    }

    public boolean isEsParaMayores() {
        return esParaMayores;
    }

    public void setEsParaMayores(boolean esParaMayores) {
        this.esParaMayores = esParaMayores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCronograma() {
        return cronograma;
    }

    public void setCronograma(String cronograma) {
        this.cronograma = cronograma;
    }
}
