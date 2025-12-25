package String;

public class checkPalindrome {
    public static void main(String[] args) {
        String s="lol";
        //1st approach
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("Not palindrome");
                break;
            }
            System.out.println("Palindrome ");
        }
        //2nd Approach
        String s1="";
        for(int k = s.length()-1; k >=0; k--){
            s1=s1+s.charAt(k);
        }
        if(s1.equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
