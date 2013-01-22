package muistipeli;

public class Korttipari {

    private Kortti kortti1;
    private Kortti kortti2;
    private char kirjain;

    public Korttipari(char kirjain) {
        this.kirjain = kirjain;
        this.kortti1 = new Kortti(1, 2, kirjain);
        this.kortti2 = new Kortti(1, 2, kirjain);
    }

    public boolean loydetty() {

        return false;
    }
    
    public String kirjain() {
        String kirjain = Character.toString(this.kirjain);
        return kirjain;
    }
}
