import java.util.Scanner;
public class Complex{
  double real,imag;
  Complex(){
    real=3.5;
    imag=5.7;
  }
  Complex(double real, double imag){
    this.real=real;
    this.imag=imag;
  }
  void display(){
    System.out.println(this.real);
    System.out.println(this.imag);
  }
  static void addALL(Complex c1[]){
    double sumr=0;
    double sumi=0;
    for (int j=0;j<c1.length;j++){
      sumr+=c1[j].real;
      sumi+=c1[j].imag;
    }

    System.out.println("Sum:"+sumr+"+ i"+sumi);
  }

  static boolean compare(Complex c1,Complex c2){
    if (c1.real>c2.real && c1.imag>c2.imag)
      return true;
    else
      return false;
  }
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);

    Complex c[]=new Complex[3];
    for(int j=0;j<3;j++){
      System.out.println("enter real:");
      double r=s.nextDouble();
      System.out.println("enter imag:");
      double i=s.nextDouble();
      c[j]=new Complex(r,i);
    }

    addALL(c);
    System.out,println(compare(c[0],c[1]));
  }
}
