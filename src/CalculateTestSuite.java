import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestCalculateAdd.class,
        TestCalculateSubtract.class,
        TestCalculateMultiply.class,
        TestCalculateDivide.class
})

public class CalculateTestSuite {
}
