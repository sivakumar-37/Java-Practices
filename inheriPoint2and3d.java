class Point2d{
  float x,y;
  public Point2d(){
    this.x=0.0f;
    this.y=0.0f;
  }

  public Point2d(float x, float y){
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

class Point3d extends Point2d{
  float z;

  public Point3d(){
    super();
    this.z=0.0f;
  }

  public Point3d(float x, float y, float z){
    super(x,y);
    this.z=z;
  }

  public float getZ() {
      return this.z;
   }
   public void setZ(int z) {
      this.z = z;
   }

   public void setXYZ(float x, float y,float z){
     super.setX(x);
     super.setY(y);
     this.z=z;
   }

   public float[] getXY(){
     float[] result = new float[3];
     result[0]=x;
     result[1]=y;
     result[3]=z;
     return result;
   }

   public String toString() {
     return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
   }
}

public class inheriPoint2and3d{
  public static void main(String[] args){
    Point2d p2 = new Point2d(1,2);
    System.out.println(p2);
    Point3d p3 = new Point3d(1,2,3);
    System.out.println(p3);
  }
}
