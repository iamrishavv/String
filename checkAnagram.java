package String;

import java.util.Arrays;

//wap to check if two strings are anagram or not
//means same no of words and same letters.
public class checkAnagram {
    public static void main(String[] args) {
        String s1 ="rishav";
        String s2 ="shavri";
        if(s2.length()!= s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        char [] a= s1.toCharArray();
        char [] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
