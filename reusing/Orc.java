package reusing;

/**
 * Created by Liam on 11/10/16.
 */
class Villain {
    private String name;

    protected void set(String nm) { this.name = nm; }
    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int num) {
        super(name);
        this.orcNumber = num;
    }

    public void change(String nam, int nm) {
        set(nam);
        this.orcNumber = nm;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
