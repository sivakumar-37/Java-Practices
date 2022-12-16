interface GeometricObject{
  abstract double getArea();
  abstract double getPerimeter();
}

class Circle implements GeometricObject{
  protected double radius;

  protected Circle(double radius){
    this.radius=radius;
  }

  public String toString() {
     return "Circle"+"[radius="+this.radius+"]";
  }

  public double getArea(){
    double total= radius*radius*Math.PI;
    return total;
  }

  public double getPerimeter() {
    double total= 2 * radius * Math.PI;
    return total;
  }
}

interface Resizable{
  public void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable{
  public ResizableCircle(double radius){
    super(radius);
  }

  public void resize(int percent){
    radius*= percent/100.0;
    System.out.println("Resized radius:"+radius);
  }

  public String toString() {
     return "ResizableCircle[Circle[radius="+this.radius+"]";
  }
}

public class interfTestResizableCircle{
  public static void main(String[] args) {
    double r = 5.2;
    Circle o1 = new Circle(r);
    System.out.println(o1);

    ResizableCircle o2 = new ResizableCircle(r);
    System.out.println(o2);
    o2.resize(15);
  }
}
