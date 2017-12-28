package info.doula.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        // 0. Iterable
        // 1. Collection with foreach
        // 2. Can't print out and remove - CME
        // 3. refactor to iterator

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            final Product product = iterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                iterator.remove();
            }
        }

        System.out.println(products);

        // 4. other methods

        System.out.println(products.size());
        System.out.println(products.isEmpty());

        System.out.println(products.contains(floorPanel));

        products.remove(floorPanel);

        System.out.println(products.contains(floorPanel));

        // 5. removeAll
        List<Product> otherProducts = new ArrayList<>();
        otherProducts.add(door);
        otherProducts.add(window);

        products.removeAll(otherProducts);
        System.out.println(products);
    }
}
