/*
 * Calculation of cylinder volume
 * Author: Agner Fog
 * Version: 1.00
 * Date: 2016-09-14
 */

public class CalculateCylinder {
	// method to calculate volume of cylinder
	public double getVolume(double radius, double height) {
		double volume = Math.PI * radius * radius * height;
		return volume;
	}
}
