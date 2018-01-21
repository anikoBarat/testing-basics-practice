public class BasicCalculator implements Calculator {


    @Override
    public int add(int a, int b) {
        return a + b;
    }


    @Override
    public int subtract(int a, int b) {
        return a - b;
    }


    @Override
    public float divide(int a, int b) throws IllegalArgumentException {
        if(b == 0){
            throw new IllegalArgumentException("Division with 0 isn't a valid operation!");
        }
        return (float) a / b;
    }


    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
