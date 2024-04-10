
//ocuparemos el java util scanner para pedir valores al usuario
//en este ejercicio se pide 3 resistencias en paralelo y se calcula la resistencia total
import java.util.Scanner;

public class A01_Resistencia {
    public static void main(String[] args) {

        // declaracion de variables
        float resistencia1, resistencia2, resistencia3, resistenciaTotal;
        Scanner leer = new Scanner(System.in); // inicializar scanner
        // Solicitud de valores
        System.out.println("Ingrese resistencia 1");
        resistencia1 = leer.nextFloat();
        while (resistencia1 <= 0) {
            System.out
                    .println("La resistencia debe ser un valor positivo. Por favor, ingrese resistencia 1 nuevamente:");
            resistencia1 = leer.nextFloat();
        }
        System.out.println("Ingrese resistencia 2");
        resistencia2 = leer.nextFloat();
        while (resistencia2 <= 0) {
            System.out
                    .println("La resistencia debe ser un valor positivo. Por favor, ingrese resistencia 2 nuevamente:");
            resistencia2 = leer.nextFloat();
        }
        System.out.println("Ingrese resistencia 3");
        resistencia3 = leer.nextFloat();
        while (resistencia3 <= 0) {
            System.out
                    .println("La resistencia debe ser un valor positivo. Por favor, ingrese resistencia 3 nuevamente:");
            resistencia3 = leer.nextFloat();
        }
        resistenciaTotal = 1 / ((1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3));
        System.out.println("La resistencia total en parelelo es " + resistenciaTotal);

    }
}
