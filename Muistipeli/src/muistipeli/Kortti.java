package muistipeli;
public class Kortti {
    
    private int sijaintiX;
    private int sijaintiY;
    private char kirjain;
    
    public Kortti(char kirjain) {
        this.kirjain = kirjain;
    }
    
    public char kirjain() {
        return kirjain;
    }
    
    public void asetaSijainti(int x, int y) {
        this.sijaintiX = x;
        this.sijaintiY = y;
    }
    
    public int sijaintiX() {
        return this.sijaintiX;
    }
    
    public int sijaintiY() {
        return this.sijaintiY;
    }
    
}
