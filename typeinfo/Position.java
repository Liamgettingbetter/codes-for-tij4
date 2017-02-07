package typeinfo;

/**
 * Created by Liam on 07/02/2017.
 */
public class Position {
    private String title;
    private Person person;

    public Position(String title, Person employee) {
        this.title = title;
        this.person = employee;
        if(person == null) person = Person.NULL;
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        this.person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setPerson(Person p) {
        person = p;
        if(person == null)
            person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Position : " + title + " " + person + "\n";
    }


}
