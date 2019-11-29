import euler6.Euler6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class Euler6Test {
    private int number;
    private Euler6 systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new Euler6();
    }


    @Test
    void whenTen_thenReturn2640() {
        //Given
        number = 10;
        //When
        int result = systemUnderTest.difference(number);
        //Then
        assertEquals(2640, result); //JUnit 5
        assertThat(result,is(equalTo(2640))); //Hamcrest
        assertThat(result).isEqualTo(2640); //AssertJ
    }

    @Test
    void whenMinusOne_thenReturnZero() {
        //Given
        number = -1;
        //When
        int result = systemUnderTest.difference(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenZero_thenReturnZero() {
        //Given
        number = 0;
        //When
        int result = systemUnderTest.difference(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenOne_thenReturnZero() {
        //Given
        number = 1;
        //When
        int result = systemUnderTest.difference(number);
        //Then
        assertEquals(0, result); //JUnit 5
        assertThat(result,is(equalTo(0))); //Hamcrest
        assertThat(result).isEqualTo(0); //AssertJ
    }

    @Test
    void whenTwo_thenReturnFour() {
        //Given
        number = 2;
        //When
        int result = systemUnderTest.difference(number);
        //Then
        assertEquals(4, result); //JUnit 5
        assertThat(result,is(equalTo(4))); //Hamcrest
        assertThat(result).isEqualTo(4); //AssertJ
    }

}

