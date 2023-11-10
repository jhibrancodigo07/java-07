import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import db.conexion.Repositorys.GeneroRepository;
import db.conexion.models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        Genero nuevoGenero = new Genero(2, "hayabusa");
        List<Genero> generos = new ArrayList<>();
        GeneroRepository generoRepository = new GeneroRepository();

        generoRepository.agregar(nuevoGenero);
        generos = generoRepository.recuperarTodos();
        for (Genero genero : generos) {
            System.out.println("nombre: " + genero.getNombre());
        }
    }
}
// try (Connection connection = ConexionDB.obtenerConexion()) {
// System.out.println("base conectada");

// } catch (Exception e) {
// System.out.println("base no conectada");

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
