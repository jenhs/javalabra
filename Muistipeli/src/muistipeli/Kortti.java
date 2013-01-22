package muistipeli;
public class Kortti {
    
    private int sijaintiX;
    private int sijaintiY;
    private char kirjain;
    
    public Kortti(int sijaintiX, int sijaintiY, char kirjain) {
        this.kirjain = kirjain;
        this.sijaintiX = sijaintiX;
        this.sijaintiY = sijaintiY;
    }
    
    public char kirjain() {
        return kirjain;
    }
    
    public int sijaintiX() {
        return this.sijaintiX;
    }
    
    public int sijaintiY() {
        return this.sijaintiY;
    }
}
