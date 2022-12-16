import java.util.Scanner;
class IntandDouble{
  public int i;
  public double d;

  public IntandDouble(int x, double y){
    i=x;
    d=y;
  }

  public String toString(){
    return "(Sum:"+i+",Average:"+d+")";
  }
}

public class arr2dSumAvg{
  static IntandDouble SumandAvg(int a[]){
    int sum=0;
    for (int i=0;i<a.length;i++){
      sum+=a[i];
    }
    double avg= sum/a.length;

    IntandDouble id = new IntandDouble(sum,avg);
    return id;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of ele:");
    int n= sc.nextInt();
    int a[] = new int[n];
    for (int i=0;i<n ;i++ ) {
      System.out.println("Enter the "+i+" ele:");
      a[i]=sc.nextInt();
    }

    System.out.println(SumandAvg(a).toString());
  }
}
