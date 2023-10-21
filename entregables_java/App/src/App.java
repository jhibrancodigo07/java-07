import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String perros;
        String opt;
        // se crea un arreglo dinamico de mascotas //
        List<RecibeMascota> mascotasList = new ArrayList<>(mascotasList);
        RecibeMascota huskMascota = new RecibeMascota(null, 0, null, 0, null);
        RecibeMascota dogMascota = new RecibeMascota(null, 0, null, 0, null);
        RecibeMascota hachMascota = new RecibeMascota(null, 0, null, 0, null);
        // crear animales dinamicamente //
        do {
            System.out.println("Ingresa una mascota para agregarla a la lista");
            perros = sc.nextLine();
            RecibeMascota.add(new RecibeMascota(perros));
            System.out.println("Quieres agregar otra especie? S/N");
            opt = sc.nextLine();
        } while (opt.equals("S"));

        System.out.println("perros actuales en la estetica es  = " + perros.size());

        sc.close();

    }
}
