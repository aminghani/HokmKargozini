package Employee;

public class JobInfo {
    String raste;
    String reshteShoghli;
    int tabageShoghl;
    String rotbe;

    public JobInfo(String raste, String reshteShoghli, int tabageShoghl, String rotbe) {
        this.raste = raste;
        this.reshteShoghli = reshteShoghli;
        this.tabageShoghl = tabageShoghl;
        this.rotbe = rotbe;
    }

    public JobInfo(){

    }

    public String getRaste() {
        return raste;
    }

    public void setRaste(String raste) {
        this.raste = raste;
    }

    public String getReshteShoghli() {
        return reshteShoghli;
    }

    public void setReshteShoghli(String reshteShoghli) {
        this.reshteShoghli = reshteShoghli;
    }

    public int getTabageShoghl() {
        return tabageShoghl;
    }

    public void setTabageShoghl(int tabageShoghl) {
        this.tabageShoghl = tabageShoghl;
    }

    public String getRotbe() {
        return rotbe;
    }

    public void setRotbe(String rotbe) {
        this.rotbe = rotbe;
    }
}
