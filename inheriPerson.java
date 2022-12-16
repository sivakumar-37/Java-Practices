import java.util.Scanner;
class Person{
  String name;
  String address;

  public Person(String name,String address){
    this.name= name;
    this.address = address;
  }

  public String getName(){
    return name;
  }

  public String getAddress(){
    return address;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public String toString(){
    return "Person[name=" + name + ",address=" + address + "]";
  }
}

class Student extends Person{
  String program;
  int year;
  double fee;

  public Student(String name, String address, String program, int year, double fee){
    super(name,address);
    this.program= program;
    this.year= year;
    this.fee= fee;
  }

  public String getProgram(){
    return program;
  }

  public void setProgram(String program){
    this.program = program;
  }

  public int getYear(){
    return year;
  }

  public void setYear(int year){
    this.year = year;
  }

  public double getFee(){
    return fee;
  }

  public void setFee(double fee){
    this.fee = fee;
  }

  public String toString(){
    return "Student[Person[name=" + name + ",address=" + address + "],program = "+program +", year = "+year+",fee = "+fee+"";
  }
}

class Staff extends Person{
  String school;
  double pay;

  public Staff(String name, String address, String school, double pay){
    super(name,address);
    this.school= school;
    this.pay= pay;
  }

  public String getSchool(){
    return school;
  }

  public void setSchool(String school){
    this.school = school;
  }

  public double getPay(){
    return pay;
  }

  public void setPay(double pay){
    this.pay = pay;
  }

  public String toString(){
    return "Person[name=" + name + ",address=" + address + "],school= "+school +", pay = "+pay+"";
  }
}

public class inheriPerson{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String name= "xyz";//sc.next();
    String address = "abc";//sc.next();
    String program = "mia";//sc.next();
    int year= 2020;// sc.nextInt();
    double fee= 160000; //sc.nextDouble();
    String school= "mse";//sc.next();
    double pay= 10000;// sc.nextDouble();

    Student stu = new Student(name,address,program, year,fee);
    Staff sta= new Staff(name,address,school,pay);

    System.out.println("name:"+stu.getName()+"  address:"+stu.getAddress()+"  program:"+stu.getProgram()+"  year:"+stu.getYear()+"  fee:"+stu.getFee());
    System.out.println("name:"+sta.getName()+"  address:"+sta.getAddress()+"  school:"+sta.getSchool()+"  pay:"+sta.getPay());
  }
}
