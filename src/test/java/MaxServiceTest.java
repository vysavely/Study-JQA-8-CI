import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = a; // по мнению IDEA данная переменная избыточна, но здесь она нужна для наглядности
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void additionalTestForB() {
        MaxService service = new MaxService();
        int a = 3;
        int b = 5;

        int expected = b;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

}
