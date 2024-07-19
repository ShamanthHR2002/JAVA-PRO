public class Operations
{
    public static void method1()
    {
        System.out.println("Executing method1");
        method2();
    }

    public static void method2()
    {
        System.out.println("Executing method2");
        method3();
    }

    public static void method3()
    {
        System.out.println("Executing method3");
        method4();
    }

    public static void method4()
    {
        System.out.println("Executing method4");
        method5();
    }

    public static void method5()
    {
        System.out.println("Executing method5");
    }
{
    public static void main(String[] args)
    {
        Operations.method1();
    }
}

}

