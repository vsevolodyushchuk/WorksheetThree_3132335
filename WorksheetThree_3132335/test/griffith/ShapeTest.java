package griffith;

import static org.junit.jupiter.api.Assertions.*;
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


}
