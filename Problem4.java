import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers with space separated: ");
        String[] input = sc.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : numbers) {
            for (int d = 1; d <= 9; d++) {
                if (num % d == 0) {
                    result.put(d, result.get(d) + 1);
                }
            }
        }

        System.out.print("{");
        int count = 0;
        for (int key : result.keySet()) {
            System.out.print(key + ": " + result.get(key));
            count++;
            if (count < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
