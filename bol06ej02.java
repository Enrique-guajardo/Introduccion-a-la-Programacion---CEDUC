package bol06ej02;

import java.util.Scanner; // Agregue esta linea, ya que con el codigo original no me dejaba avanzar

public class bol06ej02 {

    static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Linea agregada al importar Scanner

        int num1, num2;
        int resultado;

        // Solicitar los números al usuario
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        // Calcular el máximo usando nuestra función
        resultado = maximo(num1, num2);

        // Mostrar el resultado
        System.out.println("El número mayor entre " + num1 + " y " + num2 + " es: " + resultado);

        sc.close(); // Cierre de Scanner, para que asi no de problemas al ejecutar el codigo
    }
}