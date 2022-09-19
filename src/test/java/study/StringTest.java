package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest1(){
        String temp = "1,2";
        String[] split = temp.split(",");
        assertThat(split).contains("1","2");
    }

    @Test
    void splitTest2(){
        String temp = "1";
        String[] split = temp.split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    void substrTest(){
        String temp = "(1,2)";
        String res = temp.substring(1,4);
        assertThat(res).isEqualTo("1,2");
    }

    @DisplayName("OutOfBounds테스트")
    @Test
    void charAtTest(){
        String temp = "abc";
        assertThatThrownBy(()->{
            temp.charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessage("String index out of range: 4");
    }


}
