class grandFather{
  public void land(){
    System.out.println("grandpa land");
  }
}
class father extends grandFather{
  public void home(){
    System.out.println("dad home");
  }

  public void car(){
    System.out.println("dad car");
  }
}
class son extends father{
  public void mobile(){
    System.out.println("son mobile");
  }
}
class daughter extends father{
  public void purse(){
    System.out.println("daughter purse");
  }
}

public class inheriFamily{
  public static void main(String[] args) {
    son o1 = new son();
    o1.land();
    o1.home();
    o1.mobile();

    daughter o2 = new daughter();
    o2.land();
    o2.home();
    o2.purse();

  }
}
