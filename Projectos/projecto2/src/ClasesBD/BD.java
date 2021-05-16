
package ClasesBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ketro
 */
public class BD {
    private Connection con;

    public BD() {
    }

    public BD(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
    private String bd= "projecto2";
    private String url="jdbc:mysql://localhost:3306/+bd";
    private String login="root@localhost";
    private String password=" ";
    
    public void conectar()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, login, password);
        if (con == null) {
            throw new Exception("Problemas en conectar");
        }
    }
    
    public void desconectar()throws Exception {
        con.close();
    }
    
    
}
