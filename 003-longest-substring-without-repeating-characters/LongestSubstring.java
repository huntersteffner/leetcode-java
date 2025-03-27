public class LongestSubstring {
    public static void main(String[] args) {
        
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {

        int longest = 0;
        String sequence = "";
        

        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            if (!sequence.contains(c)) {
                sequence += c;
            } else {
                if (longest < sequence.length()) {
                    longest = sequence.length();
                }
                sequence = Character.toString(s.charAt(i));
            }
        }
        return longest;
    }
}
