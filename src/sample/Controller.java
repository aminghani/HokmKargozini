package sample;



import Database.PersonalInfoTable;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField shomareMeli;
    @FXML
    private TextField password;
    @FXML
    private ComboBox<String> combobox;

    public void initialize(){

    }

    public void submitClicked(){
        if(combobox.getSelectionModel().getSelectedItem().equals("")){
            return;
        }
        if(combobox.getSelectionModel().getSelectedItem().equals("کارمند")){
            if(verifyEmployeePassword()){
                openEmployeeWindow();
            }
        }else{
            if(verifyAdmin()){
                openAdminPage();
            }
        }

    }

    private boolean verifyAdmin(){
        if(shomareMeli.getText().equals("root") && password.getText().equals("123")){
            return true;
        }
        return false;
    }

    private void openAdminPage(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Admin.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage stage1 = (Stage) shomareMeli.getScene().getWindow();
            stage1.close();
        } catch (IOException e) {

        }
    }

    private void openEmployeeWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("EmployeePage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage stage1 = (Stage) shomareMeli.getScene().getWindow();
            stage1.close();
        } catch (IOException e) {

        }
    }

    private boolean verifyEmployeePassword(){
        PersonalInfoTable personalInfoTable = new PersonalInfoTable();
        int id = personalInfoTable.loginVerify(shomareMeli.getText() , password.getText());
        if(id == -1){
            return false;
        }else{
            return true;
        }
    }

}
