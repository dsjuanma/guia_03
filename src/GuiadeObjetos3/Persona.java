package GuiadeObjetos3;

public class Persona {
    //Atributos
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;


    public Persona(int dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "\nPersona: "        +
                "\nDNI:.......... " + this.dni +
                "\nNombre:....... " + this.nombre +
                "\nApellido:..... " + this.apellido +
                "\nEmail:........ " + this.email +
                "\nDireccion:.... " + this.direccion;
    }
}
