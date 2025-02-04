import java.util.*;
public class StrobogrammaticNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        String str1 = sc.next();
        String str2 = "";
        for(int i=str1.length()-1; i>-1; i--){
            if(str1.charAt(i)=='0' || str1.charAt(i)=='1' || str1.charAt(i)=='8'){
                str2 += str1.charAt(i);
            }
            else if(str1.charAt(i)=='6'){
                str2 += '9';
            }
            else if(str1.charAt(i)=='9'){
                str2 += '6';
            }
            else{
                break;
            }
        }
        if(str1.equals(str2)){
            System.out.println("It is Sobogramatic Number");
        }
        else{
            System.out.println("It is not a Sobogramatic Number");
        }
    }
}