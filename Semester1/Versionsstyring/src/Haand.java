public class Haand {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < 10; k++) {
            if (i < 5 && i < j)
                i++;
            else
                j++;
            System.out.println(j);
            System.out.println(i);
        }
    }
}

