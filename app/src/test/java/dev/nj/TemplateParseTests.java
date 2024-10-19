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

}

