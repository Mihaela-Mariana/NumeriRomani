package it.unipd.mtss;

public class RomanPrinter {
    private static String[] I = { "  _ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|" };
    private static String[] V = { " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    " };
    private static String[] X = { " __    __",
            " \\ \\  / /",
            "  \\ \\/ / ",
            "   >  <  ",
            "  / /\\ \\ ",
            " /_/  \\_\\" };
    private static String[] L = { "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|" };
    private static String[] C = { "   _ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|" };
    private static String[] D = { "  _  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |______/" };
    private static String[] M = { "     ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|" };

    public static String print(int num) {
        // chiamata ricorsiva
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber) {
        String stampa = "";
        if (romanNumber.length() == 0)
            return stampa;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                switch (c) {
                    case 'I':
                        stampa += I[i];
                        break;
                    case 'V':
                        stampa += V[i];
                        break;
                    case 'X':
                        stampa += X[i];
                        break;
                    case 'L':
                        stampa += L[i];
                        break;
                    case 'C':
                        stampa += C[i];
                        break;
                    case 'D':
                        stampa += D[i];
                        break;
                    case 'M':
                        stampa += M[i];
                        break;
                }
            }
            stampa += "\n";
        }
        return stampa;
    }
}
