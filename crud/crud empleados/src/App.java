import java.util.ArrayList;
import java.util.List;

import db.Repositorys.GenerosRepository;
import db.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        Genero nuevoGenero = new Genero(null, "hayabusa");
        List<Genero> generos = new ArrayList<>();
        GenerosRepository generosRepository = new GenerosRepository();

        generosRepository.agregar(nuevoGenero);

        generos = generosRepository.recuperarTodos();
        for (Genero genero : generos) {
            System.out.println("nombre: " + genero.getNombre());
        }
    }
}
