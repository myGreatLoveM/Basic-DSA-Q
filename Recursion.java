import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        String name = "poyvxccxvyop";
        System.out.println(isPalindrome(name,0,name.length()-1));

        String name1 = "poyvxcbcxbcxvyop";
        System.out.println(isPalindrome(name1,0,name1.length()-1));

        int[] arr = {6,5,4,3,2,1};
        int[] ans = reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));
    }
    public static boolean isPalindrome(String s,int start,int end) {
        if (start>=end) {
            return true;
        }
        if (s.charAt(start)!=s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start+1, end-1);
    }

    public static int[] reverseArray (int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseArray(arr, start+1, end-1);        
    }
}