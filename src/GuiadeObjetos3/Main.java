package GuiadeObjetos3;

import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch (selected) {
                case 1:
                    Cilindro cilindro = new Cilindro();
                    System.out.println(cilindro);

                    System.out.println("\nRadio:...... " + cilindro.getRadio());
                    System.out.println("Altura:..... " + cilindro.getAltura());
                    System.out.println("Area:....... " + cilindro.resultadoArea());
                    System.out.println("Volumen:.... " + cilindro.volumen());

                    Cilindro cilindro1 = new Cilindro(2, 5);
                    System.out.println(cilindro1);

                    System.out.println("\nRadio:...... " + cilindro1.getRadio());
                    System.out.println("Altura:..... " + cilindro1.getAltura());
                    System.out.println("Area:....... " + cilindro1.resultadoArea());
                    System.out.println("Volumen:.... " + cilindro1.volumen());


                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    Estudiante estudiante = new Estudiante(30123321, "Marcelo", "Tinelli", "chauchau@gmail.com", "estudio 1231", 2011, 6500, "TUP");
                    Estudiante estudiante1 = new Estudiante(32456421, "Pedro", "Picapiedras", "prehistorico@gmail.com", "amazonas 534", 2009, 5700, "TUP");
                    Estudiante estudiante2 = new Estudiante(28123552, "Sergio", "Ramos", "soloreal@gmail.com", "san martin 52", 2011, 2400, "TUP");
                    Estudiante estudiante3 = new Estudiante(20643643, "Leo", "Astrada", "futboleroloco@gmail.com", "rivadavia 346", 2012, 1400, "TUP");

                    Staff miembro = new Staff(14456123, "Mario", "Pergolini", "abandonoboca@hotmail.com", "moreno al 563", 50000, "Mañana");
                    Staff miembro1 = new Staff(16456663, "Casandra", "Lopez", "vedettaza@hotmail.com", "Olavarria 6632", 25000, "Noche");
                    Staff miembro2 = new Staff(31487123, "Mirtha", "Legrand", "mirthalauno@hotmail.com", "castelli 5346", 35000, "Mañana");
                    Staff miembro3 = new Staff(18673997, "Sofia", "Gala", "sofga@hotmail.com", "Guemes 2342", 45000, "Noche");

                    Persona[] colegio = new Persona[8];
                    colegio[0] = estudiante;
                    colegio[1] = estudiante1;
                    colegio[2] = estudiante2;
                    colegio[3] = estudiante3;
                    colegio[4] = miembro;
                    colegio[5] = miembro1;
                    colegio[6] = miembro2;
                    colegio[7] = miembro3;

                    int totalEstudiantes = 0;
                    int totalEmpleados = 0;

                    for(Persona i : colegio) {
                        if(i != null) {
                            if(i instanceof Estudiante) totalEstudiantes++; // verificamos si pertenece a la clase Estudiante con instanceof, de ser asi sumamos uno
                            if(i instanceof Staff) totalEmpleados++;// verificamos si pertenece a la clase Staff con instanceof, de ser asi sumamos uno
                        }
                    }

                    System.out.println("Total alumnos del colegio:..... " + totalEstudiantes);
                    System.out.println("Total miembros del staff:...... " + totalEmpleados);

                    double totalIngresos = 0;

                    for(Persona i : colegio) {
                        if(i != null) {
                            if(i instanceof Estudiante){
                                totalIngresos+=((Estudiante)i).getCuota();
                            }
                        }
                    }

                    System.out.println("Total ingreso mensual:......... $" + totalIngresos);


                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:


                    Pausa.pausar();
                    limpiarPantalla();

                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("¡¡¡Ejercicio Inexistente.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        } while (selected != 0);
    }


    public static int menu() { // Menu
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    MENU");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [1].Ejercicio 01.");
        System.out.println("\t   [2].Ejercicio 02.");
        System.out.println("\t   [3].Ejercicio 03.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [0].Salir del programa.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n\n\t  Elija una opcion: ");
        System.out.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            System.out.println("\n");
            System.out.println(" ----------------------------------------");
            System.out.println("|Presionar la tecla ENTER para continuar.|");
            System.out.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            System.out.println("\n");
            aceptar.nextLine(); // queda esperando que precionemos la tecla enter para continuar
        }
    }
}
