package Database;
import java.sql.*;

abstract public class TableConnection {
    public Connection connection;
    String tableName;
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
    public boolean deleteOne(int id){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM "+ tableName + " WHERE id = " + id);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }finally {
            try {
                statement.close();
                closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
