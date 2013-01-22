package muistipeli;

import java.util.ArrayList;
import java.util.Random;

public class Pelilauta {

    private int korttienMaara;
    private ArrayList<Character> kaytetytKirjaimet;
    private ArrayList<Korttipari> kortit;

    public Pelilauta() {
        this.korttienMaara = 30;        
    }

    public void luoKortit() {
        this.kortit = new ArrayList<Korttipari>();
        int luodutKortit = 0;
        
        while (korttienMaara > luodutKortit) {
            char kirjain = arvoKirjain();
            this.kortit.add(new Korttipari(kirjain));
            luodutKortit += 2;
        }
    }

    public char arvoKirjain() {
        String kirjaimet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int jononPituus = kirjaimet.length();
        Random r = new Random();

        char kirjain = kirjaimet.charAt(r.nextInt(jononPituus));
        //while (kaytetytKirjaimet.contains(kirjain)) {
        //    kirjain = kirjaimet.charAt(r.nextInt(jononPituus));
        //}
        
        //this.kaytetytKirjaimet.add(kirjain);
        
        return kirjain;
    }

    public int korttienSijainnit() {

        return -1;
    }
    
    public void tulostaKortit(){
        for(Korttipari a : kortit) {
            System.out.println(a.kirjain());
        }    
    }
    
    public int korttienMaara() {
        return kortit.size();
    }
    
    public ArrayList kortit() {
        return kortit;
    }
}
