import java.util.ArrayList;
import java.util.List;

import db.conexion.Repositorys.GenerosRepository;
import db.conexion.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        GenerosRepository generosRepository = new GenerosRepository();
        List<Genero> generos = new ArrayList<>();
        GenerosRepository generoRepository = new GenerosRepository();
        generos = generosRepository.recuperarTodos();
        for (Genero genero : generos) {
            System.out.println("nombre:" + genero.getNombre());
        }
    }
}

/**
 * try (Connection connection = ConexionDB.obtenerConexion()) {
 * System.out.println("base conectada");
 * 
 * } catch (Exception e) {
 * System.out.println("base no conectada");
 * }
 * }
 * }
 */

/*
 * 
 * }
 * }
 * }
 */

// }
// }
// }
// Connection conexion;
// try{
// Class.forName("com.mysql.cj.jdbc.driver");
// conexion =
// DriverManager.getConnection("jdbc:msql://localhost:3306/empleados", "root",
// "root");
// System.out.println("se conecto a la base de datos");
// } catch (Exception e){
// System.out.println("error al conectar");
