public class ElementoAdicional {

    private String nombre;

    //Constructor
    public ElementoAdicional(String nombre) {
        this.nombre = nombre;
    }

    //metodo para mostrar los detalles del elemento adicional
    public void mostrarDetalles() {
        System.out.println("Elemento Adicional: " + nombre);
    }

    //Getter y setter para 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
