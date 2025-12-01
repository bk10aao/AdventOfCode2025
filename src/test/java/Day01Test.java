import AdventOfCode2025.Day01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01Test {


    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void givenInputOne_returns_dialAt_82_andCountOf_0() {
        assertEquals(0, Day01.partOne("L68"));
    }

    @Test
    public void givenInputTwo_returns_dialAt_52_andCountOf_0() {
        assertEquals(0, Day01.partOne("L68\nL30"));
    }

    @Test
    public void givenInputThree_returns_dialAt_0_andCountOf_1() {
        assertEquals(1, Day01.partOne("L68\nL30\nR48"));
    }

    @Test
    public void givenInputFour_returns_dialAt_95_andCountOf_1() {
        assertEquals(1, Day01.partOne("L68\nL30\nR48\nL5"));
    }

    @Test
    public void givenInputFive_returns_dialAt_55_andCountOf_1() {
        assertEquals(1, Day01.partOne("L68\nL30\nR48\nL5\nR60"));
    }

    @Test
    public void givenInputSix_returns_dialAt_0_andCountOf_2() {
        assertEquals(2, Day01.partOne("L68\nL30\nR48\nL5\nR60\nL55"));
    }

    @Test
    public void givenInputSeven_returns_dialAt_99_andCountOf_2() {
        assertEquals(2, Day01.partOne("L68\nL30\nR48\nL5\nR60\nL55\nL1"));
    }

    @Test
    public void givenInputEight_returns_dialAt_0_andCountOf_3() {
        assertEquals(3, Day01.partOne("L68\nL30\nR48\nL5\nR60\nL55\nL1\nL99"));
    }

    @Test
    public void givenInputNine_returns_dialAt_14_andCountOf_3() {
        assertEquals(3, Day01.partOne("L68\nL30\nR48\nL5\nR60\nL55\nL1\nL99\nR14"));
    }

    @Test
    public void givenInputTen_returns_dialAt_32_andCountOf_3() {
        assertEquals(3, Day01.partOne("L68\nL30\nR48\nL5\nR60\nL55\nL1\nL99\nR14\n32"));
    }

    @Test
    public void partTwo_returns_6() {
        assertEquals(6, Day01.partTwo("L68\n" +
                                                    "L30\n" +
                                                    "R48\n" +
                                                    "L5\n" +
                                                    "R60\n" +
                                                    "L55\n" +
                                                    "L1\n" +
                                                    "L99\n" +
                                                    "R14\n" +
                                                    "L82"));
    }

}