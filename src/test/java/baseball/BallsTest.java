package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    Balls com;

    @BeforeEach
    void setUp() {
        com = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void play_nothing() {
        Balls player = new Balls(Arrays.asList(4, 5, 6));
        PlayResult result = com.playGame(player);
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1strike_1ball() {
        Balls player = new Balls(Arrays.asList(1, 3, 5));
        PlayResult result = com.playGame(player);
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_3strike_0ball() {
        Balls player = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = com.playGame(player);
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_0strike_3ball() {
        Balls player = new Balls(Arrays.asList(3, 1, 2));
        PlayResult result = com.playGame(player);
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(3);
    }

    @Test
    void nothing() {
        assertThat(com.compare(new Ball(1, 8))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void strike() {
        assertThat(com.compare(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.compare(new Ball(1, 3))).isEqualTo(BallStatus.BALL);
    }
}
