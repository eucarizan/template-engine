package dev.nj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemplateTest {

    private Template template;

    @BeforeEach
    public void setUp() throws Exception {
        template = new Template("${one}, ${two}, ${three}");
        template.set("one", "1");
        template.set("two", "2");
        template.set("three", "3");
    }

    @Test
    public void multipleVariables() throws Exception {
        assertTemplateEvaluatesTo("1, 2, 3");
    }

    @Test 
    public void unknownVariablesAreIgnored() throws Exception {
        template.set("doesnotexist", "Hi");
        assertTemplateEvaluatesTo("1, 2, 3");
    }

    @Test
    public void missingValueRaisesException() throws Exception {
        try {
            new Template("${foo}").evaluate();
            fail("evaluate() should throw an exception if " +
                    "a variable was left without a value!");
        } catch (MissingValueException expected) {

        }
    }

    private void assertTemplateEvaluatesTo(String expected) {
        assertEquals(expected, template.evaluate());
    }
}
