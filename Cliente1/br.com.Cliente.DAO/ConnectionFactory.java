import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionFactory {
	 public Connection getConnection(){
	        Connection conexao = null;
	        try {
	        	Class.forName("org.sqlserver.Driver");
	            conexao = DriverManager.getConnection("jdbc:sqlserver://D9995NE089:1433;database=db_Biblioteca;user=sa;password=TecInfo;encrypt=true;trustServerCertificate=true");
	           
	           
	        }catch(Exception e){
	           System.out.println(e.getMessage());
	        }
	        return conexao;
	       
	    }
}
