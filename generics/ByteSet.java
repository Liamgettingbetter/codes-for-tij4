package generics;

import java.util.*;

/**
 * Created by Liam on 28/03/2017.
 */
public class ByteSet {
    Byte[] possibles = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Set<Byte> mySet = new HashSet<>(Arrays.asList(possibles));

    // But you can't do this.
    // Set<Byte> mySet = new HashSet<>(Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
}
