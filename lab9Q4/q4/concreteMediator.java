public class concreteMediator implements mediator {
    private Alarm alarm;
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public concreteMediator() {
        this.alarm = new Alarm();
        this.alarm.setMediator(this);
        this.sprinkler = new Sprinkler();
        this.sprinkler.setMediator(this);
        this.coffeePot = new CoffeePot();
        this.coffeePot.setMediator(this);
    }

    @Override
    public void notify(component sender, String event) {
        if ("Alarm".equals(event)) {
            System.out.println("Mediator knows about alarm, activating sprinkler.");
            sprinkler.sprinkle();
        }
    }
}