import java.util.Scanner;
class common{
  public boolean commonEnd(int [] a, int [] b){
    if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
      return true;
    else
      return false;
  }
}

public class arrayFirstLast{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of first array:");
    int n1 = sc.nextInt();
    System.out.println("enter the size of second array:");
    int n2 = sc.nextInt();

    int[] a =new int[n1];
    int[] b =new int[n2];

    System.out.println("Array 1:");
    for(int i=0;i<n1;i++){
      System.out.println("enter "+i+" ele:");
      a[i]=sc.nextInt();
    }

    System.out.println("Array 2:");
    for(int i=0;i<n2;i++){
      System.out.println("enter "+i+" ele:");
      b[i]=sc.nextInt();
    }
    common c= new common();
    System.out.println(c.commonEnd(a,b));
  }
}
