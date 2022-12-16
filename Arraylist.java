import java.util.*;
public class Arraylist{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter values:");
    for(int i=0;i<10;i++){
      list.add(sc.nextInt());
    }

    System.out.println("List:");
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }
  }
}
