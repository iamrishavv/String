package String;

public class reverseEachWordInString {
    public static void main(String[] args) {
        String s="Java is easy";
        //"avaJ si ysae"
        String [] words=s.split(" ");//words = {"Java", "is", "easy"};

        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);//Converts the current word into a StringBuilder.
            result.append(sb.reverse().append(" "));//Reverses the characters of the current word and append space.

        }
        System.out.println(result.toString().trim());
    }
}
