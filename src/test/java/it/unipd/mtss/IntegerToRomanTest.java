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
}
