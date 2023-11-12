import java.util.ArrayList;
import java.util.List;

import db.Repositorys.GenerosRepository;
import db.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        Genero nuevoGenero = new Genero(1l, "hayabusa");
        List<Genero> generos = new ArrayList<>();
        GenerosRepository generosRepository = new GenerosRepository();
        nuevoGenero.setId(3);
        generosRepository.agregar(nuevoGenero);

        generos = generosRepository.recuperarTodos();
        for (Genero genero : generos) {
            System.out.println("id: " + genero.getId() + "\tnombre" + genero.getNombre());
        }
    }
}
