package reusing;

/**
 * Created by Liam on 11/9/16.
 */
class Game {
    Game(int i) {
        System.out.println("Game()");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame()");
    }
}
public class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("Chess()");
        // super(11); --- super() must be the first statement
    }

    public static void main(String[] args) {
        Chess c = new Chess();
    }
}
