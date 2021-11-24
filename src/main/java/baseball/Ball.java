package baseball;

import java.util.Objects;

public class Ball {
    int position;
    int ballNo;


    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNo == ball.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }

        if(matchBallNo(ball)) {
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(Ball ball) {
        return ball.ballNo == this.ballNo;
    }


}
