public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
       
        int c = a;
        a = b;
        b = c;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
