import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        int n;
        if(num % 2 == 0){
            n = num - 1;
        }else{
            n = num;
        }

        for(int i = 0; i < n; i++){
            int term = 2 * i + 1;
            System.out.print(term);

            if(i < n - 1){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
