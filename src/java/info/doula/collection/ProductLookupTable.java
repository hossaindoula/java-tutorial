package info.doula.collection;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public interface ProductLookupTable {
    ProductEnhance lookupById(int id);

    void addProduct(ProductEnhance productToAdd);

    void clear();
}
