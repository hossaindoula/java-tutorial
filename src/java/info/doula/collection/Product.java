package info.doula.collection;

import java.util.Comparator;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Product {
    public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
        public int compare(final Product p1, final Product p2) {
            return Integer.compare(p1.getWeight(), p2.getWeight());
        }
    };

    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
