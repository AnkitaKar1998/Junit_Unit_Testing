package RunnerExercise;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMessage.class,
        TestMessage2.class
})

public class TestSuite {
}
