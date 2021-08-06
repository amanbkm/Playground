import java.util.Stack;
import java.util.Scanner;
import java.util.*;
class Main
{
  public static void revstring(String str)
  {
    Stack<Character> a = new Stack<>();
    for(int i=0;i<str.length();++i)
    {
      a.push(str.charAt(i));
    }
    Character[] rev = new Character[str.length()];
    for(int i=0;i<str.length();++i)
    {
      rev[i] = a.pop();
      System.out.print(rev[i]);
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    revstring(str);
  }
}