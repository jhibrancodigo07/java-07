package db.conexion.Repositorys;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import db.conexion.models.Genero;
import interfaces.Repositoryinterface;

public class GeneroRepository implements Repositoryinterface<Genero> {

    @Override
    public Genero recuperarid(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void agregar(Genero entidad) {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(q);) {
                preparedStatement.setString(1, entidad.getNombre());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("error al agregar genero");
            }

        } catch (Exception e) {
            System.out.println("error al conectar");

        }

    }

    @Override
    public void eliminar(Genero entidad) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modificar(Genero entidad) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                System.out.println("id" + resultSet.getLong("id") + "\tnombre" + resultSet.getString("nombre"));

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    private List<Genero> dameListaGeneros(ResultSet resultSet) {
        List<Genero> generos = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                generos.add(new Genero(id, nombre));
            }
            return generos;
        } catch (Exception e) {
            System.out.println("error al recuperar generos");
        }
        return generos;
    }

}
