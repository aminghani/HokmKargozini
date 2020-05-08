package Employee;

public class ShenasnameInfo {
    String shomareShenasname;
    String shahrestanSodor;
    String ostanSodor;

    public ShenasnameInfo(String shomareShenasname, String shahrestanSodor, String ostanSodor) {
        this.shomareShenasname = shomareShenasname;
        this.shahrestanSodor = shahrestanSodor;
        this.ostanSodor = ostanSodor;
    }

    public ShenasnameInfo(){

    }

    public String getShomareShenasname() {
        return shomareShenasname;
    }

    public void setShomareShenasname(String shomareShenasname) {
        this.shomareShenasname = shomareShenasname;
    }

    public String getShahrestanSodor() {
        return shahrestanSodor;
    }

    public void setShahrestanSodor(String shahrestanSodor) {
        this.shahrestanSodor = shahrestanSodor;
    }

    public String getOstanSodor() {
        return ostanSodor;
    }

    public void setOstanSodor(String ostanSodor) {
        this.ostanSodor = ostanSodor;
    }
}
