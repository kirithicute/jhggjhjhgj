import java.io.*;
import java.util.Scanner;
public class Palindromess {
  
  
  public static void main(String[] args) {
    int n,and=0,a=0,t,i=0,t1;
    
    
    Scanner s1=new Scanner(System.in);
    n=s1.nextInt();
    while(n>0)
    {
      t=n%10;
      a=a*10+(t*t*t);
      n=n/10;
    }
    if(a==n)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("not palindrome");  
    }
    
  }
}
