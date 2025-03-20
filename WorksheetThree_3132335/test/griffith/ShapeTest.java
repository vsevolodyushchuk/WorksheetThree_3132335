package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


public class ShapeTest {
 
 private static final double EPSILON = 0.0;

 @Test
 public void testCircleWithComplexValues() {
     Circle circle = new Circle("Circle", 4.987);
     assertEquals(Math.PI * 4.987 * 4.987, circle.area(), EPSILON);
     assertEquals(2 * Math.PI * 4.987, circle.perimeter(), EPSILON);
     assertEquals("Shape: Circle, Radius: 4.987", circle.toString());
 }
 
 @Test
 public void testRhombus() {
     Rhombus rhombus = new Rhombus("Rhombus", 6.23, 8.75);
     assertEquals(6.23 * 8.75 / 2.0, rhombus.area(), EPSILON);
     assertEquals(4 * 6.23, rhombus.perimeter(), EPSILON);
     assertEquals("Shape: Rhombus, Side: 6.23, Height: 8.75", rhombus.toString());
 }
 
 @Test
 public void testRightAngledTriangle() {
     RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 5.5, 7.8);
     double hypotenuse = Math.sqrt(5.5 * 5.5 + 7.8 * 7.8);
     assertEquals((5.5 * 7.8) / 2.0, triangle.area(), EPSILON);
     assertEquals(5.5 + 7.8 + hypotenuse, triangle.perimeter(), EPSILON);
     assertEquals("Shape: Triangle, Base: 5.5, Height: 7.8", triangle.toString());
 }
 
 @Test
 public void integrationTestShapes() {
     ArrayList<Shape> shapes = new ArrayList<>();
     shapes.add(new Circle("Circle1", 3.5));
     shapes.add(new Circle("Circle2", 4.0));
     shapes.add(new Rhombus("Rhombus1", 4, 5));
     shapes.add(new Rhombus("Rhombus2", 6, 7));
     shapes.add(new RightAngledTriangle("Triangle1", 3, 4));
     shapes.add(new RightAngledTriangle("Triangle2", 5, 12));

     for (Shape shape : shapes) {
         double expectedArea, expectedPerimeter;

         if (shape instanceof Circle) {
             Circle circle = (Circle) shape;
             expectedArea = Math.PI * circle.getRadius() * circle.getRadius();
             expectedPerimeter = 2 * Math.PI * circle.getRadius();
         } else if (shape instanceof Rhombus) {
             Rhombus rhombus = (Rhombus) shape;
             expectedArea = rhombus.getSide() * rhombus.getHeight() / 2.0;
             expectedPerimeter = 4 * rhombus.getSide();
         } else if (shape instanceof RightAngledTriangle) {
             RightAngledTriangle triangle = (RightAngledTriangle) shape;
             double hypotenuse = Math.sqrt(triangle.getBase() * triangle.getBase() + triangle.getHeight() * triangle.getHeight());
             expectedArea = (triangle.getBase() * triangle.getHeight()) / 2.0;
             expectedPerimeter = triangle.getBase() + triangle.getHeight() + hypotenuse;
         } else {
             fail("Unknown shape type");
             return;
         }

         assertEquals(expectedArea, shape.area(), EPSILON, "Incorrect area for " + shape.toString());
         assertEquals(expectedPerimeter, shape.perimeter(), EPSILON, "Incorrect perimeter for " + shape.toString());
     }
 }


}
