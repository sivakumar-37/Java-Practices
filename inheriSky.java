class Sky{
  public void m1(){
    System.out.println("m1");
  }
}

class Planet extends Sky{
  public void m2(){
    System.out.println("m2");
  }
}

class Mercury extends Planet{
  public void m3(){
    System.out.println("m3");
  }
}


public class inheriSky{
  public static void main(String[] args) {
    Sky o1= new Sky();
    Sky o2= new Planet();
    Sky o3= new Mercury();

    o1.m1();
    o2.m2();
    o3.m3();

  }
}
