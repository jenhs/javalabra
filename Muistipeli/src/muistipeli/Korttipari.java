package muistipeli;

public class Korttipari {

    private Kortti kortti1;
    private Kortti kortti2;
    private char kirjain;

    public Korttipari(char kirjain) {
        this.kirjain = kirjain;
        this.kortti1 = new Kortti(kirjain);
        this.kortti2 = new Kortti(kirjain);
    }

    public boolean loydetty() {

        return false;
    }
    
    public String kirjain() {
        String kirjain = Character.toString(this.kirjain);
        return kirjain;
    }
    
    public Kortti getKortti1(){
        return kortti1;
    }
    
    public Kortti getKortti2(){
        return kortti2;
    }
}
