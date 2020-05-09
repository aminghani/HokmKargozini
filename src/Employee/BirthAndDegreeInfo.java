package Employee;

import java.util.Date;

public class BirthAndDegreeInfo {
    String mahaleTavalod;
    String tarikhTavalod;
    String madrak;
    String reshte;

    public BirthAndDegreeInfo(String mahaleTavalod, String tarikhTavalod, String madrak, String reshte) {
        this.mahaleTavalod = mahaleTavalod;
        this.tarikhTavalod = tarikhTavalod;
        this.madrak = madrak;
        this.reshte = reshte;
    }

    public BirthAndDegreeInfo(){

    }

    public String getMahaleTavalod() {
        return mahaleTavalod;
    }

    public void setMahaleTavalod(String mahaleTavalod) {
        this.mahaleTavalod = mahaleTavalod;
    }

    public String getTarikhTavalod() {
        return tarikhTavalod;
    }

    public void setTarikhTavalod(String tarikhTavalod) {
        this.tarikhTavalod = tarikhTavalod;
    }

    public String getMadrak() {
        return madrak;
    }

    public void setMadrak(String madrak) {
        this.madrak = madrak;
    }

    public String getReshte() {
        return reshte;
    }

    public void setReshte(String reshte) {
        this.reshte = reshte;
    }
}
