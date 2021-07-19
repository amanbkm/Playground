import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String str = in.next();
    switch(str)
    {
      case "break" : System.out.println("break is a keyword"); break;
      case "case" : System.out.println("case is a keyword"); break;
      case "continue" : System.out.println("continue is a keyword"); break;
      case "default" : System.out.println("default is a keyword"); break;
      case "defer" : System.out.println("defer is a keyword"); break;
      case "else" : System.out.println("else is a keyword"); break;
      case "for" : System.out.println("for is a keyword"); break;
      case "func" : System.out.println("func is a keyword"); break;
      case "goto" : System.out.println("goto is a keyword"); break;
      case "if" : System.out.println("if is a keyword"); break;
      case "map" : System.out.println("map is a keyword"); break;
      case "range" : System.out.println("range is a keyword"); break;
      case "return" : System.out.println("return is a keyword"); break;
      case "struct" : System.out.println("struct is a keyword"); break;
      case "type" : System.out.println("type is a keyword"); break;
      case "var" : System.out.println("var is a keyword"); break;
      default: System.out.println(str+" is not a keyword");
    }
  }
}