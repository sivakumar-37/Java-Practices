import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateCompare{
  public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the date1:");
    String x=s.nextLine();
    System.out.println("Enter the date2:");
    String y=s.nextLine();
    Date d1= new SimpleDateFormat("dd/MM/yyyy").parse(x);
    Date d2= new SimpleDateFormat("dd/MM/yyyy").parse(y);

    if (d1.compareTo(d2)==0)
      System.out.println("Dates are equal");
    else
      System.out.println("Dates are not equal");
  }
}
