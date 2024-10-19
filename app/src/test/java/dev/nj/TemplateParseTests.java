package dev.nj;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateParseTests {

    @Test
    public void emptyTemplateRendersAsEmptyString() {
        List<String> segments = parse("");
        assertSegments(segments, "");
    }

    @Test
    public void templateWithOnlyPlainText() {
        List<String> segments = parse("plain text only");
        assertSegments(segments, "plain text only");
    }

    private List<String> parse(String template) {
        return new TemplateParse().parse(template);
    }

    private void assertSegments(List<? extends Object> actual, Object... expected) {
        assertEquals(expected.length, actual.size(), "Number of segments doesn't match.");
        assertEquals(Arrays.asList(expected), actual);
    }

}
