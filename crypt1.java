import java.util.Arrays;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.*;



    public class crypt1 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new FileReader("crypt1.in"));

            PrintWriter out = new PrintWriter(new FileWriter("crypt1.out"));

            int x=Integer.parseInt(br.readLine());

            int[] digits = new int[x];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0; i<x; i++){

                digits[i]=Integer.parseInt(st.nextToken());

            }

            int a=0;

            int b=0;

            int c=0;

            int[] digit2 = new int[x*x];

            int[] digit3 = new int[x*x*x];

            int [] digit4= new int[x*x*x*x];

            for(int j:digits){

                for(int h:digits){

                    digit2[a]= (j*10)+h;

                    a++;

                }



            }

            for(int i:digits){

                for(int j:digits){

                    for(int h:digits){

                        digit3[b]= (i*100)+(j*10)+h;

                        b++;

                    }



                }

            }

            for(int i:digits){

                for(int j:digits){

                    for(int h:digits){

                        for(int g:digits){

                            digit4[c]= (i*1000)+(j*100)+(h*10)+g;

                            c++;

                        }

                    }



                }

            }

            Arrays.sort(digit2);




            Arrays.sort(digit3);

            Arrays.sort(digit4);






            int amount=0;

            for(int i:digit3){

                for (int j:digit2){

                    if((isValid(i*(j%10),digit3)) &&(isValid(i*((j/10)%10),digit3))&&(isValid(i*j,digit4))){

                        amount++;

                    }else{
                        amount+=0;
                    }
                }





            }

            out.println(amount);
            out.close();



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
