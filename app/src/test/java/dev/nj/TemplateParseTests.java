package dev.nj;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateParseTests {

    @Test
    public void emptyTemplateRendersAsEmptyString() {
        List<String> segments = parse("");
        assertEquals(1, segments.size(), "Number of segments");
        assertEquals("", segments.get(0));
    }

    @Test
    public void templateWithOnlyPlainText() {
        List<String> segments = parse("plain text only");
        assertEquals(1, segments.size(), "Number of segments");
        assertEquals(segments.get(0), "plain text only");
    }

    private List<String> parse(String template) {
        return new TemplateParse().parse(template);
    }

}
