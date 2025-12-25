package String;

public class countTheNumberOfOccurence {
    public static void main(String[] args) {
        String s="aaaaaaaaaauuuukyaa";
        char c='a';
        char d='u';
        //output:2
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
