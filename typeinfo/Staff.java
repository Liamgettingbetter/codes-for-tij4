package typeinfo;

import java.util.ArrayList;

/**
 * Created by Liam on 07/02/2017.
 */
public class Staff extends ArrayList<Position> {
    // proxy
    public void add(String title, Person p) {
        add(new Position(title, p));
    }

    public void add(String... titles) {
        for(String title : titles)
            add(new Position(title));
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for(Position p : this)
            if(p.getTitle().equals(title)
                    && p.getPerson() == Person.NULL)
                return true;
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for(Position p : this) {
            if(p.getTitle().equals(title) &&
                    p.getPerson() == Person.NULL) {
                p.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff s = new Staff("President", "CTO",
                "Marketing Manager", "Product Manager",
                "Project Lead", "Software Engineer",
                "Software Engineer", "Software Engineer",
                "Software Engineer", "Test Engineer",
                "Test Engineer", "Technical Writer");

        s.fillPosition("President", new Person("Me", "Last",
                "The Top, Lonely At"));

        s.fillPosition("Project Lead", new Person("Janet", "Planner",
                "The Burbs"));
        if(s.positionAvailable("Software Engineer"))
            s.fillPosition("Software Engineer",
                    new Person("Bob", "Coder", "Bright Light City"));
        System.out.println(s);
    }
}
