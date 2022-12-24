package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther:li
 * @date:6 -  -  -
 * description:
 * version:1.0
 */
public class PurchaseoOtteryTicket {
    public  static ArrayList  purchaseOtteryTicker() {
        //购买彩票
        System.out.println("----------双色求彩票系统-------------");
        System.out.println("购买彩票");
        System.out.println("您需要下多少注:");
        Scanner sc= new Scanner(System.in);
        int pour = sc.nextInt();
        String detail=" ";
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 6; i++) {
            System.out.println("请选择6个红球，红球在(1-33)之间");
            int num = sc.nextInt();
            numbers.add(num);
        }
        detail=detail+"您一共下了" + pour + "注" + "\n" + "一共花费了" + 3 * pour + "元(一注3元)" + "\n" + "所选号码为" + numbers;
        System.out.println(detail);
        return numbers;
    }
}
