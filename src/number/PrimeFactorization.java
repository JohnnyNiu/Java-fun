package number;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.*;

/**
 * Prime Factorization – Have the user enter a number and find all Prime Factors (if there are any) and display them.
 *
 * Clue:
 *      loop from 2 to N/2 , find those are both primary and factor of N.
 *
 *      To check if number x is primary, check if x can be divided by any primary from minimum(2) to x/2. So we build a primary database for this purpose.
 *
 * Created by xiaomingniu on 3/04/15.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class PrimeFactorization {


    public void display(int n) {
        PrimeFactorization primeFactorization = new PrimeFactorization();
        primeFactorization.findPrimaryFactor(n);
        System.out.println(primeFactorization.getResult());
    }

    /*
     *list of primaries from 2 to ...
     */
    ArrayList<Integer> primarys = new ArrayList<Integer>();
    ArrayList<Integer> primaryFactors = new ArrayList<Integer>();

    private boolean isPrimary(int x) {
        if(x<2){
            return false;
        }

        for(Integer p: primarys) {
            if(p>x/2){
                break;
            }
            if(x%p==0) {
                return false;
            }
        }

        return true;
    }

    private void findPrimaryFactor(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (isPrimary(i)) {
                primarys.add(i);
                if (n % i == 0) {
                    primaryFactors.add(i);
                }
            }
        }
    }
    private List<Integer> getResult() {
        return primaryFactors;
    }

    @Test
    public void test50() {
        assertPrimaryFactor(4, Arrays.asList(2));
        assertPrimaryFactor(8, Arrays.asList(2));
        assertPrimaryFactor(10, Arrays.asList(2,5));
        assertPrimaryFactor(18, Arrays.asList(2,3));
        assertPrimaryFactor(19, Collections.EMPTY_LIST);
        assertPrimaryFactor(28, Arrays.asList(2,7));
        assertPrimaryFactor(100, Arrays.asList(2,5));
        assertPrimaryFactor(300, Arrays.asList(2,3,5));
    }

    /**
     * Test helper
     * @param n
     * @param factors
     */
    private void assertPrimaryFactor(int n, List<Integer> factors) {
        PrimeFactorization primeFactorization = new PrimeFactorization();
        primeFactorization.findPrimaryFactor(n);
        List<Integer> result = primeFactorization.getResult();

        Assert.assertTrue(hasSameList(result, factors));
    }

    /**
     * Test helper
     * @param a1
     * @param a2
     * @return
     */
    private boolean hasSameList(List<Integer> a1, List<Integer> a2) {
        int size2 = a2.size();
        a1.addAll(a2);
        return size2 == new HashSet<Integer>(a1).size();
    }


}
