
import java.io.*;
import java.util.*;

public class skidesign {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("skidesign.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
        int n = Integer.parseInt(br.readLine());
        int[] hills = new int[n];

        for (int i = 0; i < n; i++) {
            hills[i]= Integer.parseInt(br.readLine());
        }

        int total = 1000000000;
        for(int i = 0; i <= 83; i++) {
            int cost = 0;
            int d = 0;
            for (int j = 0; j < n; j++) {
                if (i>hills[j]) {
                    d=i-hills[j];
                } else if (i<hills[j]-17) {
                    d=hills[j]-i-17;
                } else {
                    d = 0;
                }
                cost+=d*d;
            }
            total=Math.min(cost,total);
        }
        out.println(total);
        out.close();

    }
}
