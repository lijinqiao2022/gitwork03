package org.example;

import java.util.Scanner;

/**
 * @auther:li
 * @date:5 -  -  -
 * description:
 * version:1.0
 */
public class Demo {
    public static void main(String[] args) {
        int balance=0;
        String detail="";
        while (true) {
            System.out.println("---------欢迎使用小鲨鱼记账系统-------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("请输入你要选择的功能 ：");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("记账系统》》》》收支明细");
//                System.out.print(detail);
//                System.out.println(balance);
                if(detail!=""){
                    System.out.println(detail.substring(0, detail.length() - 1));}
                else {
                    System.out.print("暂无收支明细");
                }
            } else if (i == 2) {
                System.out.println("记账系统》》》》登记收入");
                System.out.println("请输入收入金额");
                int income = scanner.nextInt();
                System.out.println("请输入收入备注");
                String incommonDetail = scanner.next();
                balance=balance+income;
                detail = detail + "收入金额：" + income + "," + "收入备注：" + incommonDetail+"，余额："+balance+"\n";;


            } else if (i == 3) {
                System.out.println("记账系统》》》》登记支出");
                System.out.println("请输入支出金额");
                int outcome = scanner.nextInt();
                System.out.println("请输入支出备注");
                String outcommonDetail = scanner.next();
                balance=balance-outcome;
                detail = detail + "支出金额：" + outcome + "," + "支出备注：" + outcommonDetail+"，余额："+balance+"\n";



            } else if (i == 4) {
                System.out.println("你确定要退出吗？yes or no?");
                String next = scanner.next();
                if (next.equals("yes")){
                    System.out.println("系统退出中，欢迎您下次再来！！");
                    return;
                }
                //            System.exit(0);

            } else {
                while (true) {
                    System.out.println("没有理解小主人的指令,请重新录入");
                    i = scanner.nextInt();
                }
            }

        }
    }
}
