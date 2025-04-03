import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    ArrayList<Integer> scores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> collectData() {
        System.out.println("Enter number of scores(N): ");
        int n = scanner.nextInt();

        System.out.println("Enter Grades: ");
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }

        System.out.println("");
        scanner.close();
        return scores;
    }
}
