class java{
  public void Teach(){
    System.out.println("Teach java");
  }
}
class phy extends java{
  public void Teach(){
    System.out.println("Teach physics");
  }
}
class che extends java{
  public void Teach(){
    System.out.println("Teach Chemistry");
  }
}

public class inheriTeach{
  public static void main(String[] args) {
    java o1;
    o1 = new java();
    o1.Teach();
    o1 = new phy();
    o1.Teach();
    o1 = new che();
    o1.Teach();
  }
}
