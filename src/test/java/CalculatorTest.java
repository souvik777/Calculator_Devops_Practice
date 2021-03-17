import calculator.App;
import org.junit.*;
public class CalculatorTest {
    private App calculator;

    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void testPower()
    {
        double ans=125.0;
        Assert.assertEquals(ans, calculator.power(5,3),0);
    }
@Test
    public void testFac()
    {
        double ans=120;
        Assert.assertEquals(ans, calculator.factorial(5),0);
    }
    @Test
    public void testRoot()
    {
        double ans=8.0;
        Assert.assertEquals(ans, calculator.root(64),0);
    }


    @Test
    public void testPower1()
    {
        double ans=64.0;
        Assert.assertEquals(ans, calculator.power(4,3),0);
    }
    @Test
    public void testFac1()
    {
        double ans=720;
        Assert.assertEquals(ans, calculator.factorial(6),0);
    }
    @Test
    public void testRoot1()
    {
        double ans=19.0;
        Assert.assertEquals(ans, calculator.root(361),0);
    }

    @Test
    public void testPower2()
    {
        double ans=256.0;
        Assert.assertEquals(ans, calculator.power(4,4),0);
    }
    @Test
    public void testFac2()
    {
        double ans=24;
        Assert.assertEquals(ans, calculator.factorial(4),0);
    }
    @Test
    public void testRoot2()
    {
        double ans=15.0;
        Assert.assertEquals(ans, calculator.root(225),0);
    }

    @Test
    public void testPower3()
    {
        double ans=27.0;
        Assert.assertEquals(ans, calculator.power(3,3),0);
    }
    @Test
    public void testFac3()
    {
        double ans=2;
        Assert.assertEquals(ans, calculator.factorial(2),0);
    }
    @Test
    public void testRoot3()
    {
        double ans=14.0;
        Assert.assertEquals(ans, calculator.root(196),0);
    }

}
