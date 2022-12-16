import java.util.Scanner;
abstract class Shape{
  public abstract void RectangleArea(double x, double t);
  public abstract void SquareArea(double s);
  public abstract void CircleArea(double r);
}

class Area extends Shape{
  double x,y,s,r;
  public void RectangleArea(double x, double y){
    double total=x*y;
    System.out.println("RectangleArea:"+total);
  }

  public void SquareArea(double s){
    double total=s*s;
    System.out.println("SquareArea:"+total);
  }

  public void CircleArea(double r){
    double total=Math.PI*r*r;
    System.out.println("CircleArea:"+total);
  }
}

public class abstArea{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Area o1= new Area();

    for (int i=0;i<4 ;i++ ) {
      System.out.println("Rectangle "+(i+1)+":");
      System.out.println("Enter length:");
      double x = sc.nextDouble();
      System.out.println("Enter breadth:");
      double y = sc.nextDouble();
      o1.RectangleArea(x,y);
    }

    for (int i=0;i<4 ;i++ ) {
      System.out.println("Square "+(i+1)+":");
      System.out.println("Enter side:");
      double s = sc.nextDouble();
      o1.SquareArea(s);
    }

    for (int i=0;i<5 ;i++ ) {
      System.out.println("Circle "+(i+1)+":");
      System.out.println("Enter radius:");
      double r = sc.nextDouble();
      o1.CircleArea(r);
    }
  }
}
