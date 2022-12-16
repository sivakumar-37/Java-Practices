import java.util.Scanner;
class common{
  public void zeroMax(int [] a){
    for(int i=0;i<a.length;i++){
      int j,max=0;
      if(a[i]==0)
      {
        max=0;
        for(j=i+1;j<a.length-1;j++)
        {
          if (a[j]%2 != 0)
          {
            if(a[j]>max)
              max=a[j];
          }
          a[i]=max;
        }
      }
    }

    System.out.println("Result:");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}

public class arrayZeroMax{
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
    c.zeroMax(a);
  }
}
