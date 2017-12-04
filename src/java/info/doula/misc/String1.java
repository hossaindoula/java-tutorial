package info.doula.misc;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mohammed Hossain Doula <hossaindoula@gmail.com>
 */
public class String1 {

    public static void main(String[] args) {
        testJoin();
        testChars();
        testPatternPredicate();
        testPatternSplit();
    }

    private static void testChars() {
        String string = "foobar:foo:bar"
                .chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());
        System.out.println(string);
    }

    private static void testPatternSplit() {
        String string = Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s -> s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":"));
        System.out.println(string);
    }

    private static void testPatternPredicate() {
        long count = Stream.of("hossaindoula@gmail.com", "hossaindoula@hotmail.com")
                .filter(Pattern.compile(".*@gmail\\.com").asPredicate())
                .count();
        System.out.println(count);
    }

    private static void testJoin() {
        String string = String.join(":", "foobar", "foo", "bar");
        System.out.println(string);
    }
}
