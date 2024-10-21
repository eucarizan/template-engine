package dev.nj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemplatePerformanceTests {

    private Template template;

    @BeforeEach
    public void setUp() {
        buildTemplate();
        populateTemplate();
    }

    private void populateTemplate() {
        for (int var = 1; var < 100; var++) {
            template.set("var" + var, "value of var" + var);
        }
    }

    private void buildTemplate() {
        StringBuilder text = new StringBuilder(50000);
        for (int i = 0, var = 1; i < 1000; i++, var++) {
            text.append(" template ");
            if (i % 1000 / 50 == 0) {
                text.append("${var").append(var).append("}");
            }
        }
        template = new Template(text.toString());
    }

    @Test
    public void templateWith1000WordsAnd20Variables() {
        long expected = 500L;
        long time = System.currentTimeMillis();
        template.evaluate();
        time = System.currentTimeMillis() - time;
        assertTrue(time <= expected, "Rendering the template took " + time
                        + "ms while the target was " + expected + "ms");
    }

    @Test
    public void testRenderingThousandWordTemplate() {
        long time = System.currentTimeMillis();
        template.evaluate();
        time = System.currentTimeMillis() - time;
        assertTrue(time <= 100, "Rendering a 1000-word template took " + time
                        + "ms while the acceptable limit was 100ms");
    }

}

