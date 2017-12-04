package info.doula.stream;

import java.util.Arrays;

/**
 * @author Mohammed Hossain Doula <hossaindoula@gmail.com>
 */
public class Streams9 {

    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        // C1
        // C2
    }
}