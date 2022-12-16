import java.util.Scanner;
class Student{
  int roll;
  String name;
  int age;
  String address;
  public void setval(int r, String n, int a, String d){
    roll=r;
    name=n;
    age=a;
    address=d;
  }
  public void getval(){
    System.out.println("Roll NO:"+roll);
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Address:"+address);
  }
  void nage(){
    if(age==14)
      getval();
    else
      System.out.println("This student age is not 14");
  }
  void evenroll(){
    if((roll%2)==0)
      getval();
    else
    System.out.println("This student roll no is not even");
  }
}

public class Class{
  public static void main(String[] args){
    System.out.println("Enter thr no of students:");
    Scanner x= new Scanner(System.in);
    int m=x.nextInt();
    int i;

    Student s[]= new Student[m];
    for(i=0;i<m;i++){
      s[i]= new Student();
    }

    Student ageft = new Student();
    System.out.println("Enter the student details");
    for (i=0;i<m;i++) {
      System.out.println("Details of student:"+(i+1));
      System.out.println("Enter the roll:");
      int r=x.nextInt();
      System.out.println("Enter the name:");
      String n=x.next();
      System.out.println("Enter the address:");
      String d=x.next();
      System.out.println("Enter the age:");
      int a=x.nextInt();

      s[i].setval(r,n,a,d);
    }
    System.out.println("Result");
    for (i=0;i<m;i++) {
      s[i].getval();
    }
    System.out.println("Student of age 14:");
    for (i=0;i<m ;i++ ) {
      System.out.println("Student:"+(i+1));
      s[i].nage();
    }

    System.out.println("Student of evenroll:");
    for (i=0;i<m ;i++ ) {
      System.out.println("Student:"+(i+1));
      s[i].evenroll();
    }
  }
}
