import java.util.Scanner;
class Accountdetails{
  String name;
  double balance;
  int accno;
  public void setval(String n, double b, int a){
    name=n;
    balance=b;
    accno=a;
  }
  public void getval(){
    System.out.println("Name:"+name);
    System.out.println("Balance:"+balance);
    System.out.println("Account No:"+accno);
  }
  void balincr(){
    if(balance>1000){
      balance+=100;
      getval();
    }
    else{
      System.out.println("This holder's balance less than 1000");
    }
  }
  void lowbal(){
    if(balance<200){
      getval();
    }
    else{
      System.out.println("This holder's balance is more than 200");
    }
  }
}

public class Account{
  public static void main(String[] args){
    System.out.println("Enter the no of Account holder:");
    Scanner sc= new Scanner(System.in);
    int m=sc.nextInt();
    int i;
    Accountdetails x[]= new Accountdetails[m];

    for (i=0;i<m ;i++ ) {
      x[i]= new Accountdetails();
    }

    for (i=0;i<m ;i++ ) {
      System.out.println("Details of Account:"+(i+1));
      System.out.println("Enter name:");
      String n=sc.next();
      System.out.println("Enter Balance:");
      double b=sc.nextDouble();
      System.out.println("Enter Account no:");
      int a=sc.nextInt();

      x[i].setval(n,b,a);
    }
    System.out.println("Result");
    for (i=0;i<m ;i++ ) {
      x[i].getval();
    }
    System.out.println("Account holder with more than 1000 balance:");
    for (i=0;i<m ;i++ ) {
      System.out.println("Account holder:"+(i+1));
      x[i].balincr();
    }

    System.out.println("Account holders with less than 200 balance: ");
    for (i=0;i<m ;i++ ) {
      System.out.println("Account holder:"+(i+1));
      x[i].lowbal();
    }
  }
}
