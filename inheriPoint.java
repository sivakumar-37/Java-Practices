class Point{
  float x,y;
  public Point(){
    this.x=0.0f;
    this.y=0.0f;
  }

  public Point(float x, float y){
    this.x=x;
    this.y=y;
  }

  public float getX(){
    return this.x;
  }

  public void setX(float x){
    this.x=x;
  }

  public float getY() {
    return this.y;
  }
  public void setY(float y) {
    this.y = y;
  }

  public void setXY(float x, float y){
    this.x=x;
    this.y=y;
  }

  public float[] getXY(){
    float[] result = new float[2];
    result[0]=x;
    result[1]=y;
    return result;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }
}

class MovablePoint extends Point{
  float xSpeed,ySpeed;
  public MovablePoint(){
    super();
    this.xSpeed=0.0f;
    this.ySpeed=0.0f;
  }

  public MovablePoint(float x, float y, float xSpeed, float ySpeed){
    super(x,y);
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
  }

  public float getXSpeed(){
    return this.xSpeed;
  }
  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getYSpeed() {
    return this.ySpeed;
   }
  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
   }

  public void setSpeed(float xSpeed, float ySpeed){
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
  }

  public float[] getSpeed(){
    float[] result = new float[2];
    result[0]=xSpeed;
    result[1]=ySpeed;
    return result;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")"+",Speed" + "=(" + this.xSpeed +","+ this.ySpeed+ ")";
  }

  public MovablePoint move(){
    MovablePoint m= new MovablePoint(x,y,xSpeed, ySpeed);
    m.x=m.x + m.xSpeed;
    m.y= m.y + m.ySpeed;
    return m;
  }
}

public class inheriPoint{
  public static void main(String[] args){
    MovablePoint m=new MovablePoint(1.1f,2.2f,3.3f,4.4f);
    System.out.println(m.toString());
    System.out.println(m.move());
  }
}
