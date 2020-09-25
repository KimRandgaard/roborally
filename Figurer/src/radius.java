import Figurer.circle;

public class radius {
    public static void main(String[] args) {

        circle c1 = new circle(2.0f);

        System.out.println(c1);

        c1.setradius(5.0f);

        System.out.println(c1);

        System.out.println("areal er " + c1.areal());

    }

}
