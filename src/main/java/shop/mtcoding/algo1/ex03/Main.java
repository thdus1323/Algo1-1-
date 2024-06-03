package shop.mtcoding.algo1.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //스캐너 만들고
        Scanner scan = new Scanner(System.in);

        int[] inputNum = new int[10];
        for (int i = 0; i < 10; i++) {
            //사용자한테 값을 받고 그걸 각 배열에 넣어
            inputNum[i] = scan.nextInt();
            System.out.println(inputNum[i]);
        }

        int[] mode = new int[10];
        for (int i = 0; i < 10; i++){
            //inputNum의 숫자에 대해 mode 배열의 값을 1씩 증가(숫자 count)
            mode[inputNum[i]]++;
        }

        int modeNum = 0;
        int modCnt = 0;

        for (int i = 0; i < 10; i++) {
            //최대횟수보다 mode[i]의 수가 크면 바꿔야지. 최빈수
            if (modCnt < mode[i]){
                //mode[i]값 저장.
                modCnt = mode[i];
                //최빈수는 = i이다.
                modeNum = i;
            }

        }
        System.out.println("최빈수는" + modeNum + " cnt:" + modCnt);


    }
}
