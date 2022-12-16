import java.util.*;
public class DoubleLinked{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Double> list = new LinkedList<Double>();
    System.out.println("Enter values:");
    for(int i=0;i<5;i++){
      list.add(sc.nextDouble());
    }

    System.out.println("Enter value to be removed:");
    double key = sc.nextDouble();
    list.remove(key);

    System.out.println("List:");
    Iterator<Double> itr = list.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
