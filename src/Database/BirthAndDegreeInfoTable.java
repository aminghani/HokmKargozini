package Database;

import Employee.BirthAndDegreeInfo;
import com.sun.glass.ui.Window;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BirthAndDegreeInfoTable extends TableConnection {

    public BirthAndDegreeInfoTable(){
        tableName = "birthanddegree";
        createTableIfNotExist();
    }
    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS " + tableName + " (id int NOT NULL AUTO_INCREMENT ,mahaletavalod  TEXT ,tarikhtavalod TEXT ," +
                    " madrak TEXT , reshte TEXT , PRIMARY KEY (id))");
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

    public boolean insertOne(String mahaleTavalod, String tarikhTavalod, String madrak,
            String reshte){
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(mahaletavalod , tarikhtavalod ,madrak , reshte ) VALUES " +
                    " ('" + mahaleTavalod + "' , '" + tarikhTavalod + "' , '"+madrak + "' , '" + reshte +"')");
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }finally {
            try{
                statement.close();
                closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
