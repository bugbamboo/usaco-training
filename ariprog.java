import java.io.*;
import java.util.Arrays;


public class ariprog {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ariprog.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
        int num = Integer.parseInt(f.readLine());
        int limit = Integer.parseInt(f.readLine());
        int[] arr = generator(limit);
        int e=0;
        int z=(arr[arr.length-1]/(num-1));

        int b=arr.length-num;

        for(int y=1;y<=z;y++){
            for (int i=0;i<b;i++){
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

    static int[] generator(int limit){
        int[] arr = new int[(limit+1)*(limit+1)];
        int q=0;
        for (int i=0; i<=limit;i++){
            for(int j=0; j<=limit;j++){
                arr[q]=i*i+j*j;
                q++;
            }
        }
        Arrays.sort(arr);
        int x=arr.length;
        int[] ar2 = new int[x];
        ar2[0]=arr[0];
        int r=1;
        for(int y=1; y<arr.length;y++){
            if(arr[y]!=arr[y-1]){
                ar2[r]=arr[y];
                r++;
            }
        }
        int z=0;
        for(int k=1; k<ar2.length;k++){
            if(ar2[k]>ar2[k-1]){
                z++;
            }
        }
        int[] ar3 = new int[z+1];
        for(int w=0; w<=z;w++){
            ar3[w]=ar2[w];
        }
        System.out.println(arr.length+" "+ar3.length);
        return ar3;
    }
    public static boolean isValid(int i, int [] dictionary){

        int y = Arrays.binarySearch(dictionary,i);

        if(y<0){

            return false;}

        else{

            return true;

        }

    }

}
