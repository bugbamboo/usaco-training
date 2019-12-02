/*
ID: achyuta2
LANG: JAVA
TASK: beads
*/

import java.io.*;

class beads {
    public static void main(String[] args) throws IOException  {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        int i0 = Integer.parseInt(f.readLine());
        String beadString = f.readLine();
        char[] necklace= new char[i0];
        for(int i = 0; i <i0; i++){
            necklace[i] = beadString.charAt(i);
        }
        int [] beadValues = new int[i0];

        for(int a = 0; a<i0;a++){
            beadValues[a]= beadnum(a,necklace,i0);
        }
        int max = beadValues[0];


        for (int q = 1; q < beadValues.length; q++)
            if (beadValues[q] > max)
                max = beadValues[q];
        out.println(max);
        out.close();
    }
     public static int beadnum(int pos, char[] necklace, int length){
        int n = pos;
        int redCountRight = 0;
        int blueCountRight = 0;
        int redCountLeft = 0;
        int blueCountLeft = 0;
        int bestRight;
        int bestLeft;
        while(necklace[n]=='w' || necklace[n]=='r'){
            if (n== length-1){
                n=0;
            }else{
                n+=1;
            }
            redCountRight+=1;
            if (redCountRight >= length){
                return length;
            }
        }

        n=pos;
        while(necklace[n]=='w' || necklace[n]=='b'){
            if (n== length-1){
                n=0;
            }else{
                n+=1;
            }
            blueCountRight+=1;
            if (blueCountRight>= length){
                return length;
            }
        }

        n=pos-1;
        if (n==-1){
            n= length-1;
        }
        while(necklace[n]=='w' || necklace[n]=='r'){
            if (n== 0){
                n=length-1;
            }
            else{
                n-=1;
            }
            redCountLeft+=1;
            if (redCountLeft>=length){
                return length;
            }
        }

        n=pos-1;
        if (n==-1){
            n= length-1;
        }
        while(necklace[n]=='w' || necklace[n]=='b'){
            if (n== 0){
                n=length-1;
            }else{
                n-=1;
            }
            blueCountLeft+=1;
            if(blueCountLeft>=length){

                return length;
            }
        }
        if (blueCountLeft>redCountLeft){
            bestLeft=blueCountLeft;
        }else{
            bestLeft=redCountLeft;
        }
        if (blueCountRight >redCountRight){
            bestRight=blueCountRight;
        }else{
            bestRight=redCountRight;
        }
	int m = bestLeft +bestRight;
	if(m>length){
	return length;}
	else{
        return bestLeft+bestRight;
	}
    }
}
