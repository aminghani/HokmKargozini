package Employee;

public class PersonalInfo {
    String firstName;
    String lastName;
    String fatherName;
    String shomareMeli;
    String shomareMostakhdem;
    String password;

    public PersonalInfo(String firstName, String lastName, String fatherName, String shomareMeli, String shomareMostakhdem , String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.shomareMeli = shomareMeli;
        this.shomareMostakhdem = shomareMostakhdem;
        this.password = password;
    }

    public PersonalInfo(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getShomareMeli() {
        return shomareMeli;
    }

    public void setShomareMeli(String shomareMeli) {
        this.shomareMeli = shomareMeli;
    }

    public String getShomareMostakhdem() {
        return shomareMostakhdem;
    }

    public void setShomareMostakhdem(String shomareMostakhdem) {
        this.shomareMostakhdem = shomareMostakhdem;
    }
}
