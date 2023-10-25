public class Sentencias {

    void ContarSeries() {
        int n = 0;
        int cont = 0;

        while (cont < 15) {

            if (n % 2 != 0) {
                System.out.println(n);
                cont++;
            }
            n++;
        }

    }

}
