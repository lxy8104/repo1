package Chapter7;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Practice6 extends BoardGame {
    Practice6() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Practice6 x = new Practice6();

    }
}
