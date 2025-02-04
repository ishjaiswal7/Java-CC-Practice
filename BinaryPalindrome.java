import java.util.*;
public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String  str = Integer.toBinaryString(num);
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++)
            if(arr[i] != arr[n-i-1]){
                System.out.println("Not a binary palindrome");
                return;
            }
        System.out.println("is binary palindrome");              
    }
}
