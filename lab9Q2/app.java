public class app {
    public static void main(String[] args) {
        game game = new game(new basketballStrategy());
        game.play();

        System.out.println("Switching to FootBall Game");
        game.setGameStrategy(new foorballStrategy());
        game.play();
    }
}