package mascotas;

public class App {
    public static void main(String[] args) {

        RecibeMascota[] esteticadeperros = new RecibeMascota[3];

        RecibeMascota Mascota1 = new RecibeMascota("sam", 5, "husky", 10.0, "erick");
        RecibeMascota Mascota2 = new RecibeMascota("lili", 6, "akita", 15.0, "yaz");
        RecibeMascota Mascota3 = new RecibeMascota("drako", 3, "pitbull", 13.0, "claudio");

        esteticadeperros[0] = Mascota1;
        esteticadeperros[1] = Mascota2;
        esteticadeperros[2] = Mascota3;

        System.out.println("perros actuales en la estetica: " + esteticadeperros.length);
    }
}
