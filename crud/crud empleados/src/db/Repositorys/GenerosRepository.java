package db.Repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.ConexionDB;
import db.models.Genero;
import interfaces.Repositoryinterface;

public class GenerosRepository implements Repositoryinterface<Genero> {

    @Override
    public void agregar(Genero entidad) {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?)";
            try (PreparedStatement PreparedStatement = connection.prepareStatement(q);) {
                PreparedStatement.setString(1, entidad.getNombre());
                PreparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("error al agregar genero");

            }

        } catch (Exception e) {
            System.out.println("error al consultar");
        }

    }

    @Override
    public void eliminar(Genero entidad) {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "ELIMINAR INTO Genero VALUES(null,?)";
            PreparedStatement PreparedStatement = connection.prepareStatement(q);
            PreparedStatement.setString(1, entidad.getNombre());
            PreparedStatement.executeUpdate();
        } catch (Exception e) {

        }
    }

    @Override
    public void modificar(Genero entidad) {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "MODIFICAR INTO generos VALUES(null,?)";
            PreparedStatement PreparedStatement = connection.prepareStatement(q);
            PreparedStatement.setString(1, entidad.getNombre());
            PreparedStatement.executeUpdate();
        } catch (Exception e) {

        }

    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            return dameListaGenero(resultSet);
        } catch (Exception e) {
            System.out.println("error en query recuperarTodos");
        }

        return null;
    }

    public List<Genero> dameListaGenero(ResultSet resultSet) {
        List<Genero> Genero = new ArrayList();
        try {
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                Genero.add(new Genero(id, nombre));
            }
            return Genero;
        } catch (Exception e) {
            System.out.println("Error al recuperar generos");
        }
        return Genero;
    }

    @Override
    public Genero recuperarid(Long id) {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos WHERE ID = ? ";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(q);
                preparedStatement.setLong(1, id);
                return dameEntidadResultSet(preparedStatement.executeQuery());
            } catch (Exception e) {
                System.out.println("error al crear el statement o el query");
            }

        } catch (Exception e) {
            System.out.println("error al conectar");
        }
        return null;
    }

    private Genero dameEntidadResultSet(ResultSet resultSet) {

        Long id = 0L;
        String nombre = "";
        try {
            while (resultSet.next()) {
                id = resultSet.getLong("id");
                nombre = resultSet.getString("nombre");
            }
            return new Genero(id, nombre);
        } catch (Exception e) {
            System.out.println("Error al recuperar resultSet");
        }
        return null;
    }
}
