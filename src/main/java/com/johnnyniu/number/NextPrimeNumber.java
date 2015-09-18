package number;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xiaomingniu on 5/06/15.
 */
public class NextPrimeNumber {

    public static List<Integer> primaries = new LinkedList<Integer>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please hit Enter key to get next primary number");
        primaries.add(2);
        int current = 1;
        test:
        while (true) {
          current++;
          for(int p: primaries) {
              if(p > current/2) {
                  if(sc.hasNextLine()) {   //Read system.in
                      sc.nextLine();
                      System.out.println(current + ",");
                      primaries.add(current);
                      continue test;
                  }
              }
              if(current%p == 0) {
                  continue test;
              }
          }
        }
    }
}
