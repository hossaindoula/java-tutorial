package info.doula.oop.modifier;

import info.doula.oop.modifier.access.ProtectedAccessModifierEx;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class ChildProtectedAccess extends ProtectedAccessModifierEx {

    public int b = a;

    public String letsShow() {
        return letsPrint();
    }

}
