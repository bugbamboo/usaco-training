import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class barn1 {

    public static void main(String[] args) throws IOException {
        BufferedReader f=new BufferedReader(new FileReader("barn1.in"));
        StringTokenizer st=new StringTokenizer(f.readLine());
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
        int w=Integer.parseInt(st.nextToken());
        st.nextToken();
        int num=Integer.parseInt(st.nextToken());

        int [] d = new int [num];
        for (int i=0;i<num;i++) {
            d[i]=Integer.parseInt(f.readLine());
        }

        Arrays.sort(d);
        int [] g = new int [num-1];
        for (int i=0;i<num-1;i++) {
            g[i]=d[i+1]-d[i];
        }
        Arrays.sort(g);

        int sum=Math.min(w,num);
        for (int i=0;i<=g.length-w;i++) {
            sum+=g[i];
        }


        out.println(sum);
        out.close();
    }
}
