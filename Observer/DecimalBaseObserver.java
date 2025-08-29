import java.util.ArrayList;
import java.util.List;

public class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    public void updateState(int state) {
        this.events.add(Integer.toString(state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}