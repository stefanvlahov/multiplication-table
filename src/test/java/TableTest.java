import mult_table.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TableTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void calc_given_two_integers_return_value_as_Integer() throws Exception {
        int operand1 = 2, operand2 = 5;
        assertThat(Table.calc(operand1, operand2), is(any(Integer.class)));
    }

    @Test
    public void calc_given_two_integers_return_correct_product() throws Exception {
        int operand1 = 12, operand2 = 7;
        assertThat(Table.calc(operand1, operand2), equalTo(84));
    }

}
