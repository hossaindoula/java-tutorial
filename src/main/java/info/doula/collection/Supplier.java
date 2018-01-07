package info.doula.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Supplier {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public List<Product> products()
    {
        return products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
            "name='" + name + '\'' +
            ", products=" + products +
            '}';
    }
}
