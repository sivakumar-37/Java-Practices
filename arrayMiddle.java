import java.util.Scanner;
class common{
  public void middleWay(int [] a, int [] b){
    int [] c= new int[2];
    c[0]=a[1];
    c[1]=b[1];

    for(int i=0;i<2;i++){
      System.out.println(c[i]);
    }
  }
}

public class arrayMiddle{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] a =new int[3];
    int[] b =new int[3];

    System.out.println("Array 1:");
    for(int i=0;i<3;i++){
      System.out.println("enter "+i+" ele:");
      a[i]=sc.nextInt();
    }

    System.out.println("Array 2:");
    for(int i=0;i<3;i++){
      System.out.println("enter "+i+" ele:");
      b[i]=sc.nextInt();
    }
    common c= new common();
    System.out.println("result:");
    c.middleWay(a,b);
  }
}
