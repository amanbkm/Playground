import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner in = new Scanner(System.in);
    	String str1 = in.next();
    	String str2 = in.next();
    	char[] ch1 = str1.toCharArray();
    	char[] ch2 = str2.toCharArray();
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	String str3 = Arrays.toString(ch1);
    	String str4 = Arrays.toString(ch2);
    
    	if(str3.equals(str4))
          	System.out.println("Anagram");
   		else
          	System.out.println("Not anagrams");
    	
    	
    	
  }
}