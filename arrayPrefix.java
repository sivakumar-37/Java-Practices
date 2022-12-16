import java.util.Scanner;
class common{
  public boolean prefixAgain(String a, int b){
    String r= a.substring(0,b);

    for(int i =b; i<a.length();i++){
      if(b+i <= a.length()){
        if(r.equals(a.substring(i,b+i)))
          return true;
      }
    }
    return false;
  }
}

public class arrayPrefix{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String n1 = sc.next();
    System.out.println("enter the number of prefix chars:");
    int n2 = sc.nextInt();

    common c= new common();
    System.out.println(c.prefixAgain(n1,n2));
  }
}
