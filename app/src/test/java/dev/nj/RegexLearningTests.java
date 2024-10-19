package dev.nj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegexLearningTests {

    @Test
    public void testHowGroupCountWorks() {
        String haystack = "The needle shop sells needles";
        String regex = "(needle)";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        assertEquals(1, matcher.groupCount());
    }

    @Test
    public void testFindStartAndEnd() {
        String haystack = "The needle shop sells needles";
        String regex = "(needle)";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        assertTrue(matcher.find());
        assertEquals(4, matcher.start(), "Wrong start index of 1st match");
        assertEquals(10, matcher.end(), "Wrong end index of 1st match");
    }

}
