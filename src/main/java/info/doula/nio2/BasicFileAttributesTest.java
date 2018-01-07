package info.doula.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

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
public class BasicFileAttributesTest {
	public static void main(String[] args) {
		// Change the file path of an existing file
		Path path = Paths.get("C:\\movies\\test.txt");

		try {
			// Read basic file attributes  
			BasicFileAttributes bfa = 
			   Files.readAttributes(path, BasicFileAttributes.class);

			// Print some of the basic file attributes  
			System.out.format("Size:%s bytes %n", bfa.size());
			System.out.format("Creation Time:%s %n", 
			                  bfa.creationTime());
			System.out.format("Last Access Time:%s %n", 
			                  bfa.lastAccessTime());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
