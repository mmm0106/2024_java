import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int numberofprimes = 20;
        getPrime(4);
        List<Integer> primes = generate(numberofprimes);
        for(int i = 0; i < primes.size();i++){
            System.out.println(i + 1 + ":" + primes.get(i));
        }

    }
    public static List<Integer> generate(int n){
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static int getPrime(int nth){
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < nth) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes.get(nth-1);
    }
}