public class RomanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCVI"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IX"));
    }
    public static int romanToInt(String s) {

        int total = 0;

        int subtract = 0;

        char[] numerals = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            numerals[i] = s.charAt(i);

        }
        for (int i = 0; i < numerals.length; i++) {
            char current = numerals[i];
            char next;
            if (i < numerals.length - 1) {
                next = numerals[i + 1];
            } else {
                next = ',';
            }
            if (current == 'I') {
                if (next == 'V' || next == 'X') {
                    subtract = 1;
                } else {
                    total++;
                }
            } else if (current == 'V') {
                total += 5 - subtract;
                subtract = 0;
            } else if (current == 'X') {
                if (next == 'L' || next == 'C') {
                    subtract = 10;
                } else {
                    total += 10 - subtract;
                    subtract = 0;
                }
            } else if (current == 'L') {
                total += 50 - subtract;
                subtract = 0;
            } else if (current == 'C') {
                if (next == 'D' || next == 'M') {
                    subtract = 100;
                } else {
                    total += 100 - subtract;
                    subtract = 0;
                }
            } else if (current == 'D') {
                total += 500 - subtract;
                subtract = 0;
            } else if (current == 'M') {
                total += 1000 - subtract;
                subtract = 0;
            }
        }
        return total;
    }
}
