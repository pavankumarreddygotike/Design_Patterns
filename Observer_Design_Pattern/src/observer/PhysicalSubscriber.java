package observer;

public class PhysicalSubscriber implements Subscriber {
    private String name;

    public PhysicalSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newspaper) {
        System.out.println(name + " received a physical copy of the newspaper: " + newspaper);
    }
}
