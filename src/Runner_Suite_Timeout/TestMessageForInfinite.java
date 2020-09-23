package Runner_Suite_Timeout;

import org.junit.Test;

public class TestMessageForInfinite {

    Message msg = new Message("hello");

    @Test(timeout = 1000)
    public void testWaitInfiniteMethod() {
        msg.waitInfinite();
    }
}
