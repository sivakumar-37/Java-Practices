class All extends Thread{
  public void display(){
    for (int i=0;i<100;i++){
      System.out.println(i);
    }
  }
}

class Odd extends Thread{
  public void display(){
    for (int i=1;i<100;i++){
      if(i%2 != 0)
        System.out.println(i);
    }
  }
}

class Even extends Thread{
  public void display(){
    for (int i=1;i<100;i++){
      if(i%2 == 0)
        System.out.println(i);
    }
  }
}

public class ThreadOddEven {
  public static void main(String[] args) {
    All o1 = new All();
    Odd o2 = new Odd();
    Even o3 = new Even();

    System.out.println("ALL:");
    o1.display();
    System.out.println(" ");
    System.out.println("ODD:");
    o2.display();
    System.out.println(" ");
    System.out.println("EVEN:");
    o3.display();
  }
}
