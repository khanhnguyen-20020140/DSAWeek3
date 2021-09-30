import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {

    class Result {

        /*
         * Complete the 'closestNumbers' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static List<Integer> closestNumbers(List<Integer> arr) {
            // Write your code here

            Collections.sort(arr);
            int t=Math.abs(arr.get(0)-arr.get(1));
            List<Integer> chuech= new ArrayList<>();
            for(int i=0;i<arr.size()-1;i++){
                int hieu=Math.abs(arr.get(i)-arr.get(i+1));
                if(hieu==t){
                    chuech.add(arr.get(i));
                    chuech.add(arr.get(i+1));
                }
                if(hieu<t) {
                    chuech.clear();
                    chuech.add(arr.get(i));
                    chuech.add(arr.get(i+1));
                    t=hieu;
                }

            }
            Collections.sort(chuech);
            return chuech;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> result = Result.closestNumbers(arr);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
