public class Fibonaci {

    void ContarSeries() {

        int elementos = 15; // Número de elementos de la serie a imprimir
        long a = 0, b = 1; // Inicializamos los dos primeros números de la serie

        System.out.println("Serie de Fibonaci:");
        for (int i = 1; i <= elementos; i++) {
            System.out.print(a);

            if (i < elementos) {
                System.out.print(", ");
            }

            long temp = a + b;
            a = b;
            b = temp;
        }
    }
}
