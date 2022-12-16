class Worker{
  String name;
  Worker (String n){
    name= n;
  }

  public void display(){
    System.out.println("Name:"+name);
  }
}

class DailyWorker extends Worker{
  int rate;
  DailyWorker(String name, int r){
    super(name);
    rate=r;
  }

  public void ComPay(int h){
    display();
    System.out.println("Pay:"+rate*h);
  }
}

class SalariedWorker extends Worker{
  int rate;
  SalariedWorker(String name, int r){
    super(name);
    rate=r;
  }

  int h=40;

  public void ComPay(){
    display();
    System.out.println("Pay:"+rate*h);
  }
}

public class arr2dWorker{
  public static void main(String[] args) {
    DailyWorker dw= new DailyWorker("abz",77);
    SalariedWorker sw= new SalariedWorker("xyc",80);
    dw.ComPay(12);
    sw.ComPay();
  }
}
