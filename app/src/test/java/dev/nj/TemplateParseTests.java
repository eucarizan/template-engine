package dev.nj;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateParseTests {

    @Test
    public void emptyTemplateRendersAsEmptyString() {
        TemplateParse parse = new TemplateParse();
        List<String> segments = parse.parse("");
        assertEquals(1, segments.size(), "Number of segments");
        assertEquals("", segments.get(0));
    }

    @Test
    public void templateWithOnlyPlainText() {
        TemplateParse parse = new TemplateParse();
        List<String> segments = parse.parse("plain text only");
        assertEquals(1, segments.size(), "Number of segments");
        assertEquals(segments.get(0), "plain text only");
    }

}
