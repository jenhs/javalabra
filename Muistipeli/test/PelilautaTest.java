import muistipeli.Pelilauta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelilautaTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void kortitLuodaan() {
        Pelilauta pelilauta = new Pelilauta();
        pelilauta.luoKortit();
        assertNotNull(pelilauta.kortit());        
    }
    
    @Test
    public void korttejaOikeaMaara() {
        Pelilauta pelilauta = new Pelilauta();
        pelilauta.luoKortit();
        assertEquals(pelilauta.korttienMaara()*2, 30);
    }
        
}
