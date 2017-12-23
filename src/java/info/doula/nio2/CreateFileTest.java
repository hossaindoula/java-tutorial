package info.doula.nio2;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
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
public class CreateFileTest {
	public static void main(String[] args) {
		Path p1 = Paths.get("test.txt");
		try {
			Files.createFile(p1);
			System.out.format("File created: %s%n", p1.toRealPath());
		} 
		catch (FileAlreadyExistsException e) {
			System.out.format("File %s already exists.%n", 
			                  p1.normalize());
		} 
		catch (NoSuchFileException e) {
			System.out.format("Directory %s does not exists.%n",
			                  p1.normalize().getParent());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
