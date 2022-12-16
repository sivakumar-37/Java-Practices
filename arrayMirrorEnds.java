import java.util.Scanner;
class common{
  public String mirrorEnds(String s){
    int l = s.length();
    String fin = "";
    String temp1 = "";
    String temp2 = "";
    for (int i = 0; i < l; i++) {
      temp1 += s.substring(i,i+1);
      temp2 = "";
      for (int j = temp1.length()-1; j >= 0; j--) {
          temp2 += temp1.substring(j,j+1);
          if (temp2.equals(s.substring(l-i-1,l)))
              fin = temp1;
        }
    }
    return fin;
  }
}

public class arrayMirrorEnds{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String n1 = sc.next();

    common c= new common();
    System.out.println(c.mirrorEnds(n1));
  }
}
