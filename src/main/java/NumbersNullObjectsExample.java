public class NumbersNullObjectsExample {
    public Integer product(Integer x, Integer y) {
        if (x == null || y == null){
            return 0;
        }
        return x * y;
    }

    public Integer sum(Integer x, Integer y) {
        if (x == null && y == null){
            return 0;
        } else if (x == null){
            return y;
        } else if (y == null){
            return x;
        }
        return x + y;
    }
}
