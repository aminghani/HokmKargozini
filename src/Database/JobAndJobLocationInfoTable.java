package Database;
import Employee.JobLocationInfo;

import java.sql.*;
public class JobAndJobLocationInfoTable extends TableConnection {

    public JobAndJobLocationInfoTable(){
        tableName = "JobInfoTable";
        createTableIfNotExist();
    }

    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+ tableName + "(id int NOT NULL AUTO_INCREMENT ,raste TEXT,reshteshoghli TEXT," +
                    "tabageshoghl INT , rotbe TEXT,shahrestankhedmat TEXT,ostankhedmat TEXT,noeestekhdam TEXT,PRIMARY KEY (id))");
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

    public boolean insertOne(String reste,String reshteshoghli,int tabageshoghl,
                             String rotbe,String shahrestankhedmat,String ostankhedmat,
                             String noeestekhdam){
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(raste,reshteshoghli,tabageshoghl,rotbe," +
                    "shahrestankhedmat,ostankhedmat,noeestekhdam) VALUES ('"+ reste + "' , '" + reshteshoghli + "' , " +
                    + tabageshoghl + " , '" + rotbe + "' , '"+ shahrestankhedmat + "' , '"+ostankhedmat+"' , '" +noeestekhdam +"')");
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
