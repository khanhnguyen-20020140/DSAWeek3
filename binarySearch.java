import java.util.Arrays;

public class binarySearch {
    public static int check(int[] a,int number ){
       int head=0,tail=a.length-1;
       while(head<=tail){
           int mid=head+(tail-head)/2;
           if(number<a[mid]){
               tail=mid-1;
           }
           else if(number >a[mid]){
               head=mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
    }
    public static int binarySearch(int[] a, int number){
        int head=0;
        int tail=a.length-1;
        return check(a,number);
    }
    public static void main(String[] args) {
        int iArr[] = {1, 2,3, 4, 6,8, 9,11,15};
        Arrays.sort(iArr);
        System.out.println(binarySearch(iArr,7));
        System.out.println(binarySearch(iArr,9));

    }
}
