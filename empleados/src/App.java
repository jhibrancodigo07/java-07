import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import db.conexion.ConexionDB;

public class App {
    public static void main(String[] args) throws Exception {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            System.out.println("base conectada");

        } catch (Exception e) {
            System.out.println("base no conectada");

        }
        }
    }
//Connection conexion;
       // try{
            //Class.forName("com.mysql.cj.jdbc.driver");
           // conexion = DriverManager.getConnection("jdbc:msql://localhost:3306/empleados", "root", "root");
           // System.out.println("se conecto a la base de datos");
       // } catch (Exception e){
           // System.out.println("error al conectar");
