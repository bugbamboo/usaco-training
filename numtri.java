/*
ID: achyuta2
LANG: JAVA
TASK: numtri
*/



import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

import java.util.*;

public class pprime {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("pprime.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pprime.out")),true);
        StringTokenizer st = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=a; i<=b; i++){
            if(isPalindrome(i)){
                arr.add(i);

            }
        }
        for(Integer j:arr){
            if(isPrime(j)){
                out.println(j);
            }
        }
        out.close();
    }
    static boolean isPrime(int number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);
    }
    static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        while(x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse/10;
    }
}
