import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1; 
            System.out.print(odd);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
        sc.close();
    }
}
