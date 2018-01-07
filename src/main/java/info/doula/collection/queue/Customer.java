package info.doula.collection.queue;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Customer {
    public static final Customer JACK = new Customer("Jack");
    public static final Customer JILL = new Customer("Jill");
    public static final Customer MARY = new Customer("Mary");

    private final String name;

    public Customer(final String name)
    {
        this.name = name;
    }

    public void reply(final String message)
    {
        System.out.printf("%s: %s\n", name, message);
    }
}
