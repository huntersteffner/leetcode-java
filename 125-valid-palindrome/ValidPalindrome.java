public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {

        // First try but not very fast
        // String sNew = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // StringBuilder reverse = new StringBuilder(sNew).reverse();

        // String sNew = "";

        // char[] chars = s.toCharArray();

        // for(int i = 0; i < chars.length; i++) {
        //     if (Character.isLetterOrDigit(chars[i])) {
        //         sNew += chars[i];
        //     }
        // }



        String sNew = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = sNew.length() - 1;

        while (start < end) {
            if (sNew.charAt(start) != sNew.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }



        return true;
    }
}