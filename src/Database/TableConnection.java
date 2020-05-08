package Database;
import java.sql.*;

abstract public class TableConnection {
    public Connection connection;
    private final String user = "root";
    private final String password = "aminkhosroshahi328";
    protected void openConnection(){
        String sql = "jdbc:Mysql://localhost:3306/hokmekargozini";
        try{
            connection = DriverManager.getConnection(sql , user , password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    protected abstract boolean createTableIfNotExist();
    protected void closeConnection(){
        try{
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
