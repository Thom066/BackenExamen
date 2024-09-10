import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        int[] pasos = new int[5];
        int dia = 0;

        while (dia < 5) {
            System.out.print("Ingrese la cantidad de pasos dados el día " + (dia + 1) + ": ");
            pasos[dia] = dato.nextInt();
            dia++;
        }

        int sumPasos = 0;
        for (int i = 0; i < pasos.length; i++) {
            sumPasos += pasos[i];
        }
        double promPasos = (double) sumPasos / pasos.length;

        System.out.println("\nCantidad de pasos por dias:");
        for (int i = 0; i < pasos.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
        }

        System.out.printf("\n EL Promedio de pasos en 5 días es: %.2f\n", promPasos);

    }
}

