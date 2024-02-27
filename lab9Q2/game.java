
public class game {
    private gameStrategy gameStrategy;

    public game(gameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void setGameStrategy(gameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play() {
        gameStrategy.initialize();
        gameStrategy.startPlay();
        gameStrategy.endPlay();
    }
}