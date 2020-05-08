package Employee;

import java.util.Date;

public class Employee {
    PersonalInfo personalInfo;
    PostSazmani postSazmani;
    BirthAndDegreeInfo birthAndDegreeInfo;
    HogogVaFogoladeHa hogogVaFogoladeHa;
    Isargari isargari;
    JobInfo jobInfo;
    JobLocationInfo jobLocationInfo;
    MarriageInfo marriageInfo;
    ShenasnameInfo shenasnameInfo;
    Date savabegKhedmat;
    String vahedSazmani;
    String noeHokm;

    public Employee(PersonalInfo personalInfo, PostSazmani postSazmani, BirthAndDegreeInfo birthAndDegreeInfo,
                    HogogVaFogoladeHa hogogVaFogoladeHa, Isargari isargari, JobInfo jobInfo, JobLocationInfo jobLocationInfo,
                    MarriageInfo marriageInfo, ShenasnameInfo shenasnameInfo, Date savabegKhedmat, String vahedSazmani, String noeHokm) {
        this.personalInfo = personalInfo;
        this.postSazmani = postSazmani;
        this.birthAndDegreeInfo = birthAndDegreeInfo;
        this.hogogVaFogoladeHa = hogogVaFogoladeHa;
        this.isargari = isargari;
        this.jobInfo = jobInfo;
        this.jobLocationInfo = jobLocationInfo;
        this.marriageInfo = marriageInfo;
        this.shenasnameInfo = shenasnameInfo;
        this.savabegKhedmat = savabegKhedmat;
        this.vahedSazmani = vahedSazmani;
        this.noeHokm = noeHokm;
    }

    public Employee(){

    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public PostSazmani getPostSazmani() {
        return postSazmani;
    }

    public void setPostSazmani(PostSazmani postSazmani) {
        this.postSazmani = postSazmani;
    }

    public BirthAndDegreeInfo getBirthAndDegreeInfo() {
        return birthAndDegreeInfo;
    }

    public void setBirthAndDegreeInfo(BirthAndDegreeInfo birthAndDegreeInfo) {
        this.birthAndDegreeInfo = birthAndDegreeInfo;
    }

    public HogogVaFogoladeHa getHogogVaFogoladeHa() {
        return hogogVaFogoladeHa;
    }

    public void setHogogVaFogoladeHa(HogogVaFogoladeHa hogogVaFogoladeHa) {
        this.hogogVaFogoladeHa = hogogVaFogoladeHa;
    }

    public Isargari getIsargari() {
        return isargari;
    }

    public void setIsargari(Isargari isargari) {
        this.isargari = isargari;
    }

    public JobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public JobLocationInfo getJobLocationInfo() {
        return jobLocationInfo;
    }

    public void setJobLocationInfo(JobLocationInfo jobLocationInfo) {
        this.jobLocationInfo = jobLocationInfo;
    }

    public MarriageInfo getMarriageInfo() {
        return marriageInfo;
    }

    public void setMarriageInfo(MarriageInfo marriageInfo) {
        this.marriageInfo = marriageInfo;
    }

    public ShenasnameInfo getShenasnameInfo() {
        return shenasnameInfo;
    }

    public void setShenasnameInfo(ShenasnameInfo shenasnameInfo) {
        this.shenasnameInfo = shenasnameInfo;
    }

    public Date getSavabegKhedmat() {
        return savabegKhedmat;
    }

    public void setSavabegKhedmat(Date savabegKhedmat) {
        this.savabegKhedmat = savabegKhedmat;
    }

    public String getVahedSazmani() {
        return vahedSazmani;
    }

    public void setVahedSazmani(String vahedSazmani) {
        this.vahedSazmani = vahedSazmani;
    }

    public String getNoeHokm() {
        return noeHokm;
    }

    public void setNoeHokm(String noeHokm) {
        this.noeHokm = noeHokm;
    }
}
