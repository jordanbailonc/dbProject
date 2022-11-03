package insertdataapp.Model.persist;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class DBConnect {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL ="jbdc:mysql://"+"localhost/test_data";
    private static final String USER = "usrjordan";
    private static final String PASSWORD = "pswjordan";
    
    
    public DBConnect()throws ClassNotFoundException{
        Class.forName(DRIVER);
    }
    
    public Connection getConnection()throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        return conn;
    }
}
