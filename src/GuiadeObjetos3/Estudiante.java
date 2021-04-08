package GuiadeObjetos3;


/*
    Vamos a diseñar un programa que nos permita gestionar el personal que concurre
    a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
    miembros de staff que a diferencia de los estudiantes, estos perciben una
    remuneración. Ambos tipos comparten la característica de Persona que posee los
    atributos de dni, nombre, apellido, email y direccion.
    Por otro lado tenemos al Estudiante que posee las características de
    Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
    mensual y carrera.

 */

public class Estudiante extends Persona {
    //Atributos
    private int ingreso;
    private double cuota;
    private String carrera;

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int ingreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.ingreso = ingreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public double getCuota() {
        return cuota;
    }

    @Override
    public String toString() {
        return  "\nEstudiante: "       +
                "\nAño Ingreso:..... " + this.ingreso +
                "\nCuota:........... " + this.cuota +
                "\nCarrera:......... " + this.carrera +
                "\nDNI:............. " + this.dni +
                "\nNombre:.......... " + this.nombre +
                "\nApellido:........ " + this.apellido +
                "\nEmail:........... " + this.email +
                "\nDireccion:....... " + this.direccion;
    }
}
