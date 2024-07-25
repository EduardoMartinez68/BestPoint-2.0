
package Membresia;
import ClasesGlobales.Buscar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ComprobarMembresia {
    Buscar search;
    Connection con;

    public ComprobarMembresia(Connection con) {
        this.con = con;
        this.search=new Buscar(con);
    }
    
    public boolean existeCuentaAsignada(){
        //obtenemos el token guardado en la base de datos
        String token=search.buscarTokenPc();
        
        //comprobamos si existe un token en esta base de datos. 
        return (!token.equals(""));
    }
    
    
    
    public int esteTokenEstaEnUso(String token,String passwordToken){
        // Datos para conectarse al servidor de Hostinger
        String url = "jdbc:mysql://193.203.166.165:3306/u995592926_bestpoint"; 
        String user = "u995592926_bestpoint";
        String password = "Bobesponja48*";

        try {
            System.out.println("Verificar membresia membresias");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            System.out.println("Se conecto con la base de datos de las membresias exitosamente");
            // Crear una declaración y ejecutar una consulta
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM license WHERE token = '" + token + "' and password = '" + passwordToken + "'";
            ResultSet resultSet = statement.executeQuery(query);

            // Si existe datos, veremos si ya fue activada con anterioridad
            while (resultSet.next()) {
                boolean licenseId = resultSet.getBoolean("activa");
                return 1;
            }

            // Cerrar la conexión
            resultSet.close();
            statement.close();
            connection.close();
            
            System.out.println("Cerro la conexion con la base de datos de las membresias");
            return 2;
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());      
        }

        return 1;
    }
}
