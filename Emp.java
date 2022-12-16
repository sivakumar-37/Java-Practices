import java.util.Scanner;
class Empdetails{
  String name;
  double salary;
  int hour;
  public void setval(String n, double s, int h){
    name=n;
    salary=s;
    hour=h;
  }
  public void getval(){
    System.out.println("Name:"+name);
    System.out.println("Salary:"+salary);
    System.out.println("Hours:"+hour);
  }
  void salincr(){
    if(hour==8)
      salary+=50;
    if(hour==10)
      salary+=100;
    if(hour>=12)
      salary+=150;
  }
}

public class Emp{
  public static void main(String[] args){
    System.out.println("Enter the no of employee:");
    Scanner sc= new Scanner(System.in);
    int m=sc.nextInt();
    int i;
    Empdetails x[]= new Empdetails[m];

    for (i=0;i<m ;i++ ) {
      x[i]= new Empdetails();
    }

    for (i=0;i<m ;i++ ) {
      System.out.println("Details of empolyee:"+(i+1));
      System.out.println("Enter name:");
      String n=sc.next();
      System.out.println("Enter salary:");
      double s=sc.nextDouble();
      System.out.println("Enter hours:");
      int h=sc.nextInt();

      x[i].setval(n,s,h);
    }
    System.out.println("Result:");
    for (i=0;i<m ;i++ ) {
      System.out.println("Employee:"+(i+1));
      x[i].salincr();
      x[i].getval();
    }
  }
}
