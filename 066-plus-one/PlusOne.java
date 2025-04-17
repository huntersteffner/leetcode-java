public class PlusOne {

    public static void main(String[] args) {
        int[] exampleOne = {1,2,9};
        int[] exampleTwo = {4,3,2,1};
        int[] exampleThree = {9};
        int[] exampleFour = {9,9,9,9,9};

        plusOne(exampleOne);
        plusOne(exampleTwo);
        plusOne(exampleThree);
        plusOne(exampleFour);
    }

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
