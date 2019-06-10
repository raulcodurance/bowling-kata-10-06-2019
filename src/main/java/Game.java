public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {

        this.rolls[currentRoll++] = pins;
    }

    public int score() {
        int firstInFrame = 0;
        int score = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rolls[firstInFrame])) {

                score += 10 + nextRollsForStrike(firstInFrame);

                firstInFrame++;
            } else if (isSpare(firstInFrame)) {

                score += 10 + nextRollForSpare(firstInFrame);
                firstInFrame += 2;
            } else {

                score += nextTwoRolls(firstInFrame);
                firstInFrame += 2;
            }
        }
        return score;
    }

    private int nextTwoRolls(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private int nextRollForSpare(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private int nextRollsForStrike(int firstInFrame) {
        return rolls[firstInFrame + 1] + rolls[firstInFrame + 2];
    }

    private boolean isSpare(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1] == 10;
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }
}
