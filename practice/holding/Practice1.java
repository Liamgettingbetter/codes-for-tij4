package practice.holding;

import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Liam on 23/11/2016.
 */
public class Practice1 {
    private static class Gerbil {
        private int gerbilNum;

        Gerbil(int i) {
            this.gerbilNum = i;
        }

        void hop() {
            System.out.println("Gerbil is hopping " + gerbilNum);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i = 0; i < rand.nextInt(10); i++) {
            gerbils.add(new Gerbil(i));
        }

        for(int i = 0; i < gerbils.size(); i++)
            gerbils.get(i).hop();
    }
}
