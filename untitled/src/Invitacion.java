public class Invitacion {

    private String tipo;
    private String rol;

    //Constructor
    public Invitacion(String tipo, String rol) {
        this.tipo = tipo;
        this.rol = rol;
    }

    //metodos getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Rol: " + rol;
    }
}
