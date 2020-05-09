package sample;


import Database.*;
import Employee.*;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Admin {
    @FXML
    private Button firstBtn;
    @FXML
    private Button secondBtn;
    @FXML
    private Button thirdBtn;
    @FXML
    private Button fourthBtn;
    @FXML
    private AnchorPane newUserSection;
    @FXML
    private AnchorPane BirthInfoPane;
    @FXML
    private AnchorPane isargariAndJobInfo;
    @FXML
    private AnchorPane hogogVaFogolade;
    @FXML
    private AnchorPane marriageInfoPane;
    @FXML
    private AnchorPane personalInfoPane;
    @FXML
    private AnchorPane shenassnameInfoPane;
    @FXML
    private TextField birthLocTxt;
    @FXML
    private TextField birthTxt;
    @FXML
    private TextField degreeTxt;
    @FXML
    private TextField reshteTxt;
    @FXML
    private TextField isargariTxt;
    @FXML
    private TextField rasteTxt;
    @FXML
    private TextField reshteShoghliTxt;
    @FXML
    private TextField tabageTxt;
    @FXML
    private TextField rotbe;
    @FXML
    private TextField hageShoghlTxt;
    @FXML
    private TextField modiriatTxt;
    @FXML
    private TextField hageShaghelTxt;
    @FXML
    private TextField tafavotTatbigTxt;
    @FXML
    private TextField kamtarToseeyafteTxt;
    @FXML
    private TextField badiAboHavaTxt;
    @FXML
    private TextField isargariEmtiazTxt;
    @FXML
    private TextField neshanHayeDolatiTxt;
    @FXML
    private TextField manategeMahromTxt;
    @FXML
    private TextField sakhtiKarTxt;
    @FXML
    private TextField ayelemandiTxt;
    @FXML
    private TextField hageOladTxt;
    @FXML
    private TextField fogoladeShoghl;
    @FXML
    private TextField shahrestanTxt;
    @FXML
    private TextField ostanTxt;
    @FXML
    private TextField noeEstekhdamTxt;
    @FXML
    private TextField vaziatHaaholTxt;
    @FXML
    private TextField tedadFarzand;
    @FXML
    private TextField nameTxt;
    @FXML
    private TextField lastNameTxt;
    @FXML
    private TextField fatherNameTxt;
    @FXML
    private TextField shomareMeliTxt;
    @FXML
    private TextField shomareMostakhdemTxt;
    @FXML
    private TextField passwordTxt;
    @FXML
    private TextField onvanPostTxt;
    @FXML
    private TextField shomare;
    @FXML
    private TextField shomareshenasnameTxt;
    @FXML
    private TextField shahreSodor;
    @FXML
    private TextField ostanSodor;
    @FXML
    private TextField savabegeKhedmatTxt;
    @FXML
    private TextField vahedSazmaniTxt;
    @FXML
    private TextField noeeHokm;
    @FXML
    private TextField idTxt;
    @FXML
    private ListView<String> showInfo;
    @FXML
    private AnchorPane deleteUserPart;
    @FXML
    private AnchorPane thirdPart;
    @FXML
    private TextField afzayeshZaribTxt;
    @FXML
    private TextField tarikhZarizTxt;
    @FXML
    private Label showCurrentZarib;
    @FXML
    private Label showTimeLabel;
    @FXML
    private Label userCountLabel;
    @FXML
    private AnchorPane infoPane;





    private void clearTextFields(){
        birthLocTxt.setText("");
        birthTxt.setText("");
        degreeTxt.setText("");
        reshteTxt.setText("");
        isargariTxt.setText("");
        neshanHayeDolatiTxt.setText("");
        manategeMahromTxt.setText("");
        sakhtiKarTxt.setText("");
        ayelemandiTxt.setText("");
        hageOladTxt.setText("");
        fogoladeShoghl.setText("");
        shahrestanTxt.setText("");
        ostanTxt.setText("");
        noeEstekhdamTxt.setText("");
        vaziatHaaholTxt.setText("");
        tedadFarzand.setText("");
        nameTxt.setText("");
        lastNameTxt.setText("");
        fatherNameTxt.setText("");
        shomareMeliTxt.setText("");
        shomareMostakhdemTxt.setText("");
        passwordTxt.setText("");
        onvanPostTxt.setText("");
        shomare.setText("");
        shomareshenasnameTxt.setText("");
        shahreSodor.setText("");
        ostanSodor.setText("");
        savabegeKhedmatTxt.setText("");
        vahedSazmaniTxt.setText("");
        noeeHokm.setText("");
    }

    Employee employee;
    public void initialize(){
        employee = new Employee();
        updateCurrentLabel();
        initClock();
    }

    private void initClock(){

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            showTimeLabel.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }



    public void buttonOneClicked(){
        handleButtonChange(1);
        deleteUserPart.setVisible(false);
        infoPane.setVisible(false);
        thirdPart.setVisible(false);
        newUserSection.setVisible(true);
    }

    public void buttonTwoClicked()
    {
        handleButtonChange(2);
        thirdPart.setVisible(false);
        infoPane.setVisible(false);
        newUserSection.setVisible(false);
        deleteUserPart.setVisible(true);

    }

    public void buttonThreeClicked(){
        handleButtonChange(3);
        deleteUserPart.setVisible(false);
        newUserSection.setVisible(false);
        infoPane.setVisible(false);
        thirdPart.setVisible(true);
    }

    public void buttonFourClicked(){
        handleButtonChange(4);
        deleteUserPart.setVisible(false);
        newUserSection.setVisible(false);
        thirdPart.setVisible(false);
        infoPane.setVisible(true);
        updateUserCount();


    }

    private void handleButtonChange(int index){
        firstBtn.setStyle("-fx-background-color:  #EDC6B7");
        secondBtn.setStyle("-fx-background-color:  #EDC6B7");
        thirdBtn.setStyle("-fx-background-color:  #EDC6B7");
        fourthBtn.setStyle("-fx-background-color:  #EDC6B7");
        switch (index){
            case 1:
                firstBtn.setStyle("-fx-background-color:  #E5C149");
                break;
            case 2:
                secondBtn.setStyle("-fx-background-color:  #3ED0C3");
                break;
            case 3:
                thirdBtn.setStyle("-fx-background-color:  #DA7EE3");
                break;
            case 4:
                fourthBtn.setStyle("-fx-background-color:  #D9649B");
                break;
        }
    }

    public void birthInfoClicked(){
        handleButtonChange();
        BirthInfoPane.setVisible(true);
    }

    public void hogogClicked(){
        handleButtonChange();
        hogogVaFogolade.setVisible(true);
    }

    public void isargariClicked(){
        handleButtonChange();
        isargariAndJobInfo.setVisible(true);
    }

    public void marrigaeInfoClicked(){
        handleButtonChange();
        marriageInfoPane.setVisible(true);
    }

    public void personalInfoClicked(){
        handleButtonChange();
        personalInfoPane.setVisible(true);
    }

    public void shenasnameInfoClicked(){
        handleButtonChange();
        shenassnameInfoPane.setVisible(true);
    }

    private void handleButtonChange(){
        BirthInfoPane.setVisible(false);
        hogogVaFogolade.setVisible(false);
        isargariAndJobInfo.setVisible(false);
        marriageInfoPane.setVisible(false);
        personalInfoPane.setVisible(false);
        shenassnameInfoPane.setVisible(false);
    }


    public void registerClicekd(){
        if(employee.getBirthAndDegreeInfo() == null || employee.getHogogVaFogoladeHa() == null ||
            employee.getIsargari() == null || employee.getJobInfo() == null || employee.getJobLocationInfo() == null
            || employee.getMarriageInfo() == null || employee.getPersonalInfo() == null || employee.getPostSazmani() == null
            || employee.getShenasnameInfo() == null || employee.getSavabegKhedmat() == null || employee.getVahedSazmani() == null
            || employee.getNoeHokm() == null){
            System.out.println("not all fields have been filled");
            return;
        }
        BirthAndDegreeInfoTable birthAndDegreeInfoTable = new BirthAndDegreeInfoTable();
        HogogVaFogoladeHaTable hogogVaFogoladeHa = new HogogVaFogoladeHaTable();
        IsargariAndMarriageInfoTable isargariAndMarriageInfoTable = new IsargariAndMarriageInfoTable();
        JobAndJobLocationInfoTable jobAndJobLocationInfoTable = new JobAndJobLocationInfoTable();
        OtherTable otherTable = new OtherTable();
        PersonalInfoTable personalInfoTable = new PersonalInfoTable();
        PostSazmaniAndShenasnameTable postSazmaniAndShenasnameTable = new PostSazmaniAndShenasnameTable();
        try{
            birthAndDegreeInfoTable.insertOne(employee.getBirthAndDegreeInfo().getMahaleTavalod(),employee.getBirthAndDegreeInfo().getTarikhTavalod()
                    ,employee.getBirthAndDegreeInfo().getMadrak(),employee.getBirthAndDegreeInfo().getReshte());
            hogogVaFogoladeHa.insertOne(employee.getHogogVaFogoladeHa().getEmtiazHageShoghl(),employee.getHogogVaFogoladeHa().getEmtiazFogoladeShoghl(),
                    employee.getHogogVaFogoladeHa().getEmtiazHageShaghel(),employee.getHogogVaFogoladeHa().getEmtiazTafavotTatbig(),
                    employee.getHogogVaFogoladeHa().getEmtiazManategKamtarToseeYafte(),employee.getHogogVaFogoladeHa().getEmtiazBadiAboHava(),
                    employee.getHogogVaFogoladeHa().getEmtiazIsargari(),employee.getHogogVaFogoladeHa().getEmtiazNeshanHayeDolati(),
                    employee.getHogogVaFogoladeHa().getEmtiazKhedmatDarManategJangZade(),employee.getHogogVaFogoladeHa().getEmtiazSakhtiSharayetKar(),
                    employee.getHogogVaFogoladeHa().getEmtiazAyeleMandi(),employee.getHogogVaFogoladeHa().getEmtiazHazineOlad(),
                    employee.getHogogVaFogoladeHa().getEmtiazFogoladeShoghl());
            isargariAndMarriageInfoTable.insertOne(employee.getIsargari().getVaziatIsargari(),employee.getMarriageInfo().getVaziatTaahol(),
                    employee.getMarriageInfo().getTedadFarzand());
            jobAndJobLocationInfoTable.insertOne(employee.getJobInfo().getRaste(),employee.getJobInfo().getReshteShoghli(),
                    employee.getJobInfo().getTabageShoghl(),employee.getJobInfo().getRotbe(),employee.getJobLocationInfo().getShahrestanKhedmat(),
                    employee.getJobLocationInfo().getOstanKhedmat(),employee.getJobLocationInfo().getNoeEstekhdam());
            otherTable.insertOne(employee.getSavabegKhedmat(),employee.getVahedSazmani(),employee.getNoeHokm());
            personalInfoTable.insertOne(employee.getPersonalInfo().getFirstName(),employee.getPersonalInfo().getLastName(),
                    employee.getPersonalInfo().getFatherName(),employee.getPersonalInfo().getShomareMeli(),employee.getPersonalInfo().getShomareMostakhdem(),
                    employee.getPersonalInfo().getPassword());
            postSazmaniAndShenasnameTable.insertOne(employee.getPostSazmani().getOnvanPost(),employee.getPostSazmani().getShomare(),
                    employee.getShenasnameInfo().getShomareShenasname(),employee.getShenasnameInfo().getShahrestanSodor(),
                    employee.getShenasnameInfo().getOstanSodor());
            System.out.println("one record inserted");
            clearTextFields();
        }catch (Exception e){
            System.out.println("insert failed");
        }

    }

    public void sabtBirthBtn(){
        if(birthLocTxt.getText().equals("") || birthTxt.getText().equals("") || degreeTxt.getText().equals("") ||
                reshteTxt.getText().equals("")){
            return;
        }
        try {
            employee.setBirthAndDegreeInfo(new BirthAndDegreeInfo(birthLocTxt.getText(),birthTxt.getText(),
                    degreeTxt.getText() , reshteTxt.getText()));
            System.out.println("sabt shod");
        }catch (Exception e){

        }

    }

    public void sabtIsargariBtn(){
        if(isargariTxt.getText().equals("") || rasteTxt.getText().equals("") || reshteShoghliTxt.getText().equals("")
         || tabageTxt.getText().equals("") || rotbe.getText().equals("")){
            return;
        }
        try{
            employee.setIsargari(new Isargari(isargariTxt.getText()));
            employee.setJobInfo(new JobInfo(rasteTxt.getText(),reshteShoghliTxt.getText(),Integer.valueOf(tabageTxt.getText()),
                    rotbe.getText()));
            System.out.println("sabt shod");
        }catch (Exception e){

        }
    }

    public void sabtFogoladehaBtn(){
        if(hageShoghlTxt.getText().equals("") || modiriatTxt.getText().equals("") || hageShaghelTxt.getText().equals("")
        || tafavotTatbigTxt.getText().equals("") || kamtarToseeyafteTxt.getText().equals("") || badiAboHavaTxt.getText().equals("")
        || isargariEmtiazTxt.getText().equals("") || neshanHayeDolatiTxt.getText().equals("") ||manategeMahromTxt.getText().equals("")
        || sakhtiKarTxt.getText().equals("") || ayelemandiTxt.getText().equals("") || hageOladTxt.getText().equals("")||
                fogoladeShoghl.getText().equals("")){
            return;
        }
        try{
            employee.setHogogVaFogoladeHa(new HogogVaFogoladeHa(Integer.valueOf(hageShoghlTxt.getText()),Integer.valueOf(modiriatTxt.getText())
                    ,Integer.valueOf(hageShaghelTxt.getText()),Integer.valueOf(tafavotTatbigTxt.getText()),Integer.valueOf(kamtarToseeyafteTxt.getText()),
                    Integer.valueOf(badiAboHavaTxt.getText()),Integer.valueOf(isargariEmtiazTxt.getText()),
                    Integer.valueOf(neshanHayeDolatiTxt.getText()),Integer.valueOf(manategeMahromTxt.getText()),
                    Integer.valueOf(sakhtiKarTxt.getText()),Integer.valueOf(ayelemandiTxt.getText()),
                    Integer.valueOf(hageOladTxt.getText()),Integer.valueOf(fogoladeShoghl.getText()),2120));
            System.out.println("sabt shod");
        }catch (Exception e){

        }
    }

    public void sabtMarriageInfoBtn(){
        if(shahrestanTxt.getText().equals("") || ostanTxt.getText().equals("") || noeEstekhdamTxt.getText().equals("")||
        vaziatHaaholTxt.getText().equals("") || tedadFarzand.getText().equals("")){
            return;
        }
        try{
            employee.setMarriageInfo(new MarriageInfo(Boolean.valueOf(vaziatHaaholTxt.getText()),Integer.valueOf(tedadFarzand.getText())));
            employee.setJobLocationInfo(new JobLocationInfo(shahrestanTxt.getText(),ostanTxt.getText(),noeEstekhdamTxt.getText()));
            System.out.println("sabt shod");
        }catch (Exception e){

        }

    }

    public void sabtPersonalInfoBtn(){
        if(nameTxt.getText().equals("") || lastNameTxt.getText().equals("") || fatherNameTxt.getText().equals("")||
                shomareMeliTxt.getText().equals("") || shomareMostakhdemTxt.getText().equals("") || passwordTxt.getText().equals("")
        || onvanPostTxt.getText().equals("") || shomare.getText().equals("")){
            return;
        }
        try{
            employee.setPersonalInfo(new PersonalInfo(nameTxt.getText(),lastNameTxt.getText(),fatherNameTxt.getText(),
                    shomareMeliTxt.getText(),shomareMostakhdemTxt.getText(),passwordTxt.getText()));
            employee.setPostSazmani(new PostSazmani(onvanPostTxt.getText() , Integer.valueOf(shomare.getText())));
            System.out.println("sabt shod");
        }catch (Exception e){

        }
    }

    public void sabteShanasnameInfoBtn(){
        if(shomareshenasnameTxt.getText().equals("") || shahreSodor.getText().equals("") || ostanSodor.getText().equals("")||
                savabegeKhedmatTxt.getText().equals("") || vahedSazmaniTxt.getText().equals("") || noeeHokm.getText().equals("")){
            return;
        }
        try{
            employee.setShenasnameInfo(new ShenasnameInfo(shomareshenasnameTxt.getText(),shahreSodor.getText(),
                    ostanSodor.getText()));
            employee.setSavabegKhedmat(savabegeKhedmatTxt.getText());
            employee.setVahedSazmani(vahedSazmaniTxt.getText());
            employee.setNoeHokm(noeeHokm.getText());
            System.out.println("sabt shod");
        }catch (Exception e){

        }
    }

    public void newUserClicked(){
        employee = new Employee();
        clearTextFields();
    }

    //second Page<-------------------------------------------------------->

    public void searchClicked(){
        String info = new PersonalInfoTable().readPersonalInfo(Integer.valueOf(idTxt.getText()));
        showInfo.getItems().add(info);
    }

    public void deleteClicked(){
        int id = Integer.valueOf(idTxt.getText());
        try {
            new BirthAndDegreeInfoTable().deleteOne(id);
            new HogogVaFogoladeHaTable().deleteOne(id);
            new IsargariAndMarriageInfoTable().deleteOne(id);
            new JobAndJobLocationInfoTable().deleteOne(id);
            new OtherTable().deleteOne(id);
            new PersonalInfoTable().deleteOne(id);
            new PostSazmaniAndShenasnameTable().deleteOne(id);
            System.out.println("record deleted");
        }catch (Exception e){
            System.out.println("operation failed");
        }
    }

    //third page <---------------------------------->

    public void AfzayeshZaribClicked(){
        try{
            ZaribTable zaribTable = new ZaribTable();
            int currentZarib = zaribTable.getCurrentZarib();
            int nextZarib = currentZarib + Integer.valueOf(afzayeshZaribTxt.getText());
            zaribTable.increaseZarib(nextZarib , tarikhZarizTxt.getText());
            updateCurrentLabel();
            System.out.println("record updated");
        }catch (Exception e){
            System.out.println("update failed");
        }
    }

    private void updateCurrentLabel(){
        showCurrentZarib.setText(String.valueOf(new ZaribTable().getCurrentZarib()));
    }

    // fourth page <-------------------------------------->

    private void updateUserCount(){
        int userCount = new PersonalInfoTable().getRecordCounts();
        userCountLabel.setText(String.valueOf(userCount));
    }
}
