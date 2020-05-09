package Database;
import com.sun.glass.ui.Window;

import java.sql.*;
public class ZaribTable extends TableConnection {


    public ZaribTable(){
        tableName = "zarib";
        createTableIfNotExist();
    }

    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+ tableName + " (id int NOT NULL AUTO_INCREMENT ," +
                                        "zarib INT, tarikh TEXT,PRIMARY KEY (id))");
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

    public boolean insertOne(int zarib,String tarikh){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(zarib,tarikh) VALUES ("+zarib+" , '"+tarikh+"')");
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

    public boolean increaseZarib(int increase ,String tarikh){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE "+ tableName+ " SET zarib = "+ increase+" , "+ " tarikh = "+tarikh);
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

    public int getCurrentZarib(){
        openConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT zarib FROM "+ tableName);
            int currentZarib = 0;
            while (resultSet.next()){
                currentZarib = resultSet.getInt("zarib");
            }
            return currentZarib;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }finally {
            try {
                resultSet.close();
                statement.close();
                closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
