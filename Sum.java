
import java.util.*;

public class Sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
