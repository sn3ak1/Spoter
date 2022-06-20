package DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseContext {
    public static void forName(String className)throws ClassNotFoundException{}
    public static Connection getConnection(String url)throws SQLException{return null;}
    public static Connection getConnection(String url,String name,String password){return null;}

    public Statement createStatement()throws SQLException{return null;}
    public ResultSet executeQuery(String sql)throws SQLException{return null;}
    public void close()throws SQLException{}
}
