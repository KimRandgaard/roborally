package Lektion7;

public class Max {
    public static void main(String[] args) {

        int[] tal = {3, 6, 4, 7, 6, 2};

//        int max = tal[0];
//
//        for (int i = 0; i < tal.length; i++){
//            if (tal[i] > max)
//                max = tal[i];
//        }

        for (int val : tal) {
            System.out.println(val + ", ");

        }


        System.out.println("Max = " + max(tal));
    }


    private static int max(int[] tArr) {
        int max = tArr[0];

        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] > max)
                max = tArr[i];
        }
        tArr[0] = 10;
        return max;


    }

}