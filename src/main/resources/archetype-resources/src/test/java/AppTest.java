package ${groupId};

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {
    boolean testVal;

    @BeforeEach
    public void setUp() {
        testVal = true;
    }

    @Test
    public void test01() {
        assertThat(testVal, is(true));
    }
}
