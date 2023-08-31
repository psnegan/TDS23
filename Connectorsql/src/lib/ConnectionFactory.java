package lib;


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

/**
 *
 * @author 3113.343
 */
public class ConnectionFactory {
	
    public static void main(String[] args) {
    	 
        Connection conn = null;
 
        try {
 
            String dbURL = "jdbc:sqlserver://D9995NE089:1433;user=sa;password=TecInfo;database=Curso\"";
            String user = "sa";
            String pass = "TecInfo";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
