package shop.mtcoding.algo1.ex05;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        String input = "helloWorlD";

        char []arr;

        arr = input.toCharArray();

        System.out.println(arr);

        for (int i = 0; i < arr.length ; i++){
            if (arr[i] >= 'a' && arr[i] <= 'z'){
                //소문자 -> 대문자로
                arr[i] = (char)(arr[i] + 'A' - 'a');
            } else if (arr[i] >= 'A' && arr[i] <= 'z') {
                //대문자 -> 소문자로
                arr[i] = (char)(arr[i] - ('A'-'a'));
            }
        }
        System.out.println(arr);
    }
}
