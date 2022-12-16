import java.util.Scanner;
class MetricConv{
  public double x;

  public void inchTocent(double x ){
    double result = x*2.54;
    System.out.println(x+" inches equals "+result+" centimeter");
  }
  public void feetTocent(double x ){
    double result = x*30;
    System.out.println(x+" feet equals "+result+" centimeter");
  }
  public void yardTometer(double x ){
    double result = x*0.91;
    System.out.println(x+" yards equals "+result+" meter");
  }
  public void milesTokm(double x ){
    double result = x*1.6;
    System.out.println(x+" meter equals "+result+" kilometer");
  }
  public void centToinch(double x ){
    double result = x/2.54;
    System.out.println(x+" centimeter equals "+result+" inches");
  }
  public void centTofeet(double x ){
    double result = x/30;
    System.out.println(x+" centimeter equals "+result+" feet");
  }
  public void meterToyard(double x ){
    double result = x/0.91;
    System.out.println(x+" meter equals "+result+" yards");
  }
  public void kmTomiles(double x ){
    double result = x/1.6;
    System.out.println(x+" kilometer equals "+result+" miles");
  }
}

public class applicConvertor{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      double x= sc.nextFloat();

      System.out.println("Convert:");
      System.out.print("1.Inches to Centimeters\t 2.Feet to Centimeters\t 3.Yards to Meters\n 4.Miles to Kilometers\t 5.Centimeters to Inches\t 6.Centimeters to Feet\n 7.Meters to Yards\t 8.Kilometers to Miles\n");

      System.out.println("Enter your choice:");
      int y= sc.nextInt();

      MetricConv mc = new MetricConv();
      switch(y){
        case 1: mc.inchTocent(x);
        break;
        case 2: mc.feetTocent(x);
        break;
        case 3: mc.yardTometer(x);
        break;
        case 4: mc.milesTokm(x);
        break;
        case 5: mc.centTofeet(x);
        break;
        case 6: mc.centTofeet(x);
        break;
        case 7: mc.meterToyard(x);
        break;
        case 8: mc.kmTomiles(x);
        break;
        default : System.out.println("Invaild Input");
      }
  }
}
