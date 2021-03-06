/*
ID: achyuta2
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main (String [] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("ride.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
      
	int [] digits = {1,1,1,1,1,1};
	String t = f.readLine();
        
	
        int n=0;
        while(n<t.length()) {
            int i =((int)t.charAt(n)) - 64;

            digits[n] =i;
            n+=1;
        }

        int pro1 = 1;
        for (int x = 0; x < digits.length; x++){
            pro1 = pro1 * digits[x];
	}
        int ans1 = pro1 % 47;
        
	int [] digits1 = {1,1,1,1,1,1}; 
	
	int s=0;
        String r= f.readLine();

        while(s<r.length()) {
            int y =((int)r.charAt(s)) - 64;

            
            digits1[s] =y;
            s+=1;
        }
        int pro2 = 1;
        for (int b = 0; b < digits1.length; b++){
            pro2 = pro2 * digits1[b];
	}
        int ans2 = pro2 % 47;

        if (ans2 == ans1){
            out.println("GO");
        } else{
            out.println("STAY");
        }

        out.close();

   }
}
