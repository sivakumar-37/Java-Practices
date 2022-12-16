abstract class Parent{
  public abstract void message();
}

class A extends Parent{
  public void message(){
    System.out.println("This is first subclass");
  }
}

class B extends Parent{
  public void message(){
    System.out.println("This is second subclass");
  }
}

public class abstParent{
  public static void main(String[] args){
    A o1 = new A();
    o1.message();
    B o2 = new B();
    o2.message();
  }
}
