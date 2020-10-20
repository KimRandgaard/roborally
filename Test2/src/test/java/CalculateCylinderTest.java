package test.java;

import main.java.com.company.CalculateCylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateCylinderTest {

    @Test
    void getVolumeTest() {
        CalculateCylinder calculator = new CalculateCylinder(); // make instance of CalculateCylinder
        double radius = 0.5;
        double height = 4.0;
        double volume = calculator.getVolume(radius, height);   // call method getVolume in class CalculateCylinder
        assertEquals(3.1415927, volume, 0.0000001);             // test that the result is accurate to 7 decimals
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
    }
}