import java.util.ArrayList;
import java.util.List;

import Screens.VentanaLogin;
import db.conexion.Repositorys.GenerosRepository;
import db.conexion.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        VentanaLogin vl = new VentanaLogin("Mi primera ventana");
        vl.setDefaultCloseOperation(vl.EXIT_ON_CLOSE);
        vl.setVisible(true);

        /*
         * GenerosRepository generosRepository = new GenerosRepository();
         * List<Genero> generos = new ArrayList<>();
         * GenerosRepository generoRepository = new GenerosRepository();
         * generos = generosRepository.recuperarTodos();
         * for (Genero genero : generos) {
         * System.out.println("nombre:" + genero.getNombre());
         * }
         * 
         * Genero Generos = new Genero(null, "hayabusa");
         * List<Genero> generos1 = new ArrayList<>();
         * GenerosRepository generosRepository1 = new GenerosRepository();
         * generos = generosRepository.recuperarTodos();
         * generosRepository.agregar(Generos);
         * for (Genero genero : generos) {
         * System.out.println("id: " + genero.getId() + "\tnombre" +
         * genero.getNombre());
         * }
         */

    }
}