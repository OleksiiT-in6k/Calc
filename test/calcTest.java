import com.interlink.calcFunctions;
import org.junit.Test;

import static com.interlink.calcFunctions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by employee on 7/8/16.
 */
public class calcTest {
    @Test
    public void emptyStringTest() throws Exception {
        assertThat(sum(""),is(0));

    }

    @Test
    public void oneParametrSumTest() throws Exception {
        assertThat(sum("2"),is(2));
    }

    @Test
    public void twoParametrSumTest() throws Exception {
        assertThat(sum("1,2"),is(3));

    }

    @Test
    public void unknownAmountNumbersSumTest() throws Exception {
        assertThat(sum("1,2,6,8,9"),is(26));

    }
}
