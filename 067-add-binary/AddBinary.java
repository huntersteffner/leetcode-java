public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {

        String newBinary = "";


        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {

            String newLetter = "";

            int aCurrent = 0;
            int bCurrent = 0;

            if (i >= 0) {
                aCurrent = a.charAt(i) - '0';
            }

            if (j >= 0) {
                bCurrent = b.charAt(j) - '0';
            }

            int combined = carry;
            if (aCurrent > 0 || bCurrent > 0) {                
                combined = aCurrent + bCurrent + carry;
            }
            carry = 0;

            if (combined > 2) {
                newLetter = "1";
                carry++;
            } else if (combined == 2) {
                newLetter = "0";
                carry++;
            } else if (combined == 1) {
                newLetter = "1";
            } else {
                newLetter = "0";
            }

            newBinary = newLetter += newBinary;

            i --;
            j --;

        }

        if (carry > 0) {
            String lastLetter = "1";
            newBinary = lastLetter += newBinary;
        }


        return newBinary;
    }
}

//  11
//   1
// 100


//  1010
//  1011
// 10101

//   1111
//   1111
//  11110