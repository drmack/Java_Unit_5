public class Fibonacci extends ConsoleProgram
{
    private int fibonacci(int x)
    {
        if(x == 0 || x == 1)
        {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
}
