package innerclasses;

/**
 * Created by Liam on 19/11/2016.
 */
interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checker implements Game {
    private Checker() {}

    private int moves = 0;

    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory f = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checker();
        }
    };
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    private Chess() {}

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory f = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    public static void playGame(GameFactory f) {
        Game g = f.getGame();
        while(g.move());
    }

    public static void main(String[] args) {
        playGame(Checker.f);
        playGame(Chess.f);
    }
}
