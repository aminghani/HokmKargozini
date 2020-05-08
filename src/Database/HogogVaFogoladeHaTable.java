package Database;
import java.sql.*;
public class HogogVaFogoladeHaTable extends TableConnection{
    final String tableName = "hogogvafogolade";

    public HogogVaFogoladeHaTable(){
        createTableIfNotExist();
    }

    protected boolean createTableIfNotExist(){
        openConnection();
        Statement statement =null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+ tableName + "(id int NOT NULL AUTO_INCREMENT ," +
                    "emtiazhageshoghl INT , emtiazfogolademodoriat INT , emtiazhageshaghel INT , emtiaztafavottatbig INT ," +
                    "emtiazmanategkamtartoseeyafte INT ,emtiazbadiabohava INT ,emtiazisargari INT ,emtiazneshanhayedolati INT ," +
                    "emtiazkhedmatdarmanategjangzade INT , emtiazsakhtisharayetkar INT , emtiazayelemandi INT ," +
                    "emtiazhazineolad INT , emtiazfogoladeshoghl INT, PRIMARY KEY (id))");
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

    public boolean insertOne(int emtiazhageshoghl,int emtiazfogolademodoriat ,int emtiazhageshaghel ,int emtiaztafavottatbig,
                             int emtiazmanategkamtartoseeyafte,int emtiazbadiabohava,int emtiazisargari , int emtiazneshanhayedolati
                            , int emtiazkhedmatdarmanategjangzade,int emtiazsakhtisharayetkar , int emtiazayelemandi,
                             int emtiazhazineolad , int emtiazfogoladeshoghl ){
        openConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO "+ tableName +"(emtiazhageshoghl,emtiazfogolademodoriat,emtiazhageshaghel," +
                    "emtiaztafavottatbig,emtiazmanategkamtartoseeyafte,emtiazbadiabohava,emtiazisargari,emtiazneshanhayedolati," +
                    "emtiazkhedmatdarmanategjangzade,emtiazsakhtisharayetkar,emtiazayelemandi,emtiazhazineolad,emtiazfogoladeshoghl) " +
                    "VALUES (" + emtiazhageshoghl + " , "+ emtiazfogolademodoriat + " , "+ emtiazhageshaghel + " , "+
                    emtiaztafavottatbig + " , "+ emtiazmanategkamtartoseeyafte + " , "+emtiazbadiabohava + " , "+emtiazisargari+" , "+
                    emtiazneshanhayedolati+ " , "+emtiazkhedmatdarmanategjangzade + " , "+emtiazsakhtisharayetkar + " , "+
                    emtiazayelemandi + " , "+ emtiazhazineolad + " , "+ emtiazfogoladeshoghl+")");
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
