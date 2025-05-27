import java.util.Scanner; // Necesitamos esta clase para leer la entrada del usuario

public class PromedioNotasEnteras {

    public static void main(String[] args) {
        // 1. Declarar las variables
        String notaTexto1, notaTexto2, notaTexto3; // Para leer las notas como texto
        int nota1, nota2, nota3; // Para almacenar las notas convertidas a números enteros
        int promedio; // Para almacenar el promedio final

        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar al usuario las 3 notas
        System.out.println("--- Calculador de Promedio de Notas ---");

        // Nota 1
        System.out.print("Ingresa la primera nota (entre 1 y 7): ");
        notaTexto1 = scanner.nextLine(); // Lee la entrada como String

        // Nota 2
        System.out.print("Ingresa la segunda nota (entre 1 y 7): ");
        notaTexto2 = scanner.nextLine(); // Lee la entrada como String

        // Nota 3
        System.out.print("Ingresa la tercera nota (entre 1 y 7): ");
        notaTexto3 = scanner.nextLine(); // Lee la entrada como String

        // 3. Convertir las notas de String a int
        // Usamos Integer.parseInt() para hacer esta conversión.
        // Si el usuario ingresa algo que no es un número, esto generará un error (excepción).
        nota1 = Integer.parseInt(notaTexto1);
        nota2 = Integer.parseInt(notaTexto2);
        nota3 = Integer.parseInt(notaTexto3);

        // (Opcional pero recomendable: Validar que las notas estén entre 1 y 7)
        // Por ahora, asumiremos que el usuario ingresa valores válidos para simplificar.
        // En un programa más avanzado, agregarías un bucle para pedir la nota nuevamente si no es válida.

        // 4. Calcular el promedio
        // Sumamos las tres notas y las dividimos por 3.
        promedio = (nota1 + nota2 + nota3) / 3;

        // 5. Usar una estructura condicional para mostrar si aprobó o reprobó
        System.out.println("\n--- Resultado ---");
        System.out.println("Tu promedio final es: " + promedio);

        if (promedio >= 4) {
            System.out.println("¡Felicitaciones! Has APROBADO la asignatura.");
        } else {
            System.out.println("Lo siento, has REPROBADO la asignatura.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
