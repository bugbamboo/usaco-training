/*
USER: achyuta2
PROB: dualpal
LANG: JAVA
 */
import java.io.*;
import java.util.StringTokenizer;

public class dualpal {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int q = Integer.parseInt(st.nextToken());
        String i = st.nextToken();
        int y=0;
        int x=0;
        while(x<q){
	i=Integer.toString (Integer.parseInt(i)+1);
	y=0;
            for(String s:generator(i)){
                if (palindrome(s)){
                    y+=1;
                }
            }
            if(y>1){
                x+=1;
                out.println(i);
            }
            

        }
        out.close();
    }



    public static String BaseConvert(String str, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }
    public static String[] generator(String str){
        return new String[]{BaseConvert(str, 10, 2), BaseConvert(str, 10, 3), BaseConvert(str, 10, 4),BaseConvert(str,10,5),BaseConvert(str,10,6),BaseConvert(str,10,7),BaseConvert(str,10,8),BaseConvert(str,10,9),str};
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
}
