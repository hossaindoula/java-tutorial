public class FizzBuzz {

    static void determineFizzBuzz(int a) {
        if (a % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (a % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Buzz");
        }
    }


    public static void main (String[] args) {
        
        determineFizzBuzz(15);
    }
}