package info.doula.nio;

import java.util.Map;
import java.nio.charset.Charset;
import java.util.Set;

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

public class AvailableCharsets {
	public static void main(String[] args) {
		Map<String, Charset> map = Charset.availableCharsets();
		Set<String> keys = map.keySet();
		System.out.println("Available Character Set Count: " + keys.size());
		for(String charsetName : keys) {
			System.out.println(charsetName);
		}
	}
}
