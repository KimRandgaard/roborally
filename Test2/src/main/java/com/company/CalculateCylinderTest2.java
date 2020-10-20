package main.java.com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateCylinderTest2 {

    @Test
    public void getVolume() {
        CalculateCylinder calculator = new CalculateCylinder(); // make instance of CalculateCylinder
        double radius = 0.5;
        double height = 4.0;
        double volume = calculator.getVolume(radius, height);   // call method getVolume in class CalculateCylinder
        assertEquals(3.1415927, volume, 0.0000001);
    }
}