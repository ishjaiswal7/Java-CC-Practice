public class RemainderTheorem {
    public static void main(String[] args) {
        int[] divisor = {5,7};
        int[] rem = {1,3};
        int i=0, num=1;
        while(true){
            num = divisor[0] * i++ + rem[0]; 
            boolean flag = true;
            for(int j=1; j<divisor.length; j++){
                if(num % divisor[j] != rem[j])
                    flag=false;
                    break;    
            }
            
            if(flag==false)
                continue;
            else{
                System.out.println(num);
                break;
            }
        }
    }
}
