package hw2;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        System.out.println("請問要選哪條路徑?");
        System.out.println("請輸入整數");

        // 使用 Scanner 進行輸入
        Scanner scanner = new Scanner(System.in);
        
        // 確保輸入是整數
        if (scanner.hasNextInt()) {
            int res = scanner.nextInt();
            
            // 判斷路徑選擇
            char ans = (res == 1) ? 'A' : 'B';
            
            System.out.println("選擇了" + ans + "路線");
        } else {
            System.out.println("請輸入有效的整數");
        }
        
        scanner.close();
    }
}
