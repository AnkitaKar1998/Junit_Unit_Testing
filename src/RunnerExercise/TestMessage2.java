package RunnerExercise;

import org.junit.Assert;
import org.junit.Test;

public class TestMessage2 {

    Message msg = new Message("Ankita");

    @Test
    public void testGetMessageWithPrefixMethod() {
        String expected = "Hi Ankita";
        Assert.assertEquals(expected, msg.getMessageWithPrefix());
    }

}
