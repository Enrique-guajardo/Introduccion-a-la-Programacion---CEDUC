import java.util.Scanner;

public class bol0lej07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduce un numero: ");
        n1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + "es mayor que " + n2);
        } else {
            System.out.println(n2 + "es mayor o igual que " + n1);
        }

        sc.close();

    }

}
