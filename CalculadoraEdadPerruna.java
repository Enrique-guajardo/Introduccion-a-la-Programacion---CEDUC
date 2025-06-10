import java.util.Scanner; 

public class CalculadoraEdadPerro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("¡Hola! Por favor, ingresa tu nombre: ");
        String nombreUsuario = sc.nextLine(); 


        System.out.print(nombreUsuario + ", por favor, ingresa la edad de tu perro en años humanos: ");
        int edadHumanaPerro = sc.nextInt();


        int edadPerroPerrunos = edadHumanaPerro * 7;


        System.out.println("¡Qué interesante! Si tu perro tiene " + edadHumanaPerro + " años humanos,");
        System.out.println("eso equivale a " + edadPerroPerrunos + " años perrunos.");
        System.out.println("¡Espero que tú y tu amigo peludo disfruten mucho tiempo juntos!");


        scanner.close();
    }
}
