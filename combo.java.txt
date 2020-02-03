/*
ID: achyuta2
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class combo {

        public static void main(String[] args) throws IOException{
            BufferedReader f = new BufferedReader(new FileReader("combo.in"));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
            int base = Integer.parseInt(f.readLine());
            int x=5;
            int y=250;
            if (base <5){

                y= base*base*base*2;
            }
            if(base<4){
                x=base;
            }

            int[] farmerKey = new int[3];
            int[] masterKey = new int[3];
            StringTokenizer st = new StringTokenizer(f.readLine());
            farmerKey[0]= Integer.parseInt(st.nextToken());
            farmerKey[1]= Integer.parseInt(st.nextToken());
            farmerKey[2]= Integer.parseInt(st.nextToken());
            StringTokenizer st1 = new StringTokenizer(f.readLine());
            masterKey[0]= Integer.parseInt(st1.nextToken());
            masterKey[1]= Integer.parseInt(st1.nextToken());
            masterKey[2]= Integer.parseInt(st1.nextToken());
            int[] overlap = {x-dist(farmerKey[0],masterKey[0], base),x-dist(farmerKey[1],masterKey[1], base),x-dist(farmerKey[2],masterKey[2], base)};
            for(int i=0; i<overlap.length;i++){
                if (overlap[i]<=0){
                    overlap[i]=0;
                }
            }
            out.println((y-(overlap[0]*overlap[1]*overlap[2])));
            out.close();


        }
        public static int dist(int num1, int num2, int base){
            int a = Math.abs(num1-num2);
            if(a>(base/2)){
                return base-a;
            }else{
                return a;
            }
        }

}

