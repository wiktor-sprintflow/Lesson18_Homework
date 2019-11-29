import euler6.Euler6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler6Test {
    private Euler6 systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new Euler6();
    }

    @Test
    void whenTen_thenReturn2640() {

        //given
        int number = 10;

        //when
        int result = systemUnderTest.difference(number);

        //then
        assertEquals(2640, result); //JUnit 5
        assertThat(result,is(equalTo(2640))); //Hamcrest
        assertThat(result).isEqualTo(2640); //AssertJ
    }

    @Test
    void whenMinusOne_thenReturnZero() {

        //given
        int number = -1;

        //when
        int result = systemUnderTest.difference(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenZero_thenReturnZero() {

        //given
        int number = 0;

        //when
        int result = systemUnderTest.difference(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenOne_thenReturnZero() {

        //given
        int number = 1;

        //when
        int result = systemUnderTest.difference(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenTwo_thenReturnFour() {

        //given
        int number = 2;

        //when
        int result = systemUnderTest.difference(number);

        //then
        assertEquals(4, result); //JUnit 5
        assertThat(result,is(equalTo(4))); //Hamcrest
        assertThat(result).isEqualTo(4); //AssertJ
    }
}