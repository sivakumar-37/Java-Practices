class A{
  static void print(){
    System.out.println("Parent");
  }
}

class B extends A{
  static void print(){
    System.out.println("Child");
  }
}

public class inheriAB{
  public static void main(String[] args) {
    A o1 = new A();
    B o2 = new B();
    A o3 = new B();

    A.print();
    B.print();
    B.print();
  }
}
