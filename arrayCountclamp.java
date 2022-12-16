import java.util.Scanner;
class common{
  public int countClamp(int [] a){
      int count=0,l=a.length;
      int i=0,temp;

      while(i<l-1){
        temp =0;
        while (i<l-1 && a[i]==a[i+1]){
          i++;
          temp++;
        }
        if(temp>=1)
          count ++;
        i++;
      }
      return count;
  }
}

public class arrayCountclamp{
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
    System.out.println("Result:");
    System.out.println(c.countClamp(a));
  }
}
