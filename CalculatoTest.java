public class CalculatoTest {
    public static void main(String[] args){
        Calculator cal=new Calculator();
        if(cal.add(2,3)==5){
            System.out.println("test passed");

        }else{
            System.out.println("test failed");

        }
    }
}
