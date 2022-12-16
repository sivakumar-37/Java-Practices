import java.util.*;

class Complex{
  int real, imag;
  public Complex(int r,int i){
    this.real = r;
    this.imag = i;
  }
}

public class ComplexLinked{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Complex> list = new LinkedList<Complex>();

    for (int i=0;i<5 ;i++ ) {
      System.out.println("enter the real:"+i);
      int real = sc.nextInt();
      System.out.println("enter the imag:"+i);
      int imag = sc.nextInt();
      Complex com = new Complex(real,imag);
      list.add(com);
    }

    System.out.println("List:");
    for(Complex c:list){
      System.out.println(c.real+" +i "+c.imag);
    }
  }
}
