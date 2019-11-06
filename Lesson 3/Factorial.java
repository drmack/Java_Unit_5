public class Factorial extends ConsoleProgram
{
    private int factorial(int x)
    {
        // Base case
        if(x == 0)
        {
            return 1;
        }
        // Recursive case
        return x * factorial(x - 1);
    }
    
    public void run()
    {
        for(int i = 1; i < 8; i++)
        {
            System.out.println(factorial(i));
        }
    }
}
