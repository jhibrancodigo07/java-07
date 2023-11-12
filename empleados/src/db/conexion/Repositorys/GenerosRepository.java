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

public class GenerosRepository implements Repositoryinterface<Genero> {

    @Override
    public void agregar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
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
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM generos WHERE id =?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
                preparedStatement.setString(1, "" + entidad.getId());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o Reaultset");
            }
        } catch (Exception e) {
            System.out.println("error en la consulta");
        }
    }

    @Override
    public void modificar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "UPDATE  generos SET nombre = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
                preparedStatement.setString(1, entidad.getNombre());
                preparedStatement.setString(2, entidad.getNombre());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("error al crear el statement o Resultset");
            }

        } catch (Exception e) {
            System.out.println("error en la consulta");
        }

    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            try (
                    PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
                ResultSet resultSet = preparedStatement.executeQuery(q);
                return this.dameListaGeneros(resultSet);
            } catch (Exception e) {
                System.out.println("error en query recuperarTodos");
            }
        } catch (Exception e) {
            System.out.println("error en la consulta");

        }
        return null;

    }

    @Override
    public Genero recuperarid(long id) {
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
