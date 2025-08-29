import java.util.ArrayList;
import java.util.List;

public class ValuePublisher {
    private List<NumericBaseObserver> observers = new ArrayList<NumericBaseObserver>();

    public void updateState(int value) {
        for (NumericBaseObserver ob : this.observers)
            ob.updateState(value);
    }

    public void subscribe(NumericBaseObserver observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(NumericBaseObserver observer) {
        this.observers.remove(observer);
    }
}