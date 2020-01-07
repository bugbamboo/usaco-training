/*
USER: achyuta2
PROB: milk
LANG: JAVA
 */
import java.io.*;
import java.util.StringTokenizer;

public class milk {
    public static void main(String[] args) throws IOException  {
        BufferedReader f = new BufferedReader(new FileReader("milk.in"));
        PrintWriter out = new PrintWriter(new FileWriter("milk.out"));
        StringTokenizer k = new StringTokenizer(f.readLine());
        int milkNeed = Integer.parseInt(k.nextToken());
        int farmNum = Integer.parseInt(k.nextToken());
        int[] prices1= new int[farmNum];
        int milkCollect=0;

        int spent=0;

        int[][] prices = new int[farmNum][2];
        for(int i=0; i<farmNum; i++){
            StringTokenizer z = new StringTokenizer(f.readLine());

           prices[i][0]=Integer.parseInt(z.nextToken());
           prices1[i]=prices[i][0];
           prices[i][1]=Integer.parseInt(z.nextToken());


        }
        int a;
        int b;
        int milkLeft;
        while(milkCollect<milkNeed){

            b=smallest(prices1);
            milkLeft=(milkNeed-milkCollect);
            if(prices[b][1]<=(milkLeft)){

                milkCollect+=prices[b][1];
                spent+=(prices[b][1]*prices[b][0]);
                prices1[b]=1000000000;
            }else{
                milkCollect+=milkLeft;
                spent+=(milkLeft*prices[b][0]);
                prices1[b]=1000000000;
            }


        }
        out.println(spent);
	out.close();

}
public static int smallest (int[] ar){
        int g=1000000000;
        for(int f:ar){
            if(g>=f){
                g=f;
            }
        }
        for(int i=0;i<ar.length;i++){
            if (ar[i]==g){
               return i;
            }

        }
    return -1;

}
}
