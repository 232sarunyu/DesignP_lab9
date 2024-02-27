public abstract class game {
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    //Primitive operations
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
