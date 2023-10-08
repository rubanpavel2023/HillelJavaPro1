import java.util.Arrays;
public class Anagram {
    public static boolean checkAnagram (String s, String t) {
        char[] sResArray = s.toCharArray();
        char[] tResArray = t.toCharArray();
        Arrays.sort(sResArray);
        Arrays.sort(tResArray);
        return Arrays.equals(sResArray, tResArray);
    }
}

