
package Modelo_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {
     private Connection con;

    public BaseDatos() {
    }
    
   public Connection conectar(){
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1522:orcl19c";
            String login="USUARIO1";
            String password = "usuario1";
            
            con = DriverManager.getConnection(url,login,password);
 
            if (con==null){
                throw new Exception("Problemas con la conexión a la base de datos");
            }
             return con;   
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
           return null;
       }
       
   }
   
   public void desconectar(){
       try
       {
            con.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return con;
   }
}
