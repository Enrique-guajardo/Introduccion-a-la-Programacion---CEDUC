import java.util.Scanner;

public class PromedioNotasEnteras {

    public static void main(String[] args) {
    
        String notaTexto1, notaTexto2, notaTexto3; 
        int nota1, nota2, nota3;
        int promedio;

        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("--- Calculador de Promedio de Notas ---");

        // Nota 1
        System.out.print("Ingresa la primera nota (entre 1 y 7): ");
        notaTexto1 = sc.nextLine();

        // Nota 2
        System.out.print("Ingresa la segunda nota (entre 1 y 7): ");
        notaTexto2 = sc.nextLine(); 

        // Nota 3
        System.out.print("Ingresa la tercera nota (entre 1 y 7): ");
        notaTexto3 = sc.nextLine(); 

        
        
        
        nota1 = Integer.parseInt(notaTexto1);
        nota2 = Integer.parseInt(notaTexto2);
        nota3 = Integer.parseInt(notaTexto3);

        
        promedio = (nota1 + nota2 + nota3) / 3;

        
        
        System.out.println("Tu promedio es: " + promedio);

        if (promedio >= 4) {
            System.out.println("¡Felicitaciones! Has APROBADO la asignatura.");
        } else {
            System.out.println("Lo sentimos, has REPROBADO la asignatura.");
        }

        
        sc.close();
    }
}
