abstract class Animal{
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animal{
  public void cats(){
    System.out.println("Cats memow");
  }
  public void dogs(){}
}

class Dogs extends Animal{
  public void cats(){}
  public void dogs(){
    System.out.println("Dogs bark");
  }
}

public class abstAnimals{
  public static void main(String[] args) {
    Cats o1= new Cats();
    o1.cats();
    Dogs o2= new Dogs();
    o2.dogs();
  }
}
