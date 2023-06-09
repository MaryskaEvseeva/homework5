import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {
    @Test
    public void SouldCalcExact(){
       SqrtServiceTest service = new SqrtServiceTest();

       int expected = 5;
       int actual = service.calcsqrt(25);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void SouldCalcIeExact(){
        SqrtServiceTest service = new SqrtServiceTest();

        int expected = 6;
        int actual = service.calcsqrt(27);

        Assertions.assertEquals(expected, actual);
    }

    private int calcsqrt(int i) {
    }}}
