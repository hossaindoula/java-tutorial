package info.doula.nio;

import java.nio.ByteOrder;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 *
 * skype: mohammedhossaindoularonnie
 *
 * http://hossaindoula.com
 *
 * https://github.com/hossaindoula
 */
public class MachineByteOrder {
	public static void main(String args[]) {
		ByteOrder b = ByteOrder.nativeOrder();
		if (b.equals(ByteOrder.BIG_ENDIAN)) {
			System.out.println("Big endian");
		} else {
			System.out.println("Little endian");
		}
	}
}
