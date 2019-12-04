
/* 
USER: achyuta2 
PROB: namenum
LANG: JAVA
 */

import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Objects;

public class namenum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("namenum.in"));
        BufferedReader f = new BufferedReader(new FileReader("dict.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("namenum.out"));
        String [] dict = new String[4617];
        String num =br.readLine();
        int d = num.length();
        int p = (int)Math.pow(3 , d);

        for(int n=0; n<4617; n++){
            dict[n]=f.readLine();
        }
       StringBuilder[] g = new StringBuilder[x];
        for(int z=0;z<g.length;z++){
            g[z]=new StringBuilder();
        }
        int s = 3;
        for(int u=0; u<d;u++){
            char q =num.charAt(u);
            



            if(q=='2'){
                int w = 0;
                for (int y = 0; y<(s/3);y++){

                    for (int e=0; e<(p/s);e++){
                        g[w].append('A');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('B');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('C');
                        w++;
                    }

                }

            }
            if(q=='3'){
                int w = 0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('D');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('E');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('F');
                        w++;
                    }

                }

            }
            if(q=='4'){
                int w = 0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('G');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('H');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('I');
                        w++;
                    }

                }

            }
            if(q=='5'){
                int w=0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('J');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('K');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('L');
                        w++;
                    }

                }

            }
            if(q=='6'){
                int w = 0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('M');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('N');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('O');
                        w++;
                    }

                }

            }
            if(q=='7'){
                int w =0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('P');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('R');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('S');
                        w++;
                    }

                }

            }
            if(q=='8'){
                int w=0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('T');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('U');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('V');
                        w++;
                    }

                }

            }
            if(q=='9'){
                int w=0;
                for (int y = 0; y<(s/3);y++){
                    for (int e=0; e<(p/s);e++){
                        g[w].append('W');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('Y');
                        w++;
                    }
                    for (int e=0; e<(p/s);e++){
                        g[w].append('Z');
                        w++;
                    }

                }

            }
            s = s * 3;
        }
        String [] c=new String[x];
        for (int i=0;i<g.length;i++) {
            c[i]=g[i].toString();
        }
        String [] validNames= new String[x];
        for(int y=0; y<c.length;y++){
            if(isValidName(c[y],dict)){
                validNames[y]=c[y];

            }

        }
        validNames=Arrays.stream(validNames).filter(Objects::nonNull).toArray(String[]::new);
        for(String n :validNames){
            out.println(n);
        }
	if(validNames.length==0){
            out.println("NONE");
        }
        out.close();


    }
   public static boolean isValidName(String test, String[] dictionary){
       int y = Arrays.binarySearch(dictionary,test);
       if(y==-1){ 
           return false;}
        else{
            return true;
       }
    }

}
