package info.doula.nio2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
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
public class PathMatching {
	public static void main(String[] args) {
		String globPattern = "glob:**txt";
		PathMatcher matcher = 
			FileSystems.getDefault().getPathMatcher(globPattern);
		Path path = Paths.get("C:\\movies\\subtitle.txt");
		boolean matched = matcher.matches(path);
		System.out.format("%s matches %s: %b%n", 
		                  globPattern, path, matched);
	}
}
