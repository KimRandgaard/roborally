package Figurer;

public class circle {
    private float radius;

    public circle(float r) {
       radius = r;
    }

    public void setradius(float newval) {
        radius = newval;

    }

    public float areal(){
        return (float)(Math.PI*Math.pow(radius,2));

    }


    public String toString() {
        return "radius: " + radius;
    }




}
