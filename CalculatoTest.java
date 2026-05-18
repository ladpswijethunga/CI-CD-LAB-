public class CalculatoTest {
    public static void main(String[] args){
        Calculator cal=new Calculator();
        if(cal.add(2,3)==5){
            System.out.println("test passed");

        }else{
            System.out.println("test failed");

        }
    }
    // 2. Testing Subtraction
        if (cal.subtract(10, 4) == 6) {
            System.out.println("Subtraction test passed");
        } else {
            System.out.println("Subtraction test failed");
        }

        // 3. Testing Multiplication
        if (cal.multiply(4, 3) == 12) {
            System.out.println("Multiplication test passed");
        } else {
            System.out.println("Multiplication test failed");
        }

        // 4. Testing Division
        if (cal.divide(10.0, 2.0) == 5.0) {
            System.out.println("Division test passed");
        } else {
            System.out.println("Division test failed");
        }
    }
}
