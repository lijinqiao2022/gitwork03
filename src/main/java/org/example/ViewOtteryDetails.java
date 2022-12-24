package org.example;

import java.util.ArrayList;

import static org.example.PurchaseoOtteryTicket.purchaseOtteryTicker;

/**
 * @auther:li
 * @date:5 -  -  -
 * description:
 * version:1.0
 */
public class ViewOtteryDetails {
    public static ArrayList viewOtteryDetails() {
        ArrayList number= purchaseOtteryTicker();
        System.out.println(number);


            System.out.println("--------------欢迎来到\"查看开奖\"界面--------------------");
            //中奖号码展示
            ArrayList lucky_number = new ArrayList();
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            //        lucky_number.add(1);
            for (int i = 0; i < 6; i++) {
                int d1 = (int) (Math.random() * 10 * 3.3);
                lucky_number.add(d1);
            }
            System.out.println(lucky_number);
            System.out.println(number);
            int red_count = 0;
            int blue_count = 0;
            for (int i = 0; i < lucky_number.size(); i++) {
                for (int j = 0; j < number.size(); j++) {
                    if (i == j) {
                        if (lucky_number.get(i).equals(number.get(j))) {

                            if (lucky_number.indexOf(i) == -1) {
                                blue_count++;
                            } else {
                                red_count++;
                            }
                        }
                    }
                }

            }
            System.out.println("红球相等个数：" + red_count);
            System.out.println("篮球相等个数：" + blue_count);
            ArrayList win_ball=new ArrayList();
            win_ball.add(red_count);
            win_ball.add(blue_count);
            System.out.println(win_ball);
            return win_ball;
        }
}



