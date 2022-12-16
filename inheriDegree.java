class Degree{
    public void getDegree(){
      System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
  public void getDegree(){
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree{
  public void getDegree(){
    System.out.println("I am an Postgraduate");
  }
}

public class inheriDegree{
  public static void main(String[] args) {
    Degree d1 = new Degree();
    Undergraduate d2 = new Undergraduate();
    Postgraduate d3 = new Postgraduate();

    d1.getDegree();
    d2.getDegree();
    d3.getDegree();

  }
}
