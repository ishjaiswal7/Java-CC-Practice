public class NibbleSwap {
    static int swapNibbles(int x){
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        int x = 48;
        System.out.println(swapNibbles(x));   
    }
}
