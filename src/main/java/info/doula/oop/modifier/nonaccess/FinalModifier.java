package info.doula.oop.modifier.nonaccess;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public final class FinalModifier extends DummyClass {

    static final int a = 56;

    public static void main(String[] args) {
        //a = 77; //not possible as the it is
    }

    //Not possible because final method cannot be overridden
    /*public int sum(int a, int b) {
        return a;
    }*/
}
