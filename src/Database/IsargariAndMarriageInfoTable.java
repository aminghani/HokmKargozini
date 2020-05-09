package Database;
import Employee.Isargari;

import java.sql.*;
public class IsargariAndMarriageInfoTable extends TableConnection {

    public IsargariAndMarriageInfoTable(){
        tableName = "isargariAndMarriage";
        createTableIfNotExist();
    }

    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+ tableName + "(id int NOT NULL AUTO_INCREMENT,vaziatisargari TEXT," +
                    "vaziattaahol BIT, tedadfarzand INT,PRIMARY KEY (id))");
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

    public boolean insertOne(String vaziatisargari, boolean vaziattaahol, int tedadfarzand){
        if(vaziattaahol == false && tedadfarzand > 0){
            return false;
        }
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+tableName + "(vaziatisargari,vaziattaahol,tedadfarzand) VALUES " +
                    "('" + vaziatisargari + "' , "+ vaziattaahol + " , "+ tedadfarzand+")");
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
