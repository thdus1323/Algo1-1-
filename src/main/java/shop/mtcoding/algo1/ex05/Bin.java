package shop.mtcoding.algo1.ex05;


public class Bin {
    public static void main(String[] args) {
        int inputNum = 19;
        int bin[] = new int[100];

        int i = 0;
        int mok = inputNum;

        while(mok > 0){
            bin[i] = mok % 2;
            mok /=2;
            i++;
        }

        i--;

        for(; i>=0; i --){
            System.out.println(bin[i]);
        }
    }
}
