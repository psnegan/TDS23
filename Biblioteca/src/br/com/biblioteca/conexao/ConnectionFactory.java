package br.com.biblioteca.conexao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author 3113.343
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://D9995NE089:1433;database=db_Biblioteca;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true");
           
           
        }catch(SQLException e){
           System.out.println(e.getMessage());
        }
        return con;
       
    }
   
}