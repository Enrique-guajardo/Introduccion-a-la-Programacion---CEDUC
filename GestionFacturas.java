import java.util.Scanner;

public class GestionFacturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float facturacionTotal = 0;
        int litrosCodigo1 = 0;
        int facturasMas600 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("----- Factura " + i + "-----");

            System.out.println("SKU del Articulo: ");
            int codigo = sc.nextInt();

            System.out.println("Cantidad vendida: ");
            int litros = sc.nextInt();

            System.out.println("Precio por litro (en €): ");
            float precio = sc.nextFloat();

            float importeFactura = litros * precio;

            facturacionTotal += importeFactura;

            if (codigo == 1) {
                litrosCodigo1 += litros;
            }
            if (importeFactura > 600) {
                facturasMas600++;
            }

            System.out.printf("Importe factura: ", importeFactura);
        }

        System.out.println("----- RESULTADOS -----");
        System.out.printf("Facturacion total: ", facturacionTotal);
        System.out.println("Litros vendidos del articulo 1: " + litrosCodigo1);
        System.out.println("Facturas de mas de 600 Euros: " + facturasMas600);

        sc.close();

    }
}
