package client;

import observer.EmailSubscriber;
import observer.PhysicalSubscriber;
import observer.Subscriber;
import subject.NewspaperCompany;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a Newspaper Company (Subject)
        NewspaperCompany newspaperCompany = new NewspaperCompany();

        // Create Subscribers (Observers)
        Subscriber emailSubscriber = new EmailSubscriber("Alice");
        Subscriber physicalSubscriber = new PhysicalSubscriber("Bob");

        // Subscribe users
        newspaperCompany.subscribe(emailSubscriber);
        newspaperCompany.subscribe(physicalSubscriber);

        // Publish a newspaper
        newspaperCompany.publishNewspaper("Daily Times - 1st Edition");

        // Unsubscribe one user
        newspaperCompany.unsubscribe(physicalSubscriber);

        // Publish another newspaper
        newspaperCompany.publishNewspaper("Daily Times - 2nd Edition");
    }
}