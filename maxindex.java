import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();

        int max = 0;
        int index = 0;

        for (int i=0; i<9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = (i+1);
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}