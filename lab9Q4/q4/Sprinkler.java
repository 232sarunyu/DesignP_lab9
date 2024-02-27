public class Sprinkler implements component {
    private mediator mediator;

    @Override
    public void setMediator(mediator mediator) {
        this.mediator = mediator;
    }

    public void sprinkle() {
        System.out.println("Sprinkler activated.");
    }
}