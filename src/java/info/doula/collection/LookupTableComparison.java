package info.doula.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class LookupTableComparison {
    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;

    private static final List<ProductEnhance> products = generateProducts();

    public static void main(String[] args) {
        runLookups(new MapProductLookupTable());
        runLookups(new NaiveProductLookupTable());
    }

    private static List<ProductEnhance> generateProducts() {
        final List<ProductEnhance> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new ProductEnhance(i, "Product" + i, 10 + weightGenerator.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }

    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<ProductEnhance> products = LookupTableComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();

            for (ProductEnhance product : products) {
                lookupTable.addProduct(product);
            }

            for (ProductEnhance product : products) {
                final ProductEnhance result = lookupTable.lookupById(product.getId());
                if (result != product) {
                    throw new IllegalStateException("Lookup Table returned wrong result for " + product);
                }
            }

            lookupTable.clear();

            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}
