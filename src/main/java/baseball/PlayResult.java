package baseball;

public class PlayResult {
    public int STRIKE;
    public int BALL;

    public int getStrike() {
        return this.STRIKE;
    }

    public int getBall() {
        return this.BALL;
    }

    public PlayResult setResult(BallStatus status) {
        if(status == BallStatus.STRIKE) {
            this.STRIKE++;
        }

        if(status == BallStatus.BALL) {
            this.BALL++;
        }
        return this;
    }
}
