import java.util.*;

public class FindIndexFirstOccur {

    public static int strStr(String haystack, String needle) {
        int res = 0;
        res = haystack.indexOf(needle);

        return res;
    }

    public static void main(String[] args){
        // String haystack = "sadbutsad"; 
        // String needle = "sad";

        String haystack = "leetcode";
        String needle = "tco";

        System.out.println(strStr(haystack, needle));
    }
}
