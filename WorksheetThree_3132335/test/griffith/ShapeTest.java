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
 


}
