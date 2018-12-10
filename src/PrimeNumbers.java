import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        testPrint();
    }

    public static void testPrint() {
        System.out.println(isPrime(6));
        System.out.println(isPrime(5));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(2));
    }

    public static boolean isPrime(int num) {
        if (num < 0)
            return false;

        List<Integer> factors = getFactors(num);
        if (factors.size() <= 2)
            return true;
        else
            return false;
    }

    public static List<Integer> getFactors(int num) {
        List<Integer> foundFactors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                foundFactors.add(i);
        }
        return foundFactors;
    }

  /*  public static int[] getPrimes(int start, int numberOfPrimes)
    {
        //while (start < numberOfPrimes)
    }*/
}
