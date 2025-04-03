import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    
    private ArrayList<Integer> dataArray;

    //copy constructor [create obj by copying another obj]
    public Statistics(Data data) {
        this.dataArray = data.scores;
    }

    public void printData() {    
        System.out.println("Scores: " + dataArray);
    }

    public int maxGrade() {
        int maxGradeNum = Collections.max(dataArray);
        return maxGradeNum;
    }

    public int minGrade() {
        int minGradeNum = Collections.min(dataArray);
        return minGradeNum;
    }

    public double computeAvg() {
        float sum = 0f;
        for (double num: dataArray) {
            sum += num;
        }
        float avgNum = sum / dataArray.size();
        DecimalFormat df = new DecimalFormat("#.000000");
        return Float.parseFloat(df.format(avgNum));
    }
}