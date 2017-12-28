package info.doula.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Calculator {

    /*
    1
    -
    3
    +
    2
    +
    4
    */

    public int evalute(final String input) {
        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");
        for (String token : tokens) {
            stack.add(token);
        }

        while (stack.size() > 1) {
            final int left = parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = left + right;
                    break;

                case "-":
                    result = left - right;
                    break;
            }

            stack.push(String.valueOf(result));
        }

        return parseInt(stack.pop());
    }
}
