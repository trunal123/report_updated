package Reusablecomponent;

public class oddeven {
    public static void main(String[] args) {
        int[] test = new int[50];
        for (int i = 0; i < 50; i++) {
            display(test,i);
        }

    }

    private static void display(int []test , int i) {
        if (i % 2 == 0) {
            System.out.println("odd number " + i);

            test[i] = i;

        }
        {
            System.out.println("even number " + i);
            test[i] = 2 * i;
        }
    }
}
