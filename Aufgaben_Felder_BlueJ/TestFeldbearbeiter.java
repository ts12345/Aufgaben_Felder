import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class TestFeldbearbeiter
{
    Random r;

    /**
     * Default constructor for test class TestFeldbearbeiter
     */
    public TestFeldbearbeiter()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        r = new Random();       
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testeMin()
    {
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = 4.0;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(1.0, fb.min(), 0.0000001);
    }

    @Test
    public void testeMax()
    {
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = 4.0;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(4.0, fb.max(), 0.0000001);
    }

    @Test
    public void testeSumme()
    {
        double random = r.nextDouble();
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = random;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(6.0 + random, fb.summe(), 0.0000001);
    }

    @Test
    public void testeProdukt()
    {
        double random = r.nextDouble();
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = random;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(6.0 * random, fb.produkt(), 0.0000001);
    }

    @Test
    public void testeMittelwert()
    {
        double random = r.nextDouble();
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = random;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(1.5 + random / 4.0, fb.mittelwert(), 0.0000001);
    }

    @Test
    public void testeStandardabweichung()
    {
        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = 4.0;
        Feldbearbeiter fb = new Feldbearbeiter(feld);
        assertEquals(1.290994, fb.standardabweichung(), 0.001);
    }

    @Test
    public void testeDreheFeldUm()
    {

        double[] feld = new double[4];
        feld[0] = 1.0;
        feld[1] = 2.0;
        feld[2] = 3.0;
        feld[3] = 4.0;

        double[] feldOrig = new double[feld.length];
        for(int i = 0; i < feld.length; i++) {
            feldOrig[i] = feld[i];
        }

        Feldbearbeiter fb = new Feldbearbeiter(feld);
        fb.dreheFeldUm();

        int length = feld.length;

        for(int i = 0; i < length; i++) {
            assertEquals(feldOrig[i], feld[length - 1 - i], 0.0000001);
        }
    }

    @Test
    public void testeSortiereFeld()
    {

        double[] feld = new double[4];
        feld[0] = 3.0;
        feld[1] = 4.0;
        feld[2] = 1.0;
        feld[3] = 2.0;

        double[] feldSortiert = new double[4];
        feldSortiert[0] = 1.0;
        feldSortiert[1] = 2.0;
        feldSortiert[2] = 3.0;
        feldSortiert[3] = 4.0;

        Feldbearbeiter fb = new Feldbearbeiter(feld);
        fb.sortiereFeld(true);

        int length = feld.length;

        for(int i = 0; i < length; i++) {
            assertEquals(feldSortiert[i], feld[i], 0.0000001);
        }

        fb.sortiereFeld(false);
        feldSortiert[0] = 4.0;
        feldSortiert[1] = 3.0;
        feldSortiert[2] = 2.0;
        feldSortiert[3] = 1.0;        
        for(int i = 0; i < length; i++) {
            assertEquals(feldSortiert[i], feld[i], 0.0000001);
        }

    }

}
