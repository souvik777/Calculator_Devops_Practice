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
}
