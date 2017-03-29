package design_patterns;

/**
 * Created by Liam on 29/03/2017.
 */
class HumanFactory2 {
    static Male createMale() {
        return new Male();
    }

    static Female createFemale() {
        return new Female();
    }
}

public class MultiFactory {
    public static void main(String[] args) {
        Male m = HumanFactory2.createMale();
        Female fm = HumanFactory2.createFemale();
        m.eat();
        fm.sleep();
    }
}
