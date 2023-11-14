import java.util.ArrayList;
import java.util.List;

import db.Repositorys.GenerosRepository;
import db.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {

        Genero Generos = new Genero(null, "hayabusa");
        List<Genero> generos = new ArrayList<>();
        GenerosRepository generosRepository = new GenerosRepository();
        generos = generosRepository.recuperarTodos();
        generosRepository.agregar(Generos);
        for (Genero genero : generos) {
            System.out.println("id: " + genero.getId() + "\tnombre" + genero.getNombre());

        }
    }
}
