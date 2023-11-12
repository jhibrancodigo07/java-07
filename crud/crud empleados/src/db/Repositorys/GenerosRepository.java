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
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
                preparedStatement.setString(1, entidad.getNombre());
                preparedStatement.executeQuery();
            } catch (Exception e) {
                System.out.println("error al agregar genero");
            }

        } catch (Exception e) {
            System.out.println("error al conectar");

        }

    }

    @Override
    public void eliminar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "ELIMINAR INTO generos VALUES(null,?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(q);
            preparedStatement.setString(1, entidad.getNombre());
            preparedStatement.executeUpdate();
        } catch (Exception e) {

        }
    }

    @Override
    public void modificar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "MODIFICAR INTO generos VALUES(null,?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(q);
            preparedStatement.setString(1, entidad.getNombre());
            preparedStatement.executeUpdate();
        } catch (Exception e) {

        }

    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(q);
                return dameListageneros(resultSet);
            } catch (Exception e) {
                System.out.println("error en query recuperarTodos");
            }
        } catch (Exception e) {

        }
        return null;
    }

    private List<Genero> dameListageneros(ResultSet resultSet) {
        List<Genero> generos = new ArrayList<Genero>();
        try (resultSet) {
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                generos.add(new Genero(id, nombre));
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar generos");
        }
        return generos;
    }

    @Override
    public Genero recuperarid(long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos WHERE ID = ? ";
            try {
                PreparedStatement preparedStatement = conexion.prepareStatement(q);
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

        long id = 0L;
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
