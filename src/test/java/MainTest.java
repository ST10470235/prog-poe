import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void returnsExpectedText() {
        assertEquals("Hello, Sphe!", Main.greeting("Sphe"));
    }
}
