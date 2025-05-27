import java.util.Scanner; 

public class PromedioNotasEnteras {

    public static void main(String[] args) {
        
        String nota1Str, nota2Str, nota3Str; 
        int nota1, nota2, nota3;             
        int promedio;                       
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese la nota 1 (entera entre 1 y 7): ");
        nota1Str = teclado.nextLine(); 

        
        System.out.print("Ingrese la nota 2 (entera entre 1 y 7): ");
        nota2Str = teclado.nextLine();

        
        System.out.print("Ingrese la nota 3 (entera entre 1 y 7): ");
        nota3Str = teclado.nextLine();

        
        try {
            nota1 = Integer.parseInt(nota1Str);
            nota2 = Integer.parseInt(nota2Str);
            nota3 = Integer.parseInt(nota3Str);

            
            promedio = (nota1 + nota2 + nota3) / 3;

            
            System.out.println("El promedio final es: " + promedio);

            
            if (promedio >= 4) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }

        } catch (NumberFormatException e) {
            
            System.out.println("Error: Por favor, ingrese solo números enteros para las notas.");
        } finally {
            
            teclado.close();
        }
    }
}
