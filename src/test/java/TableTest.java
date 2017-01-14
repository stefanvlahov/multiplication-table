import mult_table.Table;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TableTest {

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
