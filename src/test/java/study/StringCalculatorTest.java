package study;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @DisplayName("공백을 기준으로 한 문자열 split test")
    @Test
    public void splitTest(){
        String test = "1 + 2 + 3 + 4";
        String[] s = test.split(" ");
        assertThat(s.length).isEqualTo(7);
        assertThat(s).contains("1","2","3","4","+");
    }

//    @DisplayName("splited string calulation test")
//    @Test
//    public void calculateTest(){
//        String test = "1 + 2 + 3 + 4";
//        String[] s = test.split(" ");
//        Integer ans = Integer.parseInt(s[0]);
//        int i=1;
//        while(i<s.length){
//            if(s[i]=="+") ans+=Integer.parseInt(s[++i]);
//
//        }
//    }
    @DisplayName("더하기 테스트")
    @Test
    public void addTest(){
        Integer a = 0;
        String s = "3";
        a+=Integer.parseInt(s);
        assertThat(a).isEqualTo(3);
    }
    
    @DisplayName("빼기 테스트")
    @Test
    public void subTest(){
        Integer a = 0;
        String s = "3";
        a-=Integer.parseInt(s);
        assertThat(a).isEqualTo(-3);
    }

    @DisplayName("곱하기 테스트")
    @Test
    public void mulTest() {
        Integer a = 1;
        String s = "3";
        a*=Integer.parseInt(s);
        assertThat(a).isEqualTo(3);
    }

    @DisplayName("나누기 테스트")
    @Test
    public void divTest(){
        Integer a = 4;
        String s = "2";
        a/=Integer.parseInt(s);
        assertThat(a).isEqualTo(2);

    }



}
