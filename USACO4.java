/*
ID: achyuta2
LANG: JAVA
TASK: friday
*/

import java.io.*;

class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int i0 = Integer.parseInt(f.readLine());
        System.out.println(i0);
        String [] days ={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int [] months ={31,28,31,30,31,30,31,31,30,31,30,31};
        int [] monthsLeap ={31,29,31,30,31,30,31,31,30,31,30,31};
        int n =0;

        for(int year = 1900; year<(1900+i0);year++){

            if(isLeap(year)){
                for (int daynum:monthsLeap){
                    out.println(days[n]);
                    n=(n+daynum)%7;

                }
            }
            else{
                for (int daynum1:months){
                    out.println(days[n]);
                    n=(n+daynum1)%7;

                }

            }

        }
        out.close();
        BufferedReader s = new BufferedReader(new FileReader("friday.out"));
        int sun = 0,mon = 0,tue = 0,wed = 0,thu = 0,fri = 0,sat = 0;
    
        for(int q=0; q<(12*i0); q++ ){
           String y = s.readLine();
           switch (y){
               case "Sun":
                   sun+=1;
                   break;
               case "Mon":
                   mon+=1;
                   break;
               case "Tue":
                   tue+=1;
                   break;
               case "Wed":
                   wed+=1;
                   break;
               case "Thu":
                   thu+=1;
                   break;
               case "Fri":
                   fri+=1;
                   break;
               case "Sat":
                   sat+=1;
                   break;
            }

        }
        PrintWriter r = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        r.flush();
        r.println(sun+" "+mon+" "+tue+" "+wed+" "+thu+" "+fri+" "+sat);


        r.close();

    }
    public static boolean isLeap(int year){
     if(year%100 == 0){
          return year % 400 == 0;
      }else{
          return year % 4 == 0;

      }

    }

}

