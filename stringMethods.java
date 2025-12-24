package String;

import java.util.Arrays;

//string methods.
public class stringMethods {
    public static void main(String[] args) {
        String s1 = "rishav";
        String s2 = "kumar";
        String s3 = "hi@hello@how are@you";
        //length()
        System.out.println(s1.length());
        //chatAt()
        System.out.println(s1.charAt(0));
        //equals()
        System.out.println(s1.equals(s2));
        //concat ( )
        System.out.println(s1.concat(s2));
        //replace ( )
        System.out.println(s2.replace("kumar", "sinha"));
        //toUpperCase ( )
        System.out.println(s1.toUpperCase());
        //lowercase()
        System.out.println(s1.toLowerCase());
        //indexOf ( )
        System.out.println(s1.indexOf('s'));
        //LastindexOf()
        System.out.println(s1.lastIndexOf('a'));
        //substring ( )
        System.out.println(s1.substring(0, 3));
        //split ( )
        String[] arr = s3.split("@");
        System.out.println(Arrays.toString(arr));
        //join()
        System.out.println(String.join("-","rishav","kumar"));
        //valueOf()
        int x=10;
        int y=11;
        System.out.println(String.valueOf(x)+String.valueOf(y));
        //toCharArray()
        char arr1[ ]  = s1.toCharArray ( );
        System.out.println(Arrays.toString(arr1));
        //toString ( )
        //startsWith ( )
        System.out.println(s1.startsWith("a"));
        //endsWith ( )
        System.out.println(s1.endsWith("v"));
        //trim ( )
        String s4="    kyu";
        System.out.println(s4.trim());
        String s = new String("Java").intern();

    }
}
