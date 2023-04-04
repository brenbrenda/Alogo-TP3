import java.util.ArrayList;
import java.util.Observer;

public class MessagePublisher implements IPublisher {
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void attach(IObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (IObserver observer: observers) {
            observer.update(m);
        }
    }

}
