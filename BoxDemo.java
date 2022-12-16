class Box
{
  double w,h,d;
  void volume(){
    System.out.print("Volume is");
    System.out.print(w*h*d);
  }
}
public class BoxDemo
{
  public static void main(String[] args) {
    double v;
    Box b= new Box();
    b.w=21.23;
    b.h=44.2;
    b.d=34.3;
    b.volume();
  }
}
