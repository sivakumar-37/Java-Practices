import java.util.Scanner;
class RadiusExcep extends Exception{
  RadiusExcep(String msg){
    super(msg);
  }
}

public class ExcArea{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
    int r=sc.nextInt();

    try{
      if(r<0){
        RadiusExcep re = new RadiusExcep("Invaild radius");
        throw re;
      }
      else{
        System.out.println("radius vaild");
        System.out.println("Area:"+3.14*r*r);
      }
    }

    catch(RadiusExcep e){
      System.out.println(e.getMessage());
    }
  }
}
