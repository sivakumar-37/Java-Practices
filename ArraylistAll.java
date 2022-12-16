import java.util.*;
public class ArraylistAll{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    System.out.println("Enter values:");
    for(int i=0;i<5;i++){
      list.add(sc.next());
    }
    System.out.println("List 1:");
    for(String ele : list) {
      System.out.println(ele);
    }
    System.out.println("ele at pos 1:");
    String ob0 = sc.next();
    list.add(0,ob0);
    System.out.println(list);

    System.out.println("enter the position to know the value:");
    int i = sc.nextInt();
    String ob1 = list.get(i);
    System.out.println("element:"+ob1);

    System.out.println("enter the position to be updated:");
    int j = sc.nextInt();
    System.out.println("enter the new element:");
    String ob2 = sc.next();
    list.set(j,ob2);
    System.out.println(list);

    System.out.println("Remove the third element:");
    list.remove(2);
    System.out.println(list);

    System.out.println("search for an element:");
    String ob3 = sc.next();
    if(list.contains(ob3))
      System.out.println("Found");
    else
      System.out.println("No element found");

    System.out.println("Sorted:");
    Collections.sort(list);
    System.out.println(list);

    System.out.println("New list:");
    ArrayList<String> list2 = new ArrayList<String>();
    Collections.copy(list2,list);
    System.out.println(list2);

    System.out.println("Reverse:");
    System.out.println("before "+list);
    Collections.reverse(list);
    System.out.println("after "+list);

    System.out.println("SWAP:");
    Collections.swap(list, 0, 2);
    System.out.println("after swap: "+list);

    System.out.println("List 2:");
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()){
      System.out.print(itr.next()+" ");
    }
  }
}
