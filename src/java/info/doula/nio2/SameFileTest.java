package info.doula.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
public class SameFileTest {
	public static void main(String[] args) {
		// Assume that C:\poems\luci1.txt file exists  
		Path p1 = Paths.get("C:\\movies\\test.txt");
		Path p2 = Paths.get("C:\\movies\\..\\subtitle\\test.txt");

		// Assume that C:\abc.txt file does not exist  
		Path p3 = Paths.get("C:\\abc.txt");
		Path p4 = Paths.get("C:\\abc.txt");
		try {
			boolean isSame = Files.isSameFile(p1, p2);
			System.out.println("p1 and p2 are the same: " + isSame);

			isSame = Files.isSameFile(p3, p4);
			System.out.println("p3 and p4 are the same: " + isSame);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
