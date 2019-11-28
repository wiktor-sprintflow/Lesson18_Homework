import euler2.Euler2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler2Test {
    private int number;
    private int number2;
    private Euler2 systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new Euler2();
    }


    @Test
    void whenEightyNine_thenReturnFortyFour() {
        //Given
        number = 89;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(44, result); //JUnit 5
        assertThat(result,is(equalTo(44))); //Hamcrest
        assertThat(result).isEqualTo(44); //AssertJ
    }

    @Test
    void whenFiveHundred_thenThreeHundredSeventySix() {
        //Given
        number = 500;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(188, result); //JUnit 5
        assertThat(result,is(equalTo(188))); //Hamcrest
        assertThat(result).isEqualTo(188); //AssertJ
    }

    @Test
    void whenEightMillions_thenSameAsFourMillions() {
        //Given
        number = 4000000;
        number2 = 8000000;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        int result2 = systemUnderTest.sumFibonacciEvenNumbers(number2);
        //Then
        assertEquals(result2, result); //JUnit 5
        assertThat(result,is(equalTo(result2))); //Hamcrest
        assertThat(result).isEqualTo(result2); //AssertJ
    }

    @Test
    void whenMinusOne_thenZero() {
        //Given
        number = -1;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenZero_thenZero() {
        //Given
        number = -1;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenOne_thenZero() {
        //Given
        number = -1;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }
    @Test
    void whenTwo_thenTwo() {
        //Given
        number = -1;
        //When
        int result = systemUnderTest.sumFibonacciEvenNumbers(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }
}

