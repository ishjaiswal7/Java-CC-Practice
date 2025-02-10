import java.util.Scanner;

public class MaxSumHourGlass {
    public static void main(String[] args) {
        /*
        int[][] arr=new int[][]{
            {2,3,4,5},
            {2,3,4,1},
            {2,4,6,7},
            {6,1,1,1}};
        // Expected Output : 33
        */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum,max=0;
        for(int i=0; i<arr.length-2;i++){
            
            for(int j=0; j<arr[i].length-2; j++){
                sum=0;
                sum += (arr[i][j] + arr[i][j+1] +arr[i][j+2]);
                sum += (arr[i+1][j+1]);
                sum += (arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2]);
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
        
}
