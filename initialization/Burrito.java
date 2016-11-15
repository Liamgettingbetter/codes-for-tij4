package initialization;

/**
 * Created by Liam on 11/5/16.
 */
public class Burrito {
    Spiciness s;

    Burrito(Spiciness s) { this.s = s; }
    public void describe() {
        System.out.print("This burrito is ");

        switch (s) {
            case NOT :
                System.out.println("not spicy at all");
                break;
            case MILD :
            case MEDIUM :
                System.out.println("a little hot");
                break;
            case HOT :
            case FLAMING :
            default :
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito
            a = new Burrito(Spiciness.NOT),
            b = new Burrito(Spiciness.MEDIUM),
            c = new Burrito(Spiciness.FLAMING);
        a.describe();
        b.describe();
        c.describe();
    }
}
