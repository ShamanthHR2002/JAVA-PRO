class Factorial 
{
    public static int factorial(int n) 
	{
        int ref = 1;
        for (int i = 1; i <= n; i++) 
		{
            ref *= i;
        }
        return ref;
    }

    public static void main(String[] args) 
	{
        int number = 5;
        int ref = factorial(number);
        System.out.println("Factorial of " + number + " is: " + ref);
    }
}
