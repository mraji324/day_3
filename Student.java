import java.util.*;
public class Student
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int d=sc.nextInt();
          int e=sc.nextInt();
          String s=sc.nextLine();
          boolean p=a>=35&&b>=35&&c>=35&&d>=35&&e>=35;
          double avg=(a+b+c+d+e)/5;
          if(avg>=80&&avg<=100&&p)
          {
           String f=String.format("%s your Status=PASS avg=%f and Grade=A",s,avg);
          System.out.println(f);
          }
           else if(avg>=60&&avg<=80&&p)
           {
            String f=String.format("%s your Status=PASS avg=%f and Grade=B",s,avg);
           System.out.println(f);
           }
           else if(avg>=40&&avg<=60&&p)
           {
             String f=String.format("%s your Status=PASS avg=%f and Grade=C",s,avg);
            System.out.println(f);
           }
           else{
              String f=String.format("%s your Status=FAIL avg=%f and Grade=F",s,avg);
              System.out.println(f);
           }
    }   
}
