//check if a nuber is paldrome or not
import java.util.Scanner;//importaing Scanner class
public class palidrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();//taking input from the user
        int rev=0;
        int a=n;
        int r;
        //finding reverse
        while(n>0)
        {
            r=n%10;//extracting the last digit
            rev=rev*10+r;//forming the reverse
            n=n/10;//removing the last digit
        }
        if(rev==a)
            System.out.println("The number is a palindrome");
        else
        System.out.println("The number is not a palindrome");
   }
}
