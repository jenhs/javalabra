import muistipeli.Pelilauta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelilautaTest {
    
    Pelilauta pelilauta;
    
    public PelilautaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelilauta = new Pelilauta();
        pelilauta.luoKortit();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void kortitLuodaan() {
        assertNotNull(pelilauta.kortit());        
    }
    
    @Test
    public void korttejaOikeaMaara() {     
        assertEquals(pelilauta.korttienMaara()*2, 30);
    }
    
    @Test 
    public void jokaisessaKohdassaKortti() {
        for(int i = 0; i < pelilauta.pelilaudanLeveys(); i++) {
            for(int j = 0; j < pelilauta.pelilaudanPituus(); j++) {
                assertEquals(1, pelilauta.korttienSijainnit()[i][j]);
                
            }
        }
        
    }
        
}
