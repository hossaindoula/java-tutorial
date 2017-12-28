package info.doula.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
public class ViewsOverMaps {
    public static void main(String[] args) {
        final Map<Integer, ProductEnhance> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        // ids.add(1);

        final Collection<ProductEnhance> products = idToProduct.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();

        // products.add(ProductFixtures.floorPanel);

        final Set<Map.Entry<Integer, ProductEnhance>> entries = idToProduct.entrySet();
        for(Map.Entry<Integer, ProductEnhance> entry : entries) {
            System.out.println(entry);
        }

        idToProduct.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
