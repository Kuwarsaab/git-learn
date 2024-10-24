//finding a term in the fibonacci sequence
import java.util.Scanner;//importing scanner class
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term");
        int term=sc.nextInt();//taking input from the user
        int ans=fib(term);//calling fib funcion
        System.out.println("RESULT = "+ans);//printing result
    }
    public static int fib(int n)//function to find a term in fibonacci sequence
    {
        if(n==0)//base case
        return 0;
        if(n==1)//base case
        return 1;
        return fib(n-1)+fib(n-2);//recursive call
    }
}
