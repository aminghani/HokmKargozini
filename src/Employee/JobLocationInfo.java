package Employee;

public class JobLocationInfo {
    String shahrestanKhedmat;
    String ostanKhedmat;
    String noeEstekhdam;

    public JobLocationInfo(String shahrestanKhedmat, String ostanKhedmat, String noeEstekhdam) {
        this.shahrestanKhedmat = shahrestanKhedmat;
        this.ostanKhedmat = ostanKhedmat;
        this.noeEstekhdam = noeEstekhdam;
    }

    public JobLocationInfo(){

    }

    public String getShahrestanKhedmat() {
        return shahrestanKhedmat;
    }

    public void setShahrestanKhedmat(String shahrestanKhedmat) {
        this.shahrestanKhedmat = shahrestanKhedmat;
    }

    public String getOstanKhedmat() {
        return ostanKhedmat;
    }

    public void setOstanKhedmat(String ostanKhedmat) {
        this.ostanKhedmat = ostanKhedmat;
    }

    public String getNoeEstekhdam() {
        return noeEstekhdam;
    }

    public void setNoeEstekhdam(String noeEstekhdam) {
        this.noeEstekhdam = noeEstekhdam;
    }
}
