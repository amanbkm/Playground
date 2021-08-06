import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    Long n = in.nextLong();
    String temp = Long.toString(n);
    int[] newGuess = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++)
    {
        newGuess[i] = temp.charAt(i) - '0';
    }
    int sum_even = 0, sum_odd = 0;
    for(int i=0;i<newGuess.length;++i)
    {
      if(i%2 == 0)
        sum_odd+=newGuess[i];
      else
        sum_even+=newGuess[i];
    }
    System.out.println(Math.abs(sum_even - sum_odd));

  }
}