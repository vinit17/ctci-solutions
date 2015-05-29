import org.junit.Test;

import static org.junit.Assert.*;

public class Q5Test {

    interface SpaceReplace {
        String spaceReplace(String str);

    }

    public void testSpaceReplace(SpaceReplace spaceReplace) {
        assertEquals("Mr%20John%20Smith", spaceReplace.spaceReplace("Mr John Smith"));
    }

    @Test
    public void testReplaceStringSpaces() throws Exception {
        testSpaceReplace(Q5::replaceStringSpaces);
    }

    @Test
    public void testReplaceStringSpaces_Easy() throws Exception {
        testSpaceReplace(Q5::replaceStringSpaces_Easy);
    }

}