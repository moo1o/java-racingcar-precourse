import org.junit.jupiter.api.Test;
import utils.NumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {
    @Test
    public void numberGenerateTest() {
        for (int i = 0; i < 100; i++) {
            String input = Integer.toString(NumberGenerator.numberGenerate());
            System.out.println(input);
            assertThat(input).matches("[0-9]{1}");
        }
    }
}
