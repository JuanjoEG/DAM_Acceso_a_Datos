
package Tema_04;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ConexionMariaDB {
    
    
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mariadb://localhost:3306/Pruebas";
    public static void main(String args[]) throws SQLException {
        final String usuario = "user_db";
        final String password = "password_db";
        Connection dbConnection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL_CONEXION, usuario, password);
            String selectTableSQL = "SELECT ID,USERNAME,PASSWORD,NOMBRE FROM Usuarios";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            while (rs.next()) {
                String id = rs.getString("ID");
                String usr = rs.getString("USERNAME");
                String psw = rs.getString("PASSWORD");
                String nombre = rs.getString("NOMBRE");
                System.out.println("userid : " + id);
                System.out.println("usr : " + usr);
                System.out.println("psw : " + psw);
                System.out.println("nombre : " + nombre);
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