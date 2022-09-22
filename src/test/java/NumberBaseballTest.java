import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberBaseballTest {

    @DisplayName("입력받은 숫자 문자열 분리하기")
    @Test
    public void splitStringTest(){
        String value = "789";
        String[] values = value.split("");
        assertThat(values.length).isEqualTo(3);
        assertThat(values).contains("7","8","9");
    }

    @DisplayName("분리된 문자열을 기존 숫자와 비교하며 ball Check")
    @Test
    public void ballCheckTest(){
        List<Integer> answer = new ArrayList<>();
        answer.add(6);
        answer.add(8);
        answer.add(7);
        String[] values = {"7","8","9"};
        Integer ball = 0;
        for(String value:values){
            if(answer.contains(Integer.parseInt(value))){
                ball++;
            }
        }
        assertThat(ball).isEqualTo(1);
    }

    @DisplayName("ball strike 출력")
    @Test
    public void printResultTest(){
        int ball = 0;
        int strike = 0;
        if(ball==0&&strike==0){
            System.out.println("낫싱");
        }
        if(ball!=0){
            System.out.print(ball+"볼 ");
        }
        if(strike!=0){
            System.out.print(strike+"스트라이크");
        }
    }


}