import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanserServiceTest {
    @Test
public void testCalculate(){
        FreelanserService service = new FreelanserService();

        int actual = service.calculate(10_000, 30_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void testCalculate2(){
        FreelanserService service = new FreelanserService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected , actual);
    }
}
