package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Balls {
    private static final int MAX_BALL_NO = 3;
    private List<Ball> balls;

    public Balls(List<Integer> balls) {
        this.balls = makeBalls(balls);
    }

    private List<Ball> makeBalls(List<Integer> balls) {
        List<Ball> baseball = new ArrayList<>();
        for(int i = 0; i < MAX_BALL_NO; i++) {
            baseball.add(new Ball(i + 1, balls.get(i)));
        }
        return baseball;
    }

    public BallStatus compare(Ball playerBall) {
        return balls.stream()
                .map(ball -> ball.compare(playerBall))
                .filter(status -> BallStatus.NOTHING != status)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult playGame(List<Integer> player) {
        PlayResult result = new PlayResult();
        List<Ball> playerBall = makeBalls(player);

        for(Ball ball : playerBall) {
           BallStatus status = this.compare(ball);
           result.setResult(status);
       }
        return result;
    }



}
