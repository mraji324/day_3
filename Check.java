
import java.util.*;
public class Check
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
        if((a&1)==0)
        {
            System.out.println("a is even");
        }
        else
        {
            System.out.println("a is odd");
        }
    }   
}