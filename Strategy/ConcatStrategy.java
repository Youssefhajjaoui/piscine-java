public class ConcatStrategy implements OperationStrategy {
    public int execute(int a, int b) {
        return Integer.valueOf(String.valueOf(a) + String.valueOf(b));
    }
}