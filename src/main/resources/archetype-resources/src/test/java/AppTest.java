package ${groupId};

import org.junit.Test;
import org.junit.Before;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    boolean testVal;

    @Before
    public void setUp() {
        testVal = true;
    }

    @Test
    public void test01() {
        assertThat(testVal, is(true));
    }
}
