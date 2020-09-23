package Runner_Suite_Timeout;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMessage.class,
        TestMessage2.class,
        TestMessageForInfinite.class
})

public class TestSuite {
}
