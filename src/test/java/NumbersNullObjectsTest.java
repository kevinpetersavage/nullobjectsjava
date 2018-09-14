import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class NumbersNullObjectsTest {
    @Test
    public void nullProductExample(){
        NumbersNullObjectsExample example = new NumbersNullObjectsExample();
        assertThat(example.product(5, null)).isEqualTo(0);
    }

    @Test
    public void checkProductActuallyWorksWithSomeNumbers(){
        NumbersNullObjectsExample example = new NumbersNullObjectsExample();
        assertThat(example.product(5, 5)).isEqualTo(25);
    }

    @Test
    public void nullSumExample(){
        NumbersNullObjectsExample example = new NumbersNullObjectsExample();
        assertThat(example.sum(null, 5)).isEqualTo(5);
    }

    @Test
    public void checkSumActuallyWorksWithSomeNumbers(){
        NumbersNullObjectsExample example = new NumbersNullObjectsExample();
        assertThat(example.sum(5, 5)).isEqualTo(10);
    }
}
