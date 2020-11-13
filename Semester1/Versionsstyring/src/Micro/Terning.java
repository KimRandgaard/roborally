package Micro;

public class Terning {

    private static final int MAX = 6;
    private static int faceValue;
    private static int lastThrow = 0;


    public static void roll() {
        faceValue = (int) (Math.random() * MAX + 1);
    }
    public static int getFaceValue()
    {
        return faceValue;
    }
    private static void saveLastThrow(){
        lastThrow = getFaceValue();
    }
    public static void main(String[] args) {
        while(faceValue != 6){
            saveLastThrow();
            System.out.println("sidste kast " + lastThrow);
            roll();
            System.out.println("nuværende kast " +faceValue);
        }
    }
}
