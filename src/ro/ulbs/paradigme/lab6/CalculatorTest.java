package ro.ulbs.paradigme.lab6;
import org.junit.jupiter.api.*;
public class CalculatorTest {
    private DoubleCalculator doubleCalculator;
    private NewIntCalculator newIntCalculator;

    @BeforeEach
    public void setUp() {
        doubleCalculator = new DoubleCalculator(10.0);
        newIntCalculator = new NewIntCalculator(10);
    }
    @Test
    public void testAdd() {
        Assertions.assertEquals(15.0, doubleCalculator.add(5.0).result());
        Assertions.assertEquals(15, newIntCalculator.add(5).result());
    }
    @Test
    public void testSubtract() {
        Assertions.assertEquals(5.0, doubleCalculator.subtract(5.0).result());
        Assertions.assertEquals(5, newIntCalculator.subtract(5).result());
    }
    @Test
    public void testMultiply() {
        Assertions.assertEquals(50.0, doubleCalculator.multiply(5.0).result());
        Assertions.assertEquals(50, newIntCalculator.multiply(5).result());
    }
    @Test
    public void testDivide() {
        Assertions.assertEquals(2.0, doubleCalculator.divide(5.0).result());
        Assertions.assertEquals(2, newIntCalculator.divide(5).result());
    }
    @Test
    public void testDivisionByZero() {

        Assertions.assertThrows(ArithmeticException.class, () -> {
            doubleCalculator.divide(0.0);
        });
        Assertions.assertThrows(ArithmeticException.class, () -> {
            newIntCalculator.divide(0);
        });
    }
    @Test
    public void testClear() {

        doubleCalculator.clear();
        Assertions.assertEquals(0.0, doubleCalculator.result());
        newIntCalculator.clear();
        Assertions.assertEquals(0, newIntCalculator.result());
    }
    @Test
    public void testSetState() {

        doubleCalculator.setState(20.0);
        Assertions.assertEquals(20.0, doubleCalculator.result());
        newIntCalculator.setState(20);
        Assertions.assertEquals(20, newIntCalculator.result());
    }
    @Test
    public void testInit() {

        doubleCalculator.init();
        Assertions.assertEquals(0.0, doubleCalculator.result());
        newIntCalculator.init();
        Assertions.assertEquals(0, newIntCalculator.result());
    }
    @AfterEach
    public void tearDown() {
        doubleCalculator = null;
        newIntCalculator = null;
    }
}
