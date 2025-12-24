package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//it is not thread safe.
public class stringBuilder {
    public static void main(String[] args) throws IOException  {
//        StringBuilder s=new StringBuilder("rishav");
//        s.append("kumar");
//        s.reverse();
//        System.out.println(s);
        //take input from bufferedreader as it faster than scanner class.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] input = br.readLine().trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
    }
}
