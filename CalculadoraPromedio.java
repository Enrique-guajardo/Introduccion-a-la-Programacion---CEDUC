import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA - PROMEDIO FINAL");
        System.out.println("Se calculara tu nota final: ");
        System.out.println("Tareas (30%)");
        System.out.println("Pruebas (40%)");
        System.out.println("Proyecto Final (30%)");

        System.out.print("Ingresa la nota de Tareas (0-100): ");
        double tareas = sc.nextDouble();

        System.out.print("Ingresa la nota de Pruebas (0-100): ");
        double pruebas = sc.nextDouble();

        System.out.print("Ingresa la nota de Proyecto Final (0-100): ");
        double proyecto = sc.nextDouble();

        double promedio = (tareas * 0.30) + (pruebas * 0.40) + (proyecto * 0.30);

        promedio = Math.round(promedio * 100) / 100;

        System.out.println("----- RESULTADO FINAL -----");
        System.out.println("Tu promedio es: " + promedio);

        if (promedio >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobaste");
        }

        sc.close();

    }

}
