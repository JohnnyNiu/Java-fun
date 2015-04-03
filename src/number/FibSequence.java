package number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Fibonacci Sequence – Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
 * Created by xiaomingniu on 3/04/15.
 */
public class FibSequence {
    public static HashMap<Integer, Integer> fibs = new HashMap<Integer, Integer>();

    public static String display(int n) {
        for( int i=1;i<=n;i++) {
            System.out.println(getFib(i));
        }
        return "";
    }
    static int getFib(int n) {
        if(!fibs.containsKey(n)) {
            int theFib;
            if(n>2) {
                theFib = getFib(n-1)+ getFib(n-2);
            } else {
                theFib = 1;
            }
            fibs.put(n, theFib);
            return theFib;
        } else {
            return fibs.get(n);
        }

    }

    public static void main(String[] args) {
        FibSequence.display(1000);
    }
}
