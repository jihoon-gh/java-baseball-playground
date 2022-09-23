package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @DisplayName("문자열 숫자 변환 테스트")
    @Test
    public void changeStringToIntegerTest() {
        String[] values = {"1", "2", "4"};
        Player player = new Player();
        player.changeStringToInteger(values);
        Assertions.assertThat(player.getNums()).contains(1);
        Assertions.assertThat(player.getNums()).contains(2);
        Assertions.assertThat(player.getNums()).contains(3);
    }

}
