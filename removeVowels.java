package String;

public class removeVowels {
    public static void main(String[] args) {
        String s=" Hello I Love My India";
        StringBuilder sb=new StringBuilder();
        //Hll I Lv My nd.
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
