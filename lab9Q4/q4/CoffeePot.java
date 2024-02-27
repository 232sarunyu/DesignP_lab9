public class CoffeePot implements component {
    private mediator mediator;

    @Override
    public void setMediator(mediator mediator) {
        this.mediator = mediator;
    }

    public void pourCoffee() {
        System.out.println("CoffeePot started.");
    }
}