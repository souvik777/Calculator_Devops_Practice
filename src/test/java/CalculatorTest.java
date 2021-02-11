import calculator.App;
import org.junit.*;
public class CalculatorTest {
    private App calculator;

    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void Add()
    {
        int ans=5+6;
        Assert.assertEquals(ans, calculator.add(5,6),0);
    }
}
