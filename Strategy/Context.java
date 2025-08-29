public class Context {
    private OperationStrategy operationStrategy;

    Context() {
        this.operationStrategy = new AddStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        return this.operationStrategy.execute(a, b);
    }
}