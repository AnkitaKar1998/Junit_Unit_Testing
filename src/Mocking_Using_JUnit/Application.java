package Mocking_Using_JUnit;

public class Application {

    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int addition(int a, int b) {
        return calculatorService.add(a,b);
    }

    public int subtraction(int a, int b) {
        return calculatorService.subtract(a,b);
    }

    public int multiplication(int a, int b) {
        return calculatorService.multiply(a,b);
    }

    public int division(int a, int b) {
        return calculatorService.divide(a,b);
    }

    public int modulo(int a, int b) {
        return calculatorService.remainder(a,b);
    }
}
