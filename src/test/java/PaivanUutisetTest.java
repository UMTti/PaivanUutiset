
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PaivanUutisetTest {
    
    TestPaivanUutiset uutiset = new TestPaivanUutiset();
    public PaivanUutisetTest() {
        
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
    public void testaaViimeisin(){
        assertEquals("viimeisin", uutiset.haeViimeisinUutinen());
    }
    
    @Test
    public void testaaSuosituin(){
         assertEquals("suosituin", uutiset.haeSuosituinUutinen());
    }
}
