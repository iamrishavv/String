package String;

public class approachToCreateString {
    public static void main(String[] args) {
        //it points to same object
        String s1="rishav";
        String s2="rishav";
        if(s1==s2){
            System.out.println("equal");
        }else{
            System.out.println("Not Equal");
        }
        //it will point to different object.
        String s3=new String("hello");
        String s4=new String("hello");
        if(s3==s4){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
