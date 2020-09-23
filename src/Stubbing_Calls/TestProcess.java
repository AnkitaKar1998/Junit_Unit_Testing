package Stubbing_Calls;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestProcess {

    @Test
    public void testProcessingMethod() {
        SomeService someService = Mockito.mock(SomeService.class);
        Mockito.when(someService.doSomething()).thenReturn(10,20,30,40);
        Process process = new Process(someService);

        String msg1 = process.processing();
        Assert.assertEquals("The number is 10", msg1);

        String msg2 = process.processing();
        Assert.assertEquals("The number is 20", msg2);

        String msg3 = process.processing();
        Assert.assertEquals("The number is 30", msg3);

        String msg4 = process.processing();
        Assert.assertEquals("The number is 40", msg4);
    }
}
