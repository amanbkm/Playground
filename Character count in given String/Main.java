import java.util.*;
class Main
{
  public static void cnt(String s)
  {
    for (int i = 0; i < s.length(); i++) {
 
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                   && s.charAt(i)
                          == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i) +""+count);
        }
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    if(str.length()>20)
      System.out.print("Invalid Input");
   	else
    {
      cnt(str);
    }
             
  }
}