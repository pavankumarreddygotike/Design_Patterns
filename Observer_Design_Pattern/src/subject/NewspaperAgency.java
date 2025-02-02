package subject;

import observer.Subscriber;

public interface NewspaperAgency {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String newspaper);
}
