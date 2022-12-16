import java.util.Scanner;
class common{
  public void fizzArray(String [] a){
    for(int i=0;i<a.length;i++){
      a[i]=String.valueOf(i);
    }
  }
}

public class arrayString{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n1 = sc.nextInt();

    String [] a =new String [n1];

    common c= new common();
    c.fizzArray(a);
    System.out.println("result:");

    for(int i=0;i<n1;i++){
      System.out.println(a[i]);
    }

  }
}
