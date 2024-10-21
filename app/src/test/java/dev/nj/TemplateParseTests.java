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

    @Test
    public void parsingMultipleVariables() {
        List<String> segments = parse("${a}:${b}:${c}");
        assertSegments(segments, "${a}", ":", "${b}", ":", "${c}");
    }

    @Test
    public void parsingTemplateIntoSegmentObjects() {
        TemplateParse p = new TemplateParse();
        List<Segment> segments = p.parseSegments("a ${b} c ${d}");
        assertSegments(segments,
            new PlainText("a "), new Variable("b"),
            new PlainText(" c "), new Variable("d"));
    } 

    private List<String> parse(String template) {
        return new TemplateParse().parse(template);
    }

    private void assertSegments(List<? extends Object> actual, Object... expected) {
        assertEquals(expected.length, actual.size(), "Number of segments doesn't match.");
        assertEquals(Arrays.asList(expected), actual);
    }

}

