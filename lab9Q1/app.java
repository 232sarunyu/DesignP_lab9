public class app {
    public static void main(String[] args) {
        game game = new football();
        game.play();
        System.out.println();
        game = new basketball();
        game.play();
    }
}