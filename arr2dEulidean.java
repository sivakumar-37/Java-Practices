import java.util.Scanner;
public class arr2dEulidean{
  public static void main(String[] args){
    arr2dEulidean euc = new arr2dEulidean();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of vectors");
    int n = sc.nextInt();
    double[] a = new double[n];
    double[] b = new double[n];
    System.out.println("Enter values of vector a");

    for (int i = 0;i<a.length;i++){
      a[i] = sc.nextDouble();
    }
    System.out.println("Enter values of vector b");
    for (int i = 0;i<b.length;i++){
      b[i] = sc.nextDouble();
    }

    double diff_square_sum = 0.0;

    for (int i = 0;i<a.length;i++){
      diff_square_sum += (a[i] - b[i]) * (a[i] - b[i]);
    }

    System.out.println("Euclidean distance:");
    System.out.println(Math.sqrt(diff_square_sum));
  }
}
