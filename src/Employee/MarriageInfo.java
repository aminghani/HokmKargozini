package Employee;

public class MarriageInfo {
    boolean vaziatTaahol;
    int tedadFarzand;

    public MarriageInfo(boolean vaziatTaahol, int tedadFarzand) {
        this.vaziatTaahol = vaziatTaahol;
        this.tedadFarzand = tedadFarzand;
    }

    public MarriageInfo(){

    }

    public boolean getVaziatTaahol() {
        return vaziatTaahol;
    }

    public void setVaziatTaahol(boolean vaziatTaahol) {
        this.vaziatTaahol = vaziatTaahol;
    }

    public int getTedadFarzand() {
        return tedadFarzand;
    }

    public void setTedadFarzand(int tedadFarzand) {
        this.tedadFarzand = tedadFarzand;
    }
}
