import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int result = calculator.multi(2, 2);
        assertEquals(4, result);
    }
}