package hw2;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {

        System.out.println("請問你是男生嗎?");
        System.out.println("請輸入Y or N");

        // 使用 Scanner 進行輸入
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        scanner.close();

        // 使用 switch-case 來簡化 if-else 判斷
        switch (Character.toUpperCase(letter)) {
            case 'Y':
                System.out.println("你是男生啊!");
                break;
            case 'N':
                System.out.println("妳是女生啊!");
                break;
            default:
                System.out.println("請輸入Y or N");
                break;
        }
    }
}
