import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import otus.currency.Rubls;

@RunWith(MockitoJUnitRunner.class)
public class RublsTest {

    @Test
    public static void currencyTest(){
        Rubls rubls = new Rubls();
        Assertions.assertEquals(rubls.getFirstType(), "рубль");
        Assertions.assertEquals(rubls.getSecondType(), "рубля");
        Assertions.assertEquals(rubls.getThirdType(), "рублей");
    }
}
