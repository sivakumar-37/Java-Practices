abstract class Shape{
  protected String color;
  protected Boolean filled;
  public Shape(){
    this.color="Red";
    this.filled=true;
  }
  public Shape(String color,Boolean filled){
      this.color=color;
      this.filled= filled;
  }

  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color=color;
  }

  public boolean isFilled(){
    return this.filled;
  }

  public void setFilled(boolean filled){
    this.filled=filled;
  }

  protected abstract double getArea();
  protected abstract double getPerimeter();

  public String toString() {
     return "Shape"+"["+this.color+","+this.filled+"]";
  }
}

class Circle extends Shape{
  protected double radius;
  public Circle(){
    super();
    this.radius= 1.0;
  }

  public Circle(double radius){
    this.radius= radius;
  }

  public Circle(String color , boolean filled,double radius){
    super(color,filled);
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea(){
    double total= radius*radius*Math.PI;
    return total;
  }

  public double getPerimeter() {
    double total= 2 * radius * Math.PI;
    return total;
  }

  public String toString() {
    return "Circle[Shape[color=" + color + ",filled=" + filled + "],radius="+ radius+ "]";
  }
}

class Rectangle extends Shape{
  protected double width,length;

  public Rectangle(){
    super();
    this.width=1.0;
    this.length=1.0;
  }

  public Rectangle(double width, double length){
    this.width=width;
    this.length= length;
  }

  public Rectangle(String color, boolean filled,double width, double length){
    super(color, filled);
    this.width=width;
    this.length= length;
  }

  public double getWidth(){
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength(){
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
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
    return "Rectangle[Shape[color=" + color + ",filled=" + filled + "],length="+ length+",width="+width+"]";
  }

}

class Square extends Rectangle{
  double side;

  public Square(double side){
    super();
    this.side=side;
  }

  public Square(String color, boolean filled,double side){
    setColor(color);
    setFilled(filled);
    this.side=side;
  }

  public double getSide(){
    return this.side;
  }

  public void setSide(double side){
    this.side=side;
  }

  public void setWidth(double side){
    this.side=side;
  }

  public void setLength(double side){
    this.side=side;
  }

  public String toString() {
    return "Square[Rectangle[Shape[color=" + color + ",filled=" + filled + "],length="+ this.length+",width="+this.width+"]]";
  }
}

public class abstShape{
  public static void main(String[] args) {
    Circle o1= new Circle("red",false,7.7);
    System.out.println(o1);
    System.out.println("Area:"+o1.getArea());
    System.out.println("Perimeter:"+o1.getPerimeter());
    System.out.println(o1.getColor());
    System.out.println(o1.isFilled());
    System.out.println(o1.getRadius());

    Rectangle o2 = new Rectangle( "blue", false,1.0, 2.0);
    System.out.println(o2);
    System.out.println("Area:"+o2.getArea());
    System.out.println("Perimeter:"+o2.getPerimeter());
    System.out.println(o2.getColor());
    System.out.println(o2.getLength());

    Square o3 = new Square(6.6);
    System.out.println(o3);
    System.out.println(o3.getColor());
    System.out.println(o3.getSide());

  }
}
