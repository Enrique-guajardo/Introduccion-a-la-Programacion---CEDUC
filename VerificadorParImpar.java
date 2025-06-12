import java.util.Scanner;

public class VerificadorParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR");

        } else {
            System.out.println("El nuemro " + numero + " es IMPAR");
        }

        sc.close();
    }

}
