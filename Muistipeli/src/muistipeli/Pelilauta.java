package muistipeli;

import java.util.ArrayList;
import java.util.Random;

public class Pelilauta {

    private int korttienMaara;
    private ArrayList<Character> kaytetytKirjaimet;
    private ArrayList<Korttipari> kortit;
    private int[][] korttienSijainnit;
    private int pelilaudanLeveys;
    private int pelaudanPituus;

    public Pelilauta() {
        this.korttienMaara = 30;
        this.kaytetytKirjaimet = new ArrayList<Character>();
        this.pelaudanPituus = (this.korttienMaara / 10) * 2;
        this.pelilaudanLeveys = 5;
        this.korttienSijainnit = new int[this.pelilaudanLeveys][this.pelaudanPituus];
    }

    //public Pelilauta(int korttienMaara) {
    //    this.korttienMaara = korttienMaara;
    //    this.kaytetytKirjaimet = new ArrayList<Character>();
    //}

    public void luoKortit() {
        this.kortit = new ArrayList<Korttipari>();
        int luodutKortit = 0;

        while (korttienMaara > luodutKortit) {
            char kirjain = arvoKirjain();
            this.kortit.add(new Korttipari(kirjain));
            luodutKortit += 2;
        }
        luoSijainnit();
    }

    public char arvoKirjain() {
        String kirjaimet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int jononPituus = kirjaimet.length();
        Random r = new Random();

        char kirjain = kirjaimet.charAt(r.nextInt(jononPituus));
        while (kaytetytKirjaimet.contains(kirjain)) {
            kirjain = kirjaimet.charAt(r.nextInt(jononPituus));
        }

        this.kaytetytKirjaimet.add(kirjain);

        return kirjain;
    }

    public void luoSijainnit() {
        for (Korttipari k : this.kortit) {
            int x = luoRandomKohtaX();
            int y = luoRandomKohtaY();
            
            while(korttienSijainnit[x][y] == 1) {
                x = luoRandomKohtaX();
                y = luoRandomKohtaY();
            }
            
            k.getKortti1().asetaSijainti(x, y);
            korttienSijainnit[x][y] = 1;

            while(korttienSijainnit[x][y] == 1) {
                x = luoRandomKohtaX();
                y = luoRandomKohtaY();
            }
            k.getKortti2().asetaSijainti(x, y);
            korttienSijainnit[x][y] = 1;
            
        }
    }

    private int luoRandomKohtaX() {
        Random r = new Random();
        int x = r.nextInt(pelilaudanLeveys);
        return x;
    }
    
    private int luoRandomKohtaY() {
        Random r = new Random();
        int y = r.nextInt(pelaudanPituus);
        return y;
    }

    public void tulostaKortit() {
        for (Korttipari a : kortit) {
            System.out.println(a.kirjain());
        }
    }

    public int korttienMaara() {
        return kortit.size();
    }

    public ArrayList kortit() {
        return kortit;
    }
    
    public int[][] korttienSijainnit() {
        return korttienSijainnit;
    }
    
    public int pelilaudanPituus() {
        return this.pelaudanPituus;
    }
    
    public int pelilaudanLeveys() {
        return this.pelilaudanLeveys;
    }
}
