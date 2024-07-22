
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
    
    
    
    public boolean esteTokenEstaEnUso(String token,String passwordToken){
        //estos son los datos para conectarme a mi servidor
        String url = "jdbc:mysql://127.0.0.1:3306/u995592926_bestpoint";
        String user = "u995592926_bestpoint";
        String password = "Bobesponja48*";
        
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conectarse a la base de datos
            Connection connection = DriverManager.getConnection(url, user, password);

            // Crear una declaración y ejecutar una consulta
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM license WHERE token = '"+token+"' and password='"+passwordToken+"'";
            ResultSet resultSet = statement.executeQuery(query);

            // si existe datos, veremos si ya fue activada con anterioridad
            while (resultSet.next()) {
                boolean licenseId = resultSet.getBoolean("activa");
                return licenseId;
            }

            // Cerrar la conexión
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        
        
        return false;
    }
}
