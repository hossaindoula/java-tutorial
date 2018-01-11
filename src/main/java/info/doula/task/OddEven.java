public class OddEven {

    static boolean isOdd(int a) {
        return (a & 1) == 1;
    }

    public static void main (String[] args) {
        int number = 7;
        String oddOrEven = isOdd(number) ? "Odd" : "Even";
        System.out.println("The number " + number + " is " + oddOrEven);
    }
}