import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pair {
    public static int min2Int(int a,int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public static int pairs(int K, List<Integer> A) {
        int check=0;
        Collections.sort(A);
        int i = 0, j = 0;
        while (i < A.size() && j < A.size()) {
            if (A.get(i) == A.get(j) + K) {
                check++;
                if(A.get(j)==min2Int(A.get(i),A.get(j))){
                    j++;
                }
                else{
                    i++;
                }
            }
            else if (A.get(i) < A.get(j) + K) {
                i++;
            }
            else {
                j++;
            }

        }
        return check;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(args[i]);
            arr.add(arrItem);
        }

        System.out.println(pairs(2,arr));

    }
}
