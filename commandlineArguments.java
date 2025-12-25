package String;

public class commandlineArguments {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please pass two numbers");
            return;
        }
        String s1=args[0];
        String s2=args[1];
        int a=Integer.parseInt(args[0]);//(s1)
        int b=Integer.parseInt(args[1]);//(s2)
        System.out.println(a+b);
    }
}
