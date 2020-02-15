import java.io.*;
import java.util.*;


public class ariprog {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ariprog.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
        int num = Integer.parseInt(f.readLine());
        int limit = Integer.parseInt(f.readLine());
        Integer[] arr = generator(limit);
        int e=0;
        int z=(arr[arr.length-1]/(num-1));
        int b;



        for(int y=1;y<=z;y++){
                b=Arrays.binarySearch(arr,arr[arr.length-1]-y*(num-1));
                if(b<0){
                    b=b*(-1)-1;
                }


            for (int i=0;i<=b;i++){

                int x=0;
                A:for(int r=0; r<num;r++){

                    if(!isValid(arr[i]+(y*r),arr)){
                        break A;
                    }else{
                        x++;


                    }
                }
                if(x==num){
                    out.println(arr[i]+" "+y);
                    e++;
                }
            }
        }
        if(e==0){
            out.println("NONE");
        }
        out.close();
    }

    static Integer[] generator(int limit){
        HashSet<Integer> hset = new HashSet();
        for (int i=0; i<=limit;i++){
            for(int j=i; j<=limit;j++){
                hset.add(i*i+j*j);
            }
        }
        Integer[] arr =hset.toArray(new Integer[hset.size()]);

        Arrays.sort(arr);
        System.out.println("1");
        return arr;

    }

    public static boolean isValid(int i, Integer [] dictionary){
        int y = Arrays.binarySearch(dictionary,i);
        return y>=0;
    }



}
