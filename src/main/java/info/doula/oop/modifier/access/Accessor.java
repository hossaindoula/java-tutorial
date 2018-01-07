package info.doula.oop.modifier.access;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Accessor {

    public static void main(String[] args) {
        ProtectedAccessModifierEx ex = new ProtectedAccessModifierEx(); //Has-A relationship
        System.out.println(ex.a);
        System.out.println(ex.letsPrint());
        PrivateAccessModifierEx exPr = new PrivateAccessModifierEx();

        //Not possible as 'a' and 'letsPrint()' has private access
        /*System.out.println(exPr.a);
        System.out.println(exPr.letsPrint());*/
    }
}
