package griffith;

public class Rhombus extends Shape {
 private double side;
 private double height;

 public Rhombus(String name, double side, double height) {
     super(name);
     this.side = side;
     this.height = height;
 }

 public double getSide() {
     return side;
 }

 public void setSide(double side) {
     this.side = side;
 }

 public double getHeight() {
     return height;
 }

 public void setHeight(double height) {
     this.height = height;
 }

 @Override
 public double area() {
     return side * height / 2.0;
 }

 @Override
 public double perimeter() {
     return 4 * side;
 }

 @Override
 public String toString() {
     return super.toString() + ", Side: " + side + ", Height: " + height;
 }
}

