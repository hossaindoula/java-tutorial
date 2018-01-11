package info.doula.oop;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class SubCalculation extends Calculation {

    /**
     * Overriding is one way of doing polymorphism
     */
    @Override
    public int sum(int a, int b) {
        return 5 + a + b;
    }
}
