package muistipeli;
public class Main {
    public static void main(String[] args) {
        
        Pelilauta pelilauta = new Pelilauta();        
        
        pelilauta.luoKortit();   
        
        pelilauta.tulostaKortit();
        
        for(int[] rivi : pelilauta.korttienSijainnit()) {
            System.out.println("");
            for(int alkio : rivi) {
                System.out.print(alkio);
            }
        }
       
    }
}
