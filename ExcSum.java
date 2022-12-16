import java.util.Scanner;
public class ExcSum{
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);

    String s1=sc.next();
    String s2=sc.next();*/

    try{
      int num1=Integer.parseInt (args[0]) ;
      int num2=Integer.parseInt (args[1]) ;

      int num3= num1+num2;
      System.out.println("sum:"+num3);
    }
    catch(NumberFormatException e){
      System.out.println(e);
      System.out.println("inputs are "+args[0]+" & "+args[1]);
    }
  }
}
