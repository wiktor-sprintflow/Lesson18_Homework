import euler2.Euler2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler2Test {
    private Euler2 systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new Euler2();
    }

    @Test
    void whenEightyNine_thenReturnFortyFour() {

        //given
        int number = 89;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(44, result); //JUnit 5
        assertThat(result,is(equalTo(44))); //Hamcrest
        assertThat(result).isEqualTo(44); //AssertJ
    }

    @Test
    void whenFiveHundred_thenThreeHundredSeventySix() {

        //given
        int number = 500;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(188, result); //JUnit 5
        assertThat(result,is(equalTo(188))); //Hamcrest
        assertThat(result).isEqualTo(188); //AssertJ
    }

    @Test
    void whenFourMillions_thenFourMillionPlus() {

        //given
        int number = 4613732;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(4613732, result); //JUnit 5
        assertThat(result,is(equalTo(4613732))); //Hamcrest
        assertThat(result).isEqualTo(4613732); //AssertJ
    }

    @Test
    void whenEightMillions_thenAlsoFourMillionPlus() {

        //given
        int number = 8000000;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(4613732, result); //JUnit 5
        assertThat(result,is(equalTo(4613732))); //Hamcrest
        assertThat(result).isEqualTo(4613732); //AssertJ
    }

    @Test
    void whenMinusOne_thenZero() {

        //given
        int number = -1;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenZero_thenZero() {

        //given
        int number = 0;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenOne_thenZero() {

        //given
        int number = 1;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }
    @Test
    void whenTwo_thenTwo() {

        //given
        int number = 2;

        //when
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);

        //then
        assertEquals(2, result); //JUnit 5
        assertThat(result,is(equalTo(2))); //Hamcrest
        assertThat(result).isEqualTo(2); //AssertJ
    }
}