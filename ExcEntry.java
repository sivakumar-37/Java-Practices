import java.util.Scanner;
public class ExcEntry{
  public static void checker(int h, int m, int s) {
    if((h>=1 && h<=12) && (m>=0 && m<=59) && (s>=0 && s<=59)){
      if(h<=10 && m<=40 && s>=0)
        System.out.println("On Time");
      else
        throw new ArithmeticException("Late");
    }
    else
      throw new ArithmeticException("Invaild time");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the hour:");
    int h=sc.nextInt();
    System.out.println("Enter the mins:");
    int m=sc.nextInt();
    System.out.println("Enter the secs:");
    int s=sc.nextInt();

    try{
      checker(h,m,s);
      System.out.println("Time:"+h+":"+m+":"+s);
    }

    catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }

  }
}
