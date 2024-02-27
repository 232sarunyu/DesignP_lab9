public class Alarm implements component {
    private mediator mediator;

    @Override
    public void setMediator(mediator mediator) {
        this.mediator = mediator;
    }

    public void triggerAlarm() {
        System.out.println("Alarm triggered.");
        mediator.notify(this, "Alarm");
    }
}