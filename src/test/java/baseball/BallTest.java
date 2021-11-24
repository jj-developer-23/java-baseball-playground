package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 2);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(2, 4))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 2))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(2, 2))).isEqualTo(BallStatus.BALL);
    }

}
