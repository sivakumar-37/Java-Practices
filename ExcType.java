public class ExcType{
  public static void main(String[] args) {

    try{
      int a=10;
      int b=0;
      int c=a/b;
      System.out.println("result:"+c);
    }
    catch (ArithmeticException e){
      System.out.println(e);
    }

    try{
      int a[] = new int[10];
      a[13]=33;
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }

    try{
      int num=Integer.parseInt ("abc") ;
	    System.out.println(num);
    }
    catch (NumberFormatException e){
      System.out.println(e);
    }

  }
}
