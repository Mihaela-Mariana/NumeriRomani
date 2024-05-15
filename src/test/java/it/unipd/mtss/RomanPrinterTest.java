package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {
    @Test
    public void testPrintZero() {
        // Arrange
        int number = 0;
        String expected = "";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint1() {
        // Arrange
        int number = 1;
        String expected = "  _ \n" +
                          " |_   _|\n" +
                          "   | |  \n" +
                          "   | |  \n" +
                          "  _| |_ \n" +
                          " |_____|\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint5() {
        // Arrange
        int number = 5;
        String expected = " __      __\n" +
                    " \\ \\    / /\n" +
                    "  \\ \\  / / \n" +
                    "   \\ \\/ /  \n" +
                    "    \\  /   \n" +
                    "     \\/    \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint10() {
        // Arrange
        int number = 10;
        String expected = " __    __\n" +
                    " \\ \\  / /\n" +
                    "  \\ \\/ / \n" +
                    "   >  <  \n" +
                    "  / /\\ \\ \n" +
                    " /_/  \\_\\\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint50() {
        // Arrange
        int number = 50;
        String expected = "  _      \n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |____ \n" +
                    " |______|\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint100() {
        // Arrange
        int number = 100;
        String expected = "   _ \n" +
                    "  / ____|\n" +
                    " | |     \n" +
                    " | |     \n" +
                    " | |____ \n" +
                    "  \\_____|\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint500() {
        // Arrange
        int number = 500;
        String expected = "  _  \n" +
                    " |  __ \\ \n" +
                    " | |  | |\n" +
                    " | |  | |\n" +
                    " | |__| |\n" +
                    " |______/\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrint1000() {
        // Arrange
        int number = 1000;
        String expected = "     \n" +
                    " |  \\/  |\n" +
                    " | \\  / |\n" +
                    " | |\\/| |\n" +
                    " | |  | |\n" +
                    " |_|  |_|\n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }
}
