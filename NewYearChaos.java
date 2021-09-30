import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class NewYearChaos {


    class Result {

        /*
         * Complete the 'minimumBribes' function below.
         *
         * The function accepts INTEGER_ARRAY q as parameter.
         */

        public static void minimumBribes(List<Integer> q) {
            // Write your code here
            int check=1;
            int chuyen=0;
            for(int i=0;i<q.size();i++){
                if(q.get(i)-i>3){
                    check=0;
                    break;
                }

            }
            for(int i=0;i<q.size();i++){
                for (int j = 0; j < i; j++){
                    if (q.get(j) > q.get(i)) chuyen++;
                }
            }
            if(check==0){
                System.out.println("Too chaotic");
            }
            if(check==1){
                System.out.println(chuyen);
            }
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            for (int tItr = 0; tItr < t; tItr++) {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> q = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    int qItem = Integer.parseInt(qTemp[i]);
                    q.add(qItem);
                }

                Result.minimumBribes(q);
            }

            bufferedReader.close();
        }
    }

}
