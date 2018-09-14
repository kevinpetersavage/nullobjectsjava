import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class CollectionNullObjectsTest {
    @Test
    public void nullListExample(){
        CollectionNullObjectsExample example = new CollectionNullObjectsExample();
        assertThat(example.sumList(null)).isEqualTo(null);
    }

    @Test
    public void checkSummingListsActuallyWorksWithSomeNumbers(){
        List<Integer> integers = Arrays.asList(1,2,3,4);
        CollectionNullObjectsExample example = new CollectionNullObjectsExample();
        assertThat(example.sumList(integers)).isEqualTo(10);
    }

    @Test
    public void nullMapExample(){
        CollectionNullObjectsExample example = new CollectionNullObjectsExample();
        assertThat(example.sumMap(null)).isEqualTo(null);
    }

    @Test
    public void checkSummingMapsActuallyWorksWithSomeNumbers(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        CollectionNullObjectsExample example = new CollectionNullObjectsExample();
        assertThat(example.sumMap(map)).isEqualTo(10);
    }
}
