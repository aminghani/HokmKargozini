package Database;
import Employee.PersonalInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalInfoTable extends TableConnection{
    String tableName = "personalinfo";

    public PersonalInfoTable(){
        createTableIfNotExist();
    }

    @Override
    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+tableName+ "(id int NOT NULL AUTO_INCREMENT," +
                    "firstname TEXT,lastname TEXT,fathername TEXT,shomaremeli TEXT,shomareMostakhdem TEXT,password TEXT,PRIMARY KEY (id))");
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
    public boolean insertOne(String firstName,String lastName,String fatherName,String shomareMeli
            ,String shomareMostakhdem , String password){
        openConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName + "(firstname,lastname,fathername,shomaremeli,shomareMostakhdem,password) " +
                    "VALUES ('"+firstName + "' , '" + lastName + "' , '" + fatherName + "' , '"+ shomareMeli + "' , '"+shomareMostakhdem+"' , '" + password + "')");
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

    public int loginVerify(String id ,String password){
        openConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        List<Integer> ids = new ArrayList<>();
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM "+tableName + " WHERE shomaremeli = '"+ id + "' AND password = '"+ password+"'");
            while(resultSet.next()){
                ids.add(resultSet.getInt("id"));
            }
            if(ids.size() == 0){
                return -1;
            }else{
                return ids.get(0);
            }
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
