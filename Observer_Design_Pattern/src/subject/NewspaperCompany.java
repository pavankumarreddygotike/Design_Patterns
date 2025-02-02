package subject;

import java.util.ArrayList;
import java.util.List;

import observer.Subscriber;

public class NewspaperCompany implements NewspaperAgency {
	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
		System.out.println(subscriber.getClass().getSimpleName() + " subscribed.");
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
		System.out.println(subscriber.getClass().getSimpleName() + " unsubscribed.");
	}

	@Override
	public void notifySubscribers(String newspaper) {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(newspaper);
		}
	}

	// Method to publish a newspaper
	public void publishNewspaper(String newspaper) {
		System.out.println("\nNewspaper Published: " + newspaper);
		notifySubscribers(newspaper);
	}
}
