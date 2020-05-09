package Database;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
public class OtherTable extends TableConnection {

    public OtherTable(){
        tableName = "other";
        createTableIfNotExist();
    }

    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+tableName + "(id int NOT NULL AUTO_INCREMENT," +
                    "savabegkhedmat TEXT,vahedsazmani TEXT,noehokm TEXT,PRIMARY KEY (id))");
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

    public boolean insertOne(String savabegkhedmat,String vahedsazmani,String noehokm){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(savabegkhedmat,vahedsazmani,noehokm) " +
                    "VALUES ('"+savabegkhedmat + "' , '" + vahedsazmani + "' , '" + noehokm + "')");
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
