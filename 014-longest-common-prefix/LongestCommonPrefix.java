public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] exampleOne = {
            "flower",
            "flow",
            "flight"
        };
        String[] exampleTwo = {
            "dog",
            "racecar",
            "car"
        };
        String[] exampleThree = {
            "cir",
            "car"
        };

        System.out.println(longestCommonPrefix(exampleOne));
        System.out.println(longestCommonPrefix(exampleTwo));
        System.out.println(longestCommonPrefix(exampleThree));
    }

    public static String longestCommonPrefix(String[] strs) {
        String currentLongest = strs[0];

        if(strs.length > 1) {

            for(int i = 1; i < strs.length; i++) {
                String stringBeingReviewed = strs[i];
                
                String newLongest = "";
                for (int j = 0; j < currentLongest.length(); j++) {
                    if (j < stringBeingReviewed.length() && j < currentLongest.length()) {
                        if (Character.toString(stringBeingReviewed.charAt(j)).equals(Character.toString(currentLongest.charAt(j)))) {
                            newLongest += Character.toString(stringBeingReviewed.charAt(j));
                        } else {
                            break;
                        }
                    }
                }
                currentLongest = newLongest;
            }
        }
        return currentLongest;
    }
}
