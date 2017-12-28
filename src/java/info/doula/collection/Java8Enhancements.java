package info.doula.collection;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {
    public static void main(String[] args) {
        final ProductEnhance defaultProduct = new ProductEnhance(-1, "Whatever the customer wants", 100);

        final Map<Integer, ProductEnhance> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        ProductEnhance result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        result = idToProduct
            .computeIfAbsent(10, (id) -> new ProductEnhance(id, "Custom Product", 10));
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        result = idToProduct.replace(1, new ProductEnhance(1, "Big Door", 50));
        System.out.println(result);
        System.out.println(idToProduct.get(1));
        System.out.println();

        idToProduct.replaceAll((key, oldProduct) ->
            new ProductEnhance(oldProduct.getId(), oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println();

        idToProduct.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
