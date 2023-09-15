import java.util.Scanner;

/** Programa que calcule la conversion de dolares a peso**/

public class Main {
    public static void main(String[] args) {
       final double TASA_DOLLAR = 56.25;
       double monto;
       double total;
       String usuario;
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese su nombre: ");
       usuario = scanner.nextLine();

       System.out.println("Ingrese el monto en dolares que desea convertir a pesos ");
       monto = scanner.nextDouble();

       total = TASA_DOLLAR * monto;
       System.out.println("Bienvenido ");
       System.out.println("La conversion es: RD$ " + total);

    }
}