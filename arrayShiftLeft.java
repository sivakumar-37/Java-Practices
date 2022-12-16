import java.util.Scanner;
class common{
  public void shiftLeft(int [] a){
    int f=a[0];
    for(int i=0;i<a.length-1;i++){
      a[i]=a[i+1];
    }
    a[a.length-1]=f;

    System.out.println("Result:");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}

public class arrayShiftLeft{
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
    c.shiftLeft(a);
  }
}
