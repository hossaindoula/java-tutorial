package info.doula.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

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
public class ProbeFileContent {
	public static void main(String[] args) {
		Path p = Paths.get("C:\\movies\\test.txt");

		try {
			String contentType = Files.probeContentType(p);
			System.out.format("Content type of %s is %s%n", p, contentType);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
