public class PrimeNumber {
    
    static boolean isPrime (int num) {
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main (String[] args) {
        String primeOrComposite = isPrime(5) ? "Prime" : "Composite";
        System.out.println(primeOrComposite);
    }
}