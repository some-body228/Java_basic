import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import otus.currency.Rubls;
import otus.impl.Converter;

@RunWith(MockitoJUnitRunner.class)
public class ConverterTest {

    @Test
    public void numberMapperTest() {
        Rubls rubls = new Rubls();
        Converter converter = new Converter(rubls);

        Assertions.assertEquals(rubls.getFirstType(), converter.numberMapper(1));
        Assertions.assertEquals(rubls.getSecondType(), converter.numberMapper(2));
        Assertions.assertEquals(rubls.getThirdType(), converter.numberMapper(0));
    }
}
