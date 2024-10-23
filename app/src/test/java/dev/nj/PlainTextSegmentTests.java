package dev.nj;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlainTextSegmentTests {

    @Test
    public void plainTextEvaluateAsIs() {
        Map<String, String> variables = new HashMap<>();
        String text = "abc def";
        assertEquals(text, new PlainText(text).evaluate(variables));
    }

}

