//check if a string is palindrome or not
import java.util.Scanner;//importing scanner class
public class palidrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();//taking input from the user
        str=str.toLowerCase();
        int len=str.length();//finding lenth of the string
        String rev="";//variable to store reverse of the string
        for(int i=len-1;i>=0;i--)//loop to extract each character of the string
        {
            rev=rev+str.charAt(i);//to create reverse of the entered string
        }
        if(rev.equals(str))//check if reverse f the string is equal to the orginal string
        System.out.println("The String is palidrome");
        else
        System.out.println("This is not a palindrome string");
    }
}
