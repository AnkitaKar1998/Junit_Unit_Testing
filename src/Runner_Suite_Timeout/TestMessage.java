package Runner_Suite_Timeout;

import org.junit.Assert;
import org.junit.Test;

public class TestMessage {

    Message msg = new Message("Ankita");

    @Test
    public void testGetMessageMethod() {
        String expected = "Ankita";
        Assert.assertEquals(expected, msg.getMessage());
    }
}
