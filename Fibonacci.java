public class Fibonacci{
  public static void main(String[] args) {
    int n=0,m=1;

    for (int i = 1; i <= 100; ++i){
        System.out.print(n + " , ");
        int sum=n+m;
        n = m;
        m = sum;
    }
  }
}
