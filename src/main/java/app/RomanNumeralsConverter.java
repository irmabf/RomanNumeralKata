package app;

public class RomanNumeralsConverter {
    public String convert(int decimal) {
        switch (decimal) {
            case 1: case 2: case 3:
                String roman = "";
                for (int i = 1; i <= decimal; i++) {
                    roman =roman.concat("I");
                }
                return roman;
            case 4:
                return "IV";
            case 5:
                return "V";
            default:
                return "";
        }
    }
}
