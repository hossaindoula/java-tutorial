package info.doula.collection;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class BadHash {
    private String value;
    private int hash;

    public BadHash(final String value, final int hash) {
        this.value = value;
        this.hash = hash;
    }

    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final BadHash badHash = (BadHash) o;

        return value.equals(badHash.value);
    }

    public int hashCode()
    {
        return hash;
    }

    public String toString()
    {
        return "[" + value + ": " + hash +']';
    }
}
