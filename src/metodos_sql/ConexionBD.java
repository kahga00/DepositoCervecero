package metodos_sql;

import java.sql.*;

public class ConexionBD {

    public static String url = "jdbc:mysql://localhost:3306/cerveza";
    public static String usuario = "alec27";
    public static String contraseña = "Toru2710";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    Connection con=null;
//jdbc:mysql://localhost:3306/?user=root
    
 
    public static Connection conectar() {
        Connection conexion = null;

       try {
           Class.forName(clase).newInstance();
            
            conexion = DriverManager.getConnection(url, usuario, contraseña);
             System.out.println("conexion establecida");
       }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("No se pudo cargar el puente JDBC-ODBC.");
        }
        return conexion;
    }
    
      

    
}