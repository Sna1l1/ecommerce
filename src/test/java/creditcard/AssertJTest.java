package creditcard;

import org.junit.Test;
import java.time.Instant;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void testSomeAssertJ() {
        var message = "Hello world";
        assertThat(message).contains("Hello");

        assertThat(Instant.now()).isAfter("2015");
    }

}
