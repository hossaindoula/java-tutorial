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
public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(final Customer customer, final Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Category getCategory()
    {
        return category;
    }

    public String toString() {
        return "Enquiry{" +
            "customer='" + customer + '\'' +
            ", category=" + category +
            '}';
    }
}
