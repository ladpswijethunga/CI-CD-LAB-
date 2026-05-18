public class Calculator {
    public int add(int a,int b){
        return a+b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Division (using double to handle decimal results)
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Returns 0 if someone tries to divide by zero
        }
        return a / b;
    }
    
}
