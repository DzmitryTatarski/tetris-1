package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Block's shape testing: number of rows and cols, dots locations.
 * @see LBlock
 * @author Dzmitry_Tatarski
 * @version 1.0
 */
@Test(groups = { "blockShapes" })
public class LBlockTest {

    LBlock lBlock = new LBlock();

    public void rows_ShouldReturn2() {
        int expected = 3;
        int actual = lBlock.rows();
        assertEquals(actual, expected,
                String.format("Number of rows is incorrect. Expected: " + expected + "actual:" + actual));
    }

    public void cols_shouldReturn3() {
        int expected = 2;
        int actual = lBlock.cols();
        assertEquals(actual, expected,
                String.format("Number of cols is incorrect. Expected: " + expected + "actual:" + actual));
    }

    @Test(dataProvider = "dotsLocations")
    public void dotAtShouldReturnCorrectValue(int row, int col, int expected, String message) {
        int actual = lBlock.dotAt(row, col);
        assertEquals(actual, expected, message);
    }

    @DataProvider
    public static Object[][] dotsLocations() {
        return new Object[][]{
                {0, 0, 1, "Incorrect dotAt(0, 0)"},
                {0, 1, 0, "Incorrect dotAt(0, 1)"},
                {1, 0, 1, "Incorrect dotAt(1, 0)"},
                {1, 1, 0, "Incorrect dotAt(1, 1)"},
                {2, 0, 1, "Incorrect dotAt(2, 0)"},
                {2, 1, 1, "Incorrect dotAt(2, 1)"},
        };
    }
}
