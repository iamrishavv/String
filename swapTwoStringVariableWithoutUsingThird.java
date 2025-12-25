package String;
//wap to swap two variable without using third variable
public class swapTwoStringVariableWithoutUsingThird {
    public static void main(String[] args) {
        String s1="java";//4
        String s2="Program";//7
        s1=s1+s2;//javaprogram//11
        s2=s1.substring(0,s1.length()-s2.length());//java
        s1=s1.substring(s2.length());//program
        System.out.println(s1);
        System.out.println(s2);

    }
}
