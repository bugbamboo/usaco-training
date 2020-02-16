import java.io.*;
import java.util.*;


public class ariprog {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ariprog.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
        int num = Integer.parseInt(f.readLine());
        int limit = Integer.parseInt(f.readLine());
        HashSet<Integer> arr = new HashSet<Integer>(generator(limit));
        TreeSet<Integer> ar4 = new TreeSet<Integer>(arr);
        Integer[] ar2= ar4.toArray(new Integer[arr.size()]);

        int e=0;
        int z=(ar2[ar2.length-1]/(num-1));

        for(int y=1;y<=z;y++){

            for (int i=0;i<ar2.length;i++){
                int x=0;
                for(int r=0; r<num;r++){
                    if(!arr.contains(ar2[i]+(y*r))){
                        break;
                    }else{
                        x++;
                    }
                }
                if(x>=num){
                    out.println(ar2[i]+" "+y);
                    e++;
                }
            }
        }
        
        if(e==0){
            out.println("NONE");
        }
        out.close();
    }

    static HashSet<Integer> generator(int limit){
        HashSet<Integer> hset= new HashSet<>();
        for (int i=0; i<=limit;i++){
            for(int j=0; j<=limit;j++){
                hset.add(i*i+j*j);
            }
        }
        return hset;
    }
}
