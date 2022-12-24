package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import  static org.example.PurchaseoOtteryTicket.purchaseOtteryTicker;
import static org.example.ViewOtteryDetails.viewOtteryDetails;

/**
 * @auther:li
 * @date:6 -  -  -
 * description:
 * version:1.0
 */
public class Test {
    public static void main(String[] args) {
        while (true) {
            System.out.println("—————欢迎进入双色球系统———————");
            System.out.println("1.购买彩票  2.查看开奖 4 .查看奖项 3.退出 :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                purchaseOtteryTicker();
            } else if (choice == 2) {
//                ArrayList data=purchaseOtteryTicker();
                viewOtteryDetails();
            } else if (choice == 3) {
                System.out.println("您确认要退出吗？yes or no");
                String next = sc.next();
                if (next.equals("yes")) {
                    return;
                }
            }
            else if (choice == 4) {
                AnnounceResults.announceResults();
            }
            else {
                System.out.println("无法识别小主人的指令，请重新输入");
                choice = sc.nextInt();
            }
        }
    }

}
