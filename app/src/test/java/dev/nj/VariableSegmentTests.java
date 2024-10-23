package dev.nj;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableSegmentTests {

    @Test
    public void variableEvaluatesToItsValue() {
        Map<String, String> variables = new HashMap<>();
        String name = "myvar";
        String value = "myvalue";
        variables.put(name, value);
        assertEquals(value, new Variable(name).evaluate(variables));
    }

}

