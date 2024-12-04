
import java.util.*;
public class Check4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          if((a&(a-2))==0)
          {
          System.out.println("power of 4");
          }
           else
           {
           System.out.println("not power of 4");
           }
    }   
}
