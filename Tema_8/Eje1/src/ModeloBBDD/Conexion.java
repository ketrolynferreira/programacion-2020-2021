
package ModeloBBDD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private String bd = "bdeje1";
    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost:3306/" + bd;
    
    private Connection con;

    public Conexion() {}

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, login, password);

            if (con == null) {
                throw new Exception("Error de conexión");
            }
        } catch (Exception gnr) {
            System.out.println(gnr.getMessage());
        }
    }
    
     public Connection getCon(){
      return con;
    }
     
    public void desconectar(){
        try{
            con.close();
        }catch(Exception gnr){
            System.out.println("Error al  cerrar la conexión");
        }
    }
   
}
