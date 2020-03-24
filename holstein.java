
import java.io.*;
import java.util.*;

class holstein {
    public static void main(String[] args) throws IOException {
        BufferedReader f=new BufferedReader(new FileReader("holstein.in"));
        HashMap<Integer, Integer[]> vitamins = new HashMap<>();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("holstein.out")));
        ArrayList<StringBuilder> achyuta = new ArrayList<>();
        int d = Integer.parseInt(f.readLine());
        Integer [] requirements = new Integer[d];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for(int i = 0; i<d;i++){
            requirements[i]= Integer.parseInt(st.nextToken());
        }
        int a = Integer.parseInt(f.readLine());

        for(int i = 0; i<a; i++){
            StringTokenizer st1 = new StringTokenizer(f.readLine());
            Integer[] s = new Integer[d];
            for(int j = 0; j<d;j++ ){
                s[j] = Integer.parseInt(st1.nextToken());
            }
            vitamins.put(i+1,s);
        }



        StringBuilder[] intructions = generator(a);

       for(int i = 0; i < a*a;i++){
           StringBuilder x = intructions[i];
           Integer[] g= new Integer[d];
           Arrays.fill(g, 0);
           for(int j = 0; j< x.length() ; j++){
               if(x.charAt(j) == '1' ){
                   g = add(g, vitamins.get(j+1));

               }
           }


           if (compare(requirements,g)){
               achyuta.add(x.reverse());
           }
       }

       StringBuilder[] h = new StringBuilder[achyuta.size()];
       achyuta.toArray(h);
       Arrays.sort(h);
       
       System.out.println(Arrays.toString(h));
       String n = h[0].reverse().toString();
       int q=0;
       for(int i = 0; i<n.length(); i++){
           q += Integer.parseInt(String.valueOf(n.charAt(i)));
       }
        out.print(q +" ");
        int count = 0;
        for(int i = 0; i<n.length(); i++){
            if(n.charAt(i)=='1' && count <q){
                count ++;
                out.print(i+1+" ");
            }else if(n.charAt(i)=='1'){
                out.print(i+1);
            }
        }
        out.print("");
        out.close();
    }
    static boolean compare(Integer[] requirements, Integer[] test){
        int i=0;
        for(int r =0; r<requirements.length; r++){
            if(test[r] >= requirements[r]){
                i++;
            }
        }
        return i >= requirements.length;
    }
    static Integer[] add(Integer[] write, Integer[] hash){
        Integer[] y = new Integer[write.length];
        for(int i=0; i< write.length; i++){
            y[i]= write[i] + hash[i];

        }
        return y;
    }
    static StringBuilder[] generator(int length){
        int n= length * length;
        StringBuilder[] arr = new StringBuilder[n];
        for(int z=0;z<arr.length;z++){
            arr[z]=new StringBuilder();
        }


        int x=2;
        for (int g=0; g<length;g++){
            int w=0;
            for(int y=0;y<(x/2);y++){
                for (int e=0; e<(n/x);e++){
                    arr[w].append(0);
                    w++;
                }
                for (int e=0; e<(n/x);e++){
                    arr[w].append(1);
                    w++;
                }

            }
            x*=2;
        }
        return arr;

    }


}
