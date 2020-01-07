/*
USER: achyuta2
PROB: palsquare
LANG: JAVA
 */
import java.io.*;

public class palsquare {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
        int x = Integer.parseInt(f.readLine());
        String n;
        int [] hi =new int[300];

        for(int i=1;i<=300;i++){
            n=BaseConvert(Integer.toString((int)Math.pow(i,2)),10,x );
            if(palindrome(n)){
                 out.println(BaseConvert(Integer.toString(i),10,x).toUpperCase()+" "+n.toUpperCase());
            }
        }
        out.close();

    }
    private static  boolean palindrome(String str){
        String reverse="";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)){
            return true;
        }
        else{
            return false;
        }



    }
    public static String BaseConvert(String str, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }
}
