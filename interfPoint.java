interface Movable{
  public abstract void moveUp();
  public abstract void moveDown();
  public abstract void moveLeft();
  public abstract void moveRight();
}

class MovablePoint implements Movable{
  int x,y,xSpeed,ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
  }

  public void moveUp(){
    y-= ySpeed;
    System.out.println("Y:"+y);
  }

  public void moveDown(){
    y+= ySpeed;
    System.out.println("Y:"+y);
  }

  public void moveLeft(){
    x-= xSpeed;
    System.out.println("X:"+x);
  }

  public void moveRight(){
    x+= xSpeed;
    System.out.println("X:"+x);
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")"+",Speed" + "=(" + this.xSpeed +","+ this.ySpeed+ ")";
  }
}

public class interfPoint{
  public static void main(String[] args){
    MovablePoint m=new MovablePoint(1,2,3,4);
    m.moveUp();
    m.moveDown();
    m.moveLeft();
    m.moveRight();
    System.out.println(m.toString());

  }
}
