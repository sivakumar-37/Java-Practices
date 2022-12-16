import java.util.Scanner;
abstract class Marks{
  public abstract void getPercentage();
}

class A extends Marks{
  double m1,m2,m3;
  A(double m1,double m2,double m3){
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
  public void getPercentage(){
    double total=((m1+m2+m3)/300)*100;
    System.out.println("Percentage of A:"+total);
  }
}

class B extends Marks{
  double m1,m2,m3,m4;
  B(double m1,double m2,double m3,double m4){
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
    this.m4=m4;
  }
  public void getPercentage(){
    double total=((m1+m2+m3+m4)/400)*100;
    System.out.println("Percentage of B:"+total);
  }
}

public class abstMark{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter A mark 1:");
    double a1=sc.nextDouble();
    System.out.println("enter A mark 2:");
    double a2=sc.nextDouble();
    System.out.println("enter A mark 3:");
    double a3=sc.nextDouble();
    A o1 = new A(a1,a2,a3);

    o1.getPercentage();

    System.out.println("enter B mark 1:");
    double b1=sc.nextDouble();
    System.out.println("enter B mark 2:");
    double b2=sc.nextDouble();
    System.out.println("enter B mark 3:");
    double b3=sc.nextDouble();
    System.out.println("enter B mark 4:");
    double b4=sc.nextDouble();
    B o2 = new B(b1,b2,b3,b4);

    o2.getPercentage();
  }
}
