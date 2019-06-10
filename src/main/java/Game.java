public class Game {
    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {

        this.rolls[currentRoll++] = pins;
    }

    public int score() {
        for(int i =0; i<21;i++){
            this.score +=rolls[i];
        }
        return score;
    }
}
