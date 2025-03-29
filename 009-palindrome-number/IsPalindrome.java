public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {

        String xString = Integer.toString(x);

        String reversed = "";
        
        for (int i = xString.length() - 1; i >= 0; i--) {
            reversed += Character.toString(xString.charAt(i));
        }

        return xString.equals(reversed);
    }
}
