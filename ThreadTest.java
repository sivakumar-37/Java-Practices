class x extends Thread{
  public void run(){
    for (int i=1;i<100;i++){
      System.out.println("Thread X:"+i);
    }
  }
}

class y extends Thread{
  public void run(){
    for (int i=1;i<100;i++){
      System.out.println("Thread Y:"+i);
    }
  }
}
public class ThreadTest {
  public static void main(String[] args) {
    x o1 = new x();
    y o2 = new y();
    o1.run();
    System.out.println(" ");
    o2.run();
  }
}
