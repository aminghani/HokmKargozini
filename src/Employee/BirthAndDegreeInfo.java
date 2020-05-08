package Employee;

import java.util.Date;

public class BirthAndDegreeInfo {
    public enum Madrak  {DIPLOM , FOGDIPLOM , LISANS , FOGLISANS , DOCTORA}
    String mahaleTavalod;
    Date tarikhTavalod;
    Madrak madrak;
    String reshte;

    public BirthAndDegreeInfo(String mahaleTavalod, Date tarikhTavalod, Madrak madrak, String reshte) {
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

    public Date getTarikhTavalod() {
        return tarikhTavalod;
    }

    public void setTarikhTavalod(Date tarikhTavalod) {
        this.tarikhTavalod = tarikhTavalod;
    }

    public Madrak getMadrak() {
        return madrak;
    }

    public void setMadrak(Madrak madrak) {
        this.madrak = madrak;
    }

    public String getReshte() {
        return reshte;
    }

    public void setReshte(String reshte) {
        this.reshte = reshte;
    }
}
