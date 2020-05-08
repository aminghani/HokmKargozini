package Employee;

public class HogogVaFogoladeHa {
    int emtiazHageShoghl;
    int emtiazFogoladeModoriat;
    int emtiazHageShaghel;
    int emtiazTafavotTatbig;
    int emtiazManategKamtarToseeYafte;
    int emtiazBadiAboHava;
    int emtiazIsargari;
    int emtiazNeshanHayeDolati;
    int emtiazKhedmatDarManategJangZade;
    int emtiazSakhtiSharayetKar;
    int emtiazAyeleMandi;
    int emtiazHazineOlad;
    int emtiazFogoladeShoghl;
    int zarib;

    public HogogVaFogoladeHa(int emtiazHageShoghl, int emtiazFogoladeModoriat, int emtiazHageShaghel,
                             int emtiazTafavotTatbig, int emtiazManategKamtarToseeYafte, int emtiazBadiAboHava,
                             int emtiazIsargari, int emtiazNeshanHayeDolati, int emtiazKhedmatDarManategJangZade,
                             int emtiazSakhtiSharayetKar, int emtiazAyeleMandi, int emtiazHazineOlad, int emtiazFogoladeShoghl,int zarib) {
        this.emtiazHageShoghl = emtiazHageShoghl;
        this.emtiazFogoladeModoriat = emtiazFogoladeModoriat;
        this.emtiazHageShaghel = emtiazHageShaghel;
        this.emtiazTafavotTatbig = emtiazTafavotTatbig;
        this.emtiazManategKamtarToseeYafte = emtiazManategKamtarToseeYafte;
        this.emtiazBadiAboHava = emtiazBadiAboHava;
        this.emtiazIsargari = emtiazIsargari;
        this.emtiazNeshanHayeDolati = emtiazNeshanHayeDolati;
        this.emtiazKhedmatDarManategJangZade = emtiazKhedmatDarManategJangZade;
        this.emtiazSakhtiSharayetKar = emtiazSakhtiSharayetKar;
        this.emtiazAyeleMandi = emtiazAyeleMandi;
        this.emtiazHazineOlad = emtiazHazineOlad;
        this.emtiazFogoladeShoghl = emtiazFogoladeShoghl;
        this.zarib = zarib;
    }

    public int getSumEmtiaz(){
        return emtiazHageShoghl + emtiazFogoladeModoriat + emtiazHageShaghel + emtiazTafavotTatbig + emtiazManategKamtarToseeYafte
                + emtiazBadiAboHava + emtiazIsargari + emtiazNeshanHayeDolati + emtiazKhedmatDarManategJangZade + emtiazSakhtiSharayetKar +
                emtiazAyeleMandi + emtiazHazineOlad + emtiazFogoladeShoghl + zarib;
    }
    public long getTotalSalary(){
        return getSumEmtiaz() * zarib;
    }

    public int getEmtiazHageShoghl() {
        return emtiazHageShoghl;
    }

    public void setEmtiazHageShoghl(int emtiazHageShoghl) {
        this.emtiazHageShoghl = emtiazHageShoghl;
    }

    public int getEmtiazFogoladeModoriat() {
        return emtiazFogoladeModoriat;
    }

    public void setEmtiazFogoladeModoriat(int emtiazFogoladeModoriat) {
        this.emtiazFogoladeModoriat = emtiazFogoladeModoriat;
    }

    public int getEmtiazHageShaghel() {
        return emtiazHageShaghel;
    }

    public void setEmtiazHageShaghel(int emtiazHageShaghel) {
        this.emtiazHageShaghel = emtiazHageShaghel;
    }

    public int getEmtiazTafavotTatbig() {
        return emtiazTafavotTatbig;
    }

    public void setEmtiazTafavotTatbig(int emtiazTafavotTatbig) {
        this.emtiazTafavotTatbig = emtiazTafavotTatbig;
    }

    public int getEmtiazManategKamtarToseeYafte() {
        return emtiazManategKamtarToseeYafte;
    }

    public void setEmtiazManategKamtarToseeYafte(int emtiazManategKamtarToseeYafte) {
        this.emtiazManategKamtarToseeYafte = emtiazManategKamtarToseeYafte;
    }

    public int getEmtiazBadiAboHava() {
        return emtiazBadiAboHava;
    }

    public void setEmtiazBadiAboHava(int emtiazBadiAboHava) {
        this.emtiazBadiAboHava = emtiazBadiAboHava;
    }

    public int getEmtiazIsargari() {
        return emtiazIsargari;
    }

    public void setEmtiazIsargari(int emtiazIsargari) {
        this.emtiazIsargari = emtiazIsargari;
    }

    public int getEmtiazNeshanHayeDolati() {
        return emtiazNeshanHayeDolati;
    }

    public void setEmtiazNeshanHayeDolati(int emtiazNeshanHayeDolati) {
        this.emtiazNeshanHayeDolati = emtiazNeshanHayeDolati;
    }

    public int getEmtiazKhedmatDarManategJangZade() {
        return emtiazKhedmatDarManategJangZade;
    }

    public void setEmtiazKhedmatDarManategJangZade(int emtiazKhedmatDarManategJangZade) {
        this.emtiazKhedmatDarManategJangZade = emtiazKhedmatDarManategJangZade;
    }

    public int getEmtiazSakhtiSharayetKar() {
        return emtiazSakhtiSharayetKar;
    }

    public void setEmtiazSakhtiSharayetKar(int emtiazSakhtiSharayetKar) {
        this.emtiazSakhtiSharayetKar = emtiazSakhtiSharayetKar;
    }

    public int getEmtiazAyeleMandi() {
        return emtiazAyeleMandi;
    }

    public void setEmtiazAyeleMandi(int emtiazAyeleMandi) {
        this.emtiazAyeleMandi = emtiazAyeleMandi;
    }

    public int getEmtiazHazineOlad() {
        return emtiazHazineOlad;
    }

    public void setEmtiazHazineOlad(int emtiazHazineOlad) {
        this.emtiazHazineOlad = emtiazHazineOlad;
    }

    public int getEmtiazFogoladeShoghl() {
        return emtiazFogoladeShoghl;
    }

    public void setEmtiazFogoladeShoghl(int emtiazFogoladeShoghl) {
        this.emtiazFogoladeShoghl = emtiazFogoladeShoghl;
    }

    public int getZarib() {
        return zarib;
    }

    public void setZarib(int zarib) {
        this.zarib = zarib;
    }
}
