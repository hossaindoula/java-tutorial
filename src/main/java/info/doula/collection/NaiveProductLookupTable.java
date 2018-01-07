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
public class NaiveProductLookupTable implements ProductLookupTable {
    private final List<ProductEnhance> products = new ArrayList<>();

    @Override
    public void addProduct(final ProductEnhance productToAdd) {
        final int uniqueId = productToAdd.getId();
        for (final ProductEnhance product : products) {
            if (product.getId() == uniqueId) {
                throw new IllegalArgumentException(
                    "Unable to add product, duplicate id for: " + productToAdd);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public ProductEnhance lookupById(final int id) {
        for (final ProductEnhance product : products) {
            if (product.getId() == id)
            {
                return product;
            }
        }

        return null;
    }

    public void clear()
    {
        products.clear();
    }
}
