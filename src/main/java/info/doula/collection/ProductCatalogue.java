package info.doula.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class ProductCatalogue implements Iterable<Product> {
    private Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier)
    {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
