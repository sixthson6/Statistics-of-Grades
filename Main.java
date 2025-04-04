import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Statistics statistics = new Statistics(data);

        data.collectData();
        // statistics.printData();

        int maxGradeNum = statistics.maxGrade();
        int minGradeNum = statistics.minGrade();
        double avgNum = statistics.computeAvg();
        // Graph graph = new Graph();
        // int[] stats = graph.stats();
        System.out.println("The maximum grade is " + maxGradeNum);
        System.out.println("The minimum grade is " + minGradeNum);   
        System.out.println("The average grade is " + avgNum);

        // System.out.println("");
        // System.out.println(Arrays.toString(stats));
        // statistics.minGrade();
    }
}