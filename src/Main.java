import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("*CALCULADORA DE HUELLA DE CARBONO*");
        System.out.println("Esta calculadora te permitira conocer una estimación de la huella de carbono " +
                "que generas cuando usas los siguientes medios de transporte");
        System.out.println("Seleccione un medio de transporte (Escriba su respuesta)");
        System.out.println(opciones()); //opciones es la funcion donde se desplega las opc.

        String opcseleccionada= scanner.next();
        // Holaaa
        switch (opcseleccionada) {
            case "1":
                System.out.println("Cuántos Km recorres a la semana en tu auto");
                int kmauto = scanner.nextInt();
                System.out.println("Calculando la emisión de CO2 de tu Automovil...");
                System.out.println("Tu huella de carbono estimada es de " + kmauto*0.184 + " kg de CO2 por semana, en promedio");
                break;

            case "2":
                System.out.println("Cuántos Km recorres a la semana en tu motocicleta");
                int kmmoto = scanner.nextInt();
                System.out.println("Calculando la emisión de CO2 de tu motocicleta...");
                System.out.println("Tu huella de carbono estimada de " + kmmoto*0.175 + " kg de CO2 por semana, en promedio");
                break;

            case "3":
                System.out.println("Cuántos Km recorres a la semana en autobús");
                int kmautobus = scanner.nextInt();
                System.out.println("Calculando la emisión de CO2 al usar autobús...");
                System.out.println("Tu huella de carbono estimada de " + kmautobus*1.15 + " kg de CO2 por semana, en promedio");
                break;
            default:
                System.out.println("Has introducido una opción incorrecta");

        }

        System.out.println("\n ¿Cuánto pagas en tu recibo de energía eléctrica?");
        double energia = scanner.nextDouble();
        System.out.println("La huella de carbono por tu consumo de energía es de " + energia*0.0003 + "kg de CO2");



    }

    static String opciones(){
        System.out.println("1. Automovil");
        System.out.println("2. Motocicleta");
        System.out.println("3. Autobus");
        return "  ";
    }



}

