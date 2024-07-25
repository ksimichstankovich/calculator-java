import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
public class CalculatorTest {
 
    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(calc.Run("4 + 5"), "9", "Result should be 9");
    }
}