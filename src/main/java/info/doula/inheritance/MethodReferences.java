package info.doula.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparingInt;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class MethodReferences {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ronnie", "Ony", "Johnny");

        List<Integer> namesLength = transform(names, String::length);
        System.out.println(namesLength);

        List<String> upperCaseNames = transform(names, String::toUpperCase);
        System.out.println(upperCaseNames);

        List<Integer> numbers = transform(Arrays.asList("1", "2", "3"), Integer::parseInt);
        System.out.println(numbers);

        Collections.sort(names, comparingInt(String::length).reversed());
        System.out.println(names);
    }

    private static <T, R> List<R> transform(List<T> list, Function<T, R> fx) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(fx.apply(element));
        }
        return result;
    }
}
