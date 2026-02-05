import java.util.*;

public class LengthLastWord {
    public static int lengthOfLastWord(String s){
        String[] tmp = s.split(" ");
        return tmp[tmp.length - 1].length();
    }
    
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("xin chao "));
        
    }
}
