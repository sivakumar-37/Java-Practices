abstract class Something{
  public Something(){
    System.out.println("This is constructor of abstract class");

  }
  public abstract void a_method();
  public void b_method(){
    System.out.println("This is a normal method of abstract class");
  }
}

class SubClass extends Something{
  public void a_method(){
    System.out.println("This is abstract method");
  }
}

public class abstSubClass{
  public static void main(String[] args){
    SubClass SubClass = new SubClass();
    SubClass.a_method();
    SubClass.b_method();
  }
}
