package Database;
import java.sql.*;
public class PostSazmaniAndShenasnameTable extends TableConnection {
    String tableName = "PostSazmaniAndShenasname";

    public PostSazmaniAndShenasnameTable(){
        createTableIfNotExist();
    }

    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+ tableName + "(id int NOT NULL AUTO_INCREMENT,onvanpost TEXT,shomare INT," +
                    "shomareshenasname TEXT,shahrestansodor TEXT,ostansodor TEXT,PRIMARY KEY (id))");
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

    public boolean insertOne(String onvanpost,int shomare,String shomareshenasname,String shahrestansodor,String ostansodor){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(onvanpost,shomare,shomareshenasname,shahrestansodor,ostansodor" +
                    ") VALUES ('" + onvanpost + "' , " + shomare + " , '" + shomareshenasname + "' , '" + shahrestansodor+"' , '"+ostansodor+"')");
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
