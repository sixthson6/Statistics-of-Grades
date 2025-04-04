import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input grades
        System.out.println("Enter grades separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int N = input.length;
        int[] scores = new int[N];
        
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }
        
        // Calculate statistics
        int[] stats = calculateStats(scores);
        int max = findMax(scores);
        int min = findMin(scores);
        float average = computeAverage(scores);
        
        // Print values
        System.out.println("\nValues:\n");
        System.out.printf("The maximum grade is %d\n", max);
        System.out.printf("The minimum grade is %d\n", min);
        System.out.printf("The average grade is %.6f\n", average);
        
        // Print graph
        printGraph(stats);
        
        scanner.close();
    }
    
    public static int[] calculateStats(int[] scores) {
        int[] stats = new int[5];
        for (int score : scores) {
            if (score > 80) stats[4]++;
            else if (score >= 61) stats[3]++;
            else if (score >= 41) stats[2]++;
            else if (score >= 21) stats[1]++;
            else stats[0]++;
        }
        return stats;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    
    public static float computeAverage(int[] arr) {
        float sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    
    public static void printGraph(int[] stats) {
        System.out.println("\nGraph:\n");
        int maxCount = findMax(stats);
        
        for (int i = maxCount; i >= 1; i--) {
            System.out.printf("%2d  >", i);
            for (int j = 0; j < 5; j++) {
                if (stats[j] >= i) {
                    System.out.print("   #######");
                } else {
                    System.out.print("          ");
                }
            }
            System.out.println();
        }
        
        System.out.println("      +-----------+---------+---------+---------+---------+");
        System.out.println("      I   0-20    I  21-40  I  41-60  I  61-80  I 81-100  I");
    }
}

