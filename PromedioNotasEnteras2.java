import java.util.Scanner;

public class PromedioNotasEnteras {

public static void main(String[] args) {
    
    String notaTexto1, notaTexto2, notaTexto3;
    int nota1, nota2, nota3;
    int promedio;

    Scanner sc = new Scanner(System.in);

    System.out.println("Promediador de Notas (1 al 7)");

    System.out.println("Ingresa la primera nota: ");
    notaTexto1 = sc.nextLine();

    System.out.println("Ingresa la segunda nota: ");
    notaTexto2 = sc.nextLine();

    System.out.println("Ingresa la tercera nota: ");
    notaTexto3 = sc.nextLine();

    nota1 = Integer.parseInt(notaTexto1);
    nota2 = Integer.parseInt(notaTexto2);
    nota3 = Integer.parseInt(notaTexto3);

    promedio = (nota1 + nota2 + nota3) /3;

    System.out.println("Tu promedio es: "+ promedio);


    if (promedio >= 4){
        System.out.println("Aprobado");
    }else{
        System.out.println("Reprobado");
    }
 
    sc.close();

    }
    
}
