package it.unipd.mtss;

public class IntegerToRoman {
    // conversione usando sottrazioni e coincidenza tra numeri romani e arabi
    public static String convert(int number) {
        String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String roman_number = "";
        int i = 0;
        while (number > 0) {
            if (number - values[i] >= 0) {
                roman_number += romanNumerals[i];
                number -= values[i];
            } else {
                i++;
            }
        }
        return roman_number;
    }
}
