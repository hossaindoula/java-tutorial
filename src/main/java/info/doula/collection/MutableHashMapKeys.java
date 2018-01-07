package info.doula.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class MutableHashMapKeys {
    public static void main(String[] args) {
        final Map<MutableString, String> brokenMap = new HashMap<>();

        final String value = "abc";

        final MutableString key = new MutableString(value);
        brokenMap.put(key, value);

        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);

        key.set("def");

        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);
    }

    private static class MutableString {
        private String value;

        public MutableString(final String value)
        {
            set(value);
        }

        public String get()
        {
            return value;
        }

        public void set(final String value) {
            Objects.requireNonNull(value);
            this.value = value;
        }

        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final MutableString that = (MutableString) o;

            return value.equals(that.value);
        }

        public int hashCode()
        {
            return value.hashCode();
        }

        public String toString()
        {
            return value;
        }
    }
}
