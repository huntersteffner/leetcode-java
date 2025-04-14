public class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }


    public static int lengthOfLastWord(String s) {
        String[] arrString = s.split(" ");
        return arrString[arrString.length - 1].length();
    }
}
