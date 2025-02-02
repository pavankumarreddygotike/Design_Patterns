package observer;

public class EmailSubscriber implements Subscriber {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newspaper) {
        System.out.println(name + " received newspaper via Email: " + newspaper);
    }
}
