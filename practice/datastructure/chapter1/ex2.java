package practice.datastructure.chapter1;

public class ex2 {
    static class GameEntry {
        private int scores;

        GameEntry(int scores) { this.scores = scores; }

        @Override
        public String toString() {
            return Integer.toString(scores);
        }
    }

    public static void main(String[] args) {
        GameEntry[] a = new GameEntry[5];
        for(int i = 0; i < 5; i++) {
            a[i] = new ex2.GameEntry(i);
        }

        GameEntry[] b = a;
        b[4].scores = 550;
        System.out.println(a[4]);
    }
}
