package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {
    @Test
    public void testConvertZero() {
        // Arrange
        int numeroArabo = 0;
        String numeroRomanoAtteso = "";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert1() {
        // Arrange
        int numeroArabo = 1;
        String numeroRomanoAtteso = "I";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert2() {
        // Arrange
        int numeroArabo = 2;
        String numeroRomanoAtteso = "II";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert3() {
        // Arrange
        int numeroArabo = 3;
        String numeroRomanoAtteso = "III";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert5() {
        // Arrange
        int numeroArabo = 5;
        String numeroRomanoAtteso = "V";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert10() {
        // Arrange
        int numeroArabo = 10;
        String numeroRomanoAtteso = "X";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert50() {
        // Arrange
        int numeroArabo = 50;
        String numeroRomanoAtteso = "L";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }

    @Test
    public void testConvert100() {
        // Arrange
        int numeroArabo = 100;
        String numeroRomanoAtteso = "C";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }
    @Test
    public void testConvert500() {
        // Arrange
        int numeroArabo = 500;
        String numeroRomanoAtteso = "D";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }
    @Test
    public void testConvert1000() {
        // Arrange
        int numeroArabo = 1000;
        String numeroRomanoAtteso = "M";

        // Act
        String numeroRomanoAttuale = IntegerToRoman.convert(numeroArabo);

        // Assert
        assertEquals(numeroRomanoAtteso, numeroRomanoAttuale);
    }
}
