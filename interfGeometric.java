interface GeometricObject{
  abstract double getArea();
  abstract double getPerimeter();
}

class Circle implements GeometricObject{
  private double radius;

  public Circle(double radius){
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
class Rectangle implements GeometricObject{
  private double width, length;

  public Rectangle(double width, double length){
    this.width=width;
    this.length= length;
  }

  public double getArea() {
    double total= length*width;
    return total;
  }

  public double getPerimeter() {
    double total= 2 *(length+width);
    return total;
  }

  public String toString() {
    return "Rectangle[width=" +width+","+"length="+length+"]";
  }
}

public class interfGeometric{
  public static void main(String[] args){
    Circle o1= new Circle(5.5);
    System.out.println(o1);
    System.out.println("Area:"+o1.getArea());
    System.out.println("Perimater:"+o1.getPerimeter());

    Rectangle o2 = new Rectangle( 3.0, 7.0);
    System.out.println(o2);
    System.out.println("Area:"+o2.getArea());
    System.out.println("Perimeter:"+o2.getPerimeter());
  }
}
