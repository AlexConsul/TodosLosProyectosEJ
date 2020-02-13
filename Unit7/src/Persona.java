import java.sql.*;
public class Persona {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Se obtiene una conexi�n con la base de datos.
            // En este caso nos conectamos a la base de datos prueba
            // con el usuario root y contrase�a 1daw
  conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");

            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
            ResultSet rs = s.executeQuery("select * from persona");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + " " + rs.getString(2) + " " + rs.getDate(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally { // Se cierra la conexi�n con la base de datos.
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}