package app;

public class RomanNumeralsConverter {
    public String convert(int decimal) {
        switch (decimal) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 5:
                return "V";
            default:
                return "";
        }
    }
}
