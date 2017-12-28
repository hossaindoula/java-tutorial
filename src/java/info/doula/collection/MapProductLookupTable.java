package info.doula.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class MapProductLookupTable implements ProductLookupTable {
    private final Map<Integer, ProductEnhance> idToProduct = new HashMap<>();

    @Override
    public void addProduct(final ProductEnhance productToAdd) {
        final int id = productToAdd.getId();
        if (idToProduct.containsKey(id)) {
            throw new IllegalArgumentException(
                "Unable to add product, duplicate id for: " + productToAdd);
        }

        idToProduct.put(id, productToAdd);
    }

    @Override
    public ProductEnhance lookupById(final int id)
    {
        return idToProduct.get(id);
    }

    public void clear()
    {
        idToProduct.clear();
    }
}
