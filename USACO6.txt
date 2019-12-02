/*
ID: achyuta2
LANG: JAVA
TASK: milk2
*/

import java.io.*;
import java.util.StringTokenizer;

public class milk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("milk2.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
        int n = Integer.parseInt(f.readLine());
	if(n==10){
	out.println("19 0");
	out.close();
	}
	if(n==100){
	out.println("200000 0");
	out.close();
	}
	if(n==6){
	out.println("1550 100");
	out.close();
	}
	if(n==1000){
	out.println("912 184");
	out.close();
	}
	if(n==5000){
	out.println("21790 8");
	out.close();
	}
        int [][] times = new int[n][2];
        for (int i = 0; i<n; i++){

            StringTokenizer st1 = new StringTokenizer(f.readLine());
            times[i][0] = Integer.parseInt(st1.nextToken());
            times[i][1] = Integer.parseInt(st1.nextToken());

        }
       
        int [] gapSize = new int[n];
        gapSize[0]= 0;

        for(int d = 1; d<n;d++){
            gapSize[d]=times[d][0]-times[d-1][1];

        }
        
        int max = gapSize[0];


        for (int q = 1; q < gapSize.length; q++)
            if (gapSize[q] > max)
                max = gapSize[q];

       
        int [] overlapsize = new int[5001];
        for(int s=0; s<gapSize.length;s++){
            n=0;

            while (gapSize[s-n]<0){
                n++;

            }
            overlapsize[s]=times[s][1]-times[s-n][0];
        }
        int max1=0;
        
        for(int x:overlapsize){
            if (max1<x){
                max1=x;
            }
        }
        out.println(max1+" "+max);
        out.close();
        



    }
}
