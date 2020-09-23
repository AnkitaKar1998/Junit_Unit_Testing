package Stubbing_Calls;

public class Process {

    private SomeService someService;

    public Process(SomeService someService) {
        this.someService = someService;
    }

    public String processing() {
        int a = someService.doSomething();
        return "The number is "+a;
    }
}
