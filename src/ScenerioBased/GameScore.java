package ScenerioBased;
public class GameScore {
    public static void main(String[] args) {
        Integer[] scores = {203, 55, 270 , 310, null, 152};
        int notPlayed = 0;
        int total = 0;
        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total = total + score;
            }
        }
        System.out.println("Players not played = " + notPlayed);
        System.out.println("Total score is  = " + total);
    }
}