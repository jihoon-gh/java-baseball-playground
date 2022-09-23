package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {


    @DisplayName("컴퓨터의 랜덤넘버 3개 고르기")
    @Test
    public void generateNumberTest(){
        Computer computer = new Computer();
        while(computer.getSizeOfList()<3){
            int a = (int)((Math.random()*10000)%10);
            computer.checkAndAddNumber(a);
        }
        assertThat(computer.getSizeOfList()).isEqualTo(3);
    }


    @DisplayName("볼 체크하기")
    @Test
    public void checkBallTest(){
        Computer computer = new Computer();
        computer.printNums();
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        int ball = computer.getBall(values);
        System.out.println("ball = " + ball);
    }

    @DisplayName("스트라이크 체크하기")
    @Test
    public void checkStrikeTest(){
        List<Integer> tests = new ArrayList<>();
        tests.add(4);
        tests.add(5);
        tests.add(6);
        Computer computer = new Computer(tests);
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        int strike = computer.getStrike(values);
        assertThat(strike).isEqualTo(3);
    }
}