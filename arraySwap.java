import java.util.Scanner;
class common{
  public void swap(int [] a){
    int temp;
    temp=a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
  }
}

public class arraySwap{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n1 = sc.nextInt();

    int[] a =new int[n1];

    System.out.println("Array:");
    for(int i=0;i<n1;i++){
      System.out.println("enter "+i+" ele:");
      a[i]=sc.nextInt();
    }

    common c= new common();
    c.swap(a);
    System.out.println("Result:");
    for(int i=0;i<n1;i++){
      System.out.println(a[i]);
    }
  }
}
