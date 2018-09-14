import java.util.List;
import java.util.Map;

public class CollectionNullObjectsExample {
    public Integer sumList(List<Integer> integers) {
        Integer sum = null;
        if (integers != null){
            for (Integer i: integers){
                if (sum == null){
                    sum = i;
                } else {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public Integer sumMap(Map<Integer, Integer> integers) {
        Integer sum = null;
        if (integers != null) {
            for (Map.Entry<Integer, Integer> entry : integers.entrySet()) {
                if (sum == null) {
                    sum = entry.getKey() + entry.getValue();
                } else {
                    sum += entry.getKey() + entry.getValue();
                }
            }
        }
        return sum;
    }
}
