import java.util.Scanner;
public class ASCII
{
  void print(int n)
  {
    for(int i=32;i<=n;i++)                  //statring from 32 'cause its blank below it and 32 is ASCII for blank_space
    System.out.println(i+" -> "+(char)i);   //Type Casting int to char
    System.out.println("Program terminates...");
   }
   
   int input()
   {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    return n;
   }
   
   public static void main(String args[])
   {
    ASCII fresh = new ASCII();
    fresh.print(fresh.input());
   }
  }
