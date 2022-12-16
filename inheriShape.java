class Shape{
  String color;
  boolean filled;

  public Shape(){
    this.color="red";
    this.filled= true;
  }

  public Shape(String color, boolean filled){
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

  public String toString() {
     return "Shape"+"["+this.color+","+this.filled+"]";
  }
}

class Circle extends Shape{
  double radius;

  public Circle(){
    super();
    this.radius= 1.0;
  }

  public Circle(double radius){
    this.radius= radius;
    this.color= color;
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

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  public String toString() {
    return "Circle[Shape[color=" + color + ",filled=" + filled + "],radius="+ radius+ "]";
  }
}

class Rectangle extends Shape{
  double width,length;

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
    return length*width;
  }

  public double getPerimeter() {
    return 2 *(length+width);
  }
  public String toString() {
    return "Rectangle[Shape[color=" + color + ",filled=" + filled + "],length="+ length+",width"+width+"]";
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
    return "Square[Rectangle[Shape[color=" + color + ",filled=" + filled + "],length="+ length+",width"+width+"]]";
  }
}

public class inheriShape{
  public static void main(String[] args){
    Circle s1 = new Circle("red", false,5.5);
    System.out.println(s1);
    System.out.println(s1.getArea());
    System.out.println(s1.getPerimeter());
    System.out.println(s1.getColor());
    System.out.println(s1.isFilled());
    System.out.println(s1.getRadius());

    Rectangle s2 = new Rectangle( "red", false,1.0, 2.0);
    System.out.println(s2);
    System.out.println(s2.getArea());
    System.out.println(s2.getPerimeter());
    System.out.println(s2.getColor());
    System.out.println(s2.getLength());

    Square s3 = new Square(6.6);     // Upcast
    System.out.println(s3);
    System.out.println(s3.getArea());
    System.out.println(s3.getColor());
    System.out.println(s3.getSide());
  }
}
