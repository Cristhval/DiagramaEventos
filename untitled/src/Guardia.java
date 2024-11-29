public class Guardia extends Persona {

    private String lugarAsignado;
    private Registro registro; //Asociacion unidireccional con Registro

    //Constructor
    public Guardia(String nombre, String apellido, String numeroDeCedula, int edad, String lugarAsignado, Registro registro) {
        super(nombre, apellido, numeroDeCedula, edad);
        this.lugarAsignado = lugarAsignado;
        this.registro = registro;
    }

    //metodo de la clase Guardia
    public void cuidarLugar() {
        System.out.println("El guardia " + getNombre() + " " + getApellido() + " está cuidando el lugar asignado: " + lugarAsignado);
    }

    //metodos para la relación con Registro
    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    //Getters y setters para lugarAsignado
    public String getLugarAsignado() {
        return lugarAsignado;
    }

    public void setLugarAsignado(String lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }

    //Implementacion del metodo abstracto de Persona
    @Override
    public void mostrarInformacion() {
        System.out.println("Guardia: " + getNombre() + " " + getApellido() +
                "\nCédula: " + getNumeroDeCedula() +
                "\nEdad: " + getEdad() +
                "\nLugar asignado: " + lugarAsignado);

        if (registro != null) {
            System.out.println("Registro asociado: " + registro);
        } else {
            System.out.println("No hay un registro asociado.");
        }
    }
}
