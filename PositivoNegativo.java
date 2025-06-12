import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero " + numero + " es positivo. ");
            } else {
                System.out.println("El numero " + numero + "es negativo. ");
            }

            System.out.println("Introduce otro numero: ");
            numero = sc.nextInt();

        }

        System.out.println("Has introducido 0. Fin");

        sc.close();

    }

}
