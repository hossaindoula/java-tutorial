package info.doula.oop.modifier;

import info.doula.oop.modifier.access.PrivateAccessModifierEx;
import info.doula.oop.modifier.access.PublicModifierEx;
import info.doula.oop.modifier.nonaccess.StaticModifierEx;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class ModifierAccess {

    public static void main(String[] args) {
        PublicModifierEx ex = new PublicModifierEx(); //Has-A relationship
        System.out.println(ex.a);
        System.out.println(ex.letsPrint());
        PrivateAccessModifierEx exPr = new PrivateAccessModifierEx();

        //Not possible as 'a' and 'letsPrint()' has private access
        /*System.out.println(exPr.a);
        System.out.println(exPr.letsPrint());*/

        ChildProtectedAccess prot = new ChildProtectedAccess();
        System.out.println(prot.b);
        System.out.println(prot.letsShow());

        System.out.println("letsGetPrinted() = " + letsGetPrinted());
        System.out.println("strShow() = " + StaticModifierEx.strShow());
    }

    public static int letsGetPrinted() {
        return StaticModifierEx.b;
    }
}
