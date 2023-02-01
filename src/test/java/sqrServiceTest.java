import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class sqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")

    public void shouldCalcExact(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
