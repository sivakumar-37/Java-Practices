class Storage {
	int[] num = new int[100];
	public void setNum(int num){
		this.num.add(num);
	}
	public Object GetNum(int pos){
		return num.get(pos);
	}

}


class Counter extends Thread{
	Storage s;
	public Counter(String str, Storage s){
		//the name of the new thread
		super(str);
		this.s = s;
	}
	public void run(){
		for (int i = 0; i < 100; i++){
			System.out.println((i));
			try {
				s.setNum(i);
				Thread.sleep(0);
			}
      catch (Exception e) {
				e.printStackTrace();
			}
	  }
	}
}

class Printer extends Thread{
	Storage s;

	public Printer(String str, Storage s){
		//the name of the new thread
		super(str);
		this.s = s;
	}

  public void run() {
		for(int i = 0; i < s.num.size(); i++){
			System.out.println("Printer output:"+s.GetNum(i));
			try {
				Thread.sleep(0);
			}
      catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadStoCouPri{
  public static void main(String[] args) {
    Storage s = new Storage();
    Printer printer = new Printer("printer",s);
    Counter counter = new Counter("counter",s);
    counter.start();
    printer.start();
  }
}
