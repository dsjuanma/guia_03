package GuiadeObjetos3;



/*
        Vamos a diseñar un programa que nos permita gestionar el personal que concurre
        a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
        miembros de staff que a diferencia de los estudiantes, estos perciben una
        remuneración. Ambos tipos comparten la característica de Persona que posee los
        atributos de dni, nombre, apellido, email y direccion.
        Y finalmente tenemos al miembro de Staff que también es una Persona pero
        con características propias de alguien que trabaja para una institución, por ejemplo
        salario y turno, este puede ser mañana o noche.


 */

public class Staff extends Persona{

    //Atributos
    private double salario;
    private String turno;

    public Staff(int dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni,nombre,apellido,email,direccion);
        this.salario = salario;
        this.turno = turno;
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
