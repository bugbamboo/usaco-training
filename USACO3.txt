/*
ID: achyuta2
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;

public class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        String[][] names = new String[i1][2];
        for (int n = 0; n<i1; n++){
            names[n][0]= f.readLine();
            names[n][1] = "0";
        }
        



        for (int q = 0; q<i1; q++) {
            String d = f.readLine();
            int r = finder(d, names);
            StringTokenizer st1 = new StringTokenizer(f.readLine());
            int i2 = Integer.parseInt(st1.nextToken());
            int i3 = Integer.parseInt(st1.nextToken());
            if( i3 !=0 ) {
                names[r][1] = Integer.toString((Integer.parseInt(names[r][1]) - i2) + (i2 % i3));
                for (int w = 0; w < i3; w++) {
                    d = f.readLine();
                    r = finder(d, names);
                    names[r][1] = Integer.toString(Integer.parseInt(names[r][1]) + (i2 / i3));
                }
            }
        }

       
        for(int y=0; y<i1; y++){
            out.println(names[y][0]+" "+names[y][1]);
        }
	out.close();

}
public static int finder(String a,String[][] names){
    int x=0;
    while (!(a.equals(names[x][0]))){
       x++;
    }
    return x;
}
}
