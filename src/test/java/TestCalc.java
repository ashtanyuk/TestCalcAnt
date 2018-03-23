import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalc {
    @org.junit.Test
    public void add() {
        assertEquals(4,Calc.add(2,2));
    }
    @Test
    public void sub() {
       assertEquals(0,Calc.sub(2,2));
    }
    @Test
    public void mul() {
       assertEquals(4,Calc.mul(2,2));
    }
    @Test
    public void div() {
        assertEquals(1,Calc.div(2,2));
    }
}