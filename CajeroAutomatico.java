import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int saldo = 15000; // Saldo Inicial
        boolean salir = false;

        System.out.println("----- CAJERO AUTOMATICO Kike_Dev -----");

        while (!salir) {
            System.out.println("Bienvenido elija una Opción");
            System.out.println("1. Ver mi saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Terminar");
            System.out.println("Elige (1-4): ");

            int opcion = sc.nextInt();
            // Inicio de Opciones: 1 y 2
            if (opcion == 1) {
                System.out.println(" --- Tu Saldo es: $" + saldo);
            } else if (opcion == 2) {
                System.out.print("--- Cuanto quieres Depositar $");
                int cantidad = sc.nextInt();

                if ((cantidad > 0)) {
                    saldo += cantidad;
                    System.out.println("Listo, Ahora tienes $" + saldo);
                } else {
                    System.out.println("No puedes depositar una cantidad negativa");
                }
            }
            // Opcion 3
            else if (opcion == 3) {
                System.out.println("--- Cuanto quieres retirar $");
                int cantidad = sc.nextInt();

                if (cantidad > saldo) {
                    System.out.println("Lo sentimos, no tienes saldo suficiente");
                    System.out.println("Tu saldo es: $" + saldo);
                } else if (cantidad <= 0) {
                    System.out.println("Cantidad no valida");
                } else {
                    saldo -= cantidad;
                    System.out.println("Listo, Ahora tienes: $" + saldo);
                } // Opcion 4
            } else if (opcion == 4) {
                salir = true;
                System.out.println("--- Gracias por utilizar el Cajero");
            } else {
                System.out.println("Opcion incorrecta, Elige opcion 1, 2, 3, 4");
            }
        }
        sc.close();
    }
}
