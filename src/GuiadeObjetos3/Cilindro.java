package GuiadeObjetos3;

public class Cilindro extends Circulo {

    //Atributos
    private double altura = 1.0;

    //Constructores
    public Cilindro(){
        super();
    }
    public Cilindro(double radio, double altura){
        super(radio);
        this.altura=altura;
    }

    public Cilindro(Double altura){
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double volumen (){
        return (super.resultadoArea() * altura);
    }

    @Override
    public double resultadoArea() {
        return ((2*Math.PI * super.getRadio()*altura) + (2 * super.resultadoArea()));
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "Clase Heredada de la clase Circulo=" + super.toString() +
                ", Altura='" + altura + '\'' +
                '}';
    }

}
