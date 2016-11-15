package practice.initialization;

/**
 * Created by Liam on 11/5/16.
 */
enum Cash {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class Practice21 {
    public static void main(String[] args) {
         for(Cash c : Cash.values())
             switch (c) {
                 case ONE :
                     System.out.println("ONE " + c.ordinal());
                     break;
                 case TWO :
                     System.out.println("TWO " + c.ordinal());
                     break;
                 case FIVE :
                     System.out.println("FIve " + c.ordinal());
                     break;
                 case TEN :
                     System.out.println("TEN " + c.ordinal());
                     break;
                 case TWENTY :
                     System.out.println("TWENTY " + c.ordinal());
                     break;
                 case FIFTY :
                     System.out.println("FIFTY " + c.ordinal());
                     break;
                 case HUNDRED :
                     System.out.println("HUNDRED " + c.ordinal());
                     break;
             }
    }
}
