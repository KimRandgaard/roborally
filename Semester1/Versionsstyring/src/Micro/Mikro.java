package Micro;

    public class Mikro {
        private static Terning d1 = new Terning();
        private static Terning d2 = new Terning();
        private static int accum = 0;
        private int getAccum(){
            return accum;
        }
        private int getFaceValue1()
        {
            return d1.getFaceValue();
        }
        private int getFaceValue2()
        {
            return d2.getFaceValue();
        }


        private static void roll(){
            d1.roll();
            d2.roll();
            accum += d1.getFaceValue() + d2.getFaceValue();
        }

        public static void main(String[] args) {
            roll();
            System.out.println("samlede sum " + accum);
        }

}
