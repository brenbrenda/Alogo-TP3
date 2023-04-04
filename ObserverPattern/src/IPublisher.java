import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public interface IPublisher {
    //   private List<Observer> Messages = new ArrayList<Observer>();

    //subscribe
    void attach(IObserver o);

    void detach(IObserver o);

    void notifyUpdate(Message m);
}
