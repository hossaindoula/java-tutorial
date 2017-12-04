package info.doula.lambda;

/**
 * Created by hossaindoula on 12/3/2017.
 */
public class Lambda6 {

    public static void main(String[] args) {
        Lambda6 second = new Lambda6();
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("addition = " + second.operate(5, 5, addition));
        System.out.println("subtraction = " + second.operate(5, 5, subtraction));
        System.out.println("multiplication = " + second.operate(5, 5, multiplication));
        System.out.println("division = " + second.operate(5,5, division));

        GreetingService greetingService = message -> System.out.println("hello " + message);

        greetingService.sayMessage("Ronnie");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
