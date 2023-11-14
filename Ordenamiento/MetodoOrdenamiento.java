package Ordenamiento;

public class MetodoOrdenamiento {

    public static void imprimeArreglo(String mensaje, int[] arreglo) {
        System.out.print(mensaje);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void saltoLinea() {
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arreglo = { 11, 23, 9, 20 };
        imprimeArreglo("Arreglo inicial: ", arreglo);
        saltoLinea();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < arreglo.length - 1; j++) {
                imprimeArreglo("  Arreglo comparando: ", arreglo);
                System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");

                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("    ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);

                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    imprimeArreglo("    Arreglo modificado: ", arreglo);
                    saltoLinea();
                }
            }
        }

        saltoLinea();
        imprimeArreglo("Arreglo final: ", arreglo);
    }
}
