package Tema_04;

import java.sql.*;

/**
 *
 * @author Juan José Estévez González
 */
public class ConexionMySQL {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mysql://localhost:3306/mysql";
    
    //private static final String DRIVER = "org.mysql.jdbc.Driver";
    //private static final String URL_CONEXION = "jdbc:mysql://localhost:3306/Pruebas";
    
    public static void main(String[] args) throws SQLException {
        
        final String usuario = "root";
        final String password = "polako";
        Connection dbConnection = null;
        Statement statement = null;
        
        try {
        
            Class.forName(DRIVER);
            dbConnection = DriverManager.getConnection(URL_CONEXION, usuario, password);
            String selectTableSQL = "SELECT * FROM mysql.user";
            //String selectTableSQL = "SELECT ID.USERNAME.PASSWORD.NOMBRE FROM Usuarios";
            statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            while (rs.next()) {
            
                String id = rs.getString("Host");
                String usr = rs.getString("User");
                String psw = rs.getString("plugin");
                String nombre = rs.getString("authentication_string");
                System.out.println("userind: " + id);
                System.out.println("usr: " + usr);
                System.out.println("psw: " + psw);
                System.out.println("nombre: " + nombre);                
            }
        } catch (SQLException e) {
        
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
        
            System.out.println(e.getMessage());
        } finally {
        
            if (statement != null) {
            
                statement.close();
            }
            
            if (dbConnection != null) {
            
                dbConnection.close();
            }
        }
    }    
}