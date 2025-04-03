import java.util.ArrayList;

public class Graph {
    private ArrayList<Integer> dataArray;

    //copy constructor [create obj by copying another obj]
    public Graph(Data data) {
        this.dataArray = data.scores;
    }

    public int[] stats() {
        int[] stats = new int[5];

        for (int score: dataArray) {
            if (score > 80){
                stats[4]++;
            } else if (score >= 61) {
                stats[3]++;
            } else if (score >= 41) {
                stats[2]++;
            } else if (score >= 21) {
                stats[1]++;
            } else {
                stats[0]++;
            }
        }
        return stats;
    }

}