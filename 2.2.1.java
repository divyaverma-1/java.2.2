import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done"))
                break;

            // Parsing string to int
            int num = Integer.parseInt(input);

            // Autoboxing: int → Integer
            numbers.add(num);
        }

        int sum = 0;

        // Enhanced for-loop (Unboxing: Integer → int)
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("The sum of entered integers = " + sum);
        sc.close();
    }
}
