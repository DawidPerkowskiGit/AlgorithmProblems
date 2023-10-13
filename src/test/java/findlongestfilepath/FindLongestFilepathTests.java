package findlongestfilepath;

import org.example.findlongestfilepath.FindLongestFilepath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLongestFilepathTests {
    FindLongestFilepath findLongestFilepath = new FindLongestFilepath();

    @Test
    public void shouldReturnCorrectPathLength() {
        String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        int longestPath = 32;
        int calculatedPath = findLongestFilepath.find(path);

        assertEquals(longestPath, calculatedPath);
    }
}
