import java.util.Scanner;

public class CalculadoraCanina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por Favor ingresa tu nombre: ");
        String nombreDueño = sc.nextLine();

        System.out.print("Hola " + nombreDueño + ", ¿que edad humana tiene tu perro?: ");
        int edadHumana = sc.nextInt();

        int edadCanina = edadHumana * 7;

        System.out.println("Segun los datos ingresados...");
        System.out.println("La edad de tu perro en años perrunos es: " + edadCanina);
        System.out.println("Te felicitamos por cuidar muy bien a tu mascota, " + nombreDueño);

        sc.close();

    }
}