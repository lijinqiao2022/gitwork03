package org.example;

import java.util.ArrayList;

/**
 * @auther:li
 * @date:6 -  -  -
 * description:
 * version:1.0
 */
public class AnnounceResults {
    public static void  announceResults(){
        ArrayList win_ball=ViewOtteryDetails.viewOtteryDetails();
//        ArrayList win_ball=new ArrayList();
//        win_ball.add(2);
//        win_ball.add(1);
        for (int i = 0; i < win_ball.size(); i++) {
            if(win_ball.get(0).equals(6)&&win_ball.get(1).equals(1) ){
                System.out.println("一等奖");
            }else if(win_ball.get(0).equals(5)&&win_ball.get(1).equals(1)){
                System.out.println("二等奖");
            }else if (win_ball.get(0).equals(4)&&win_ball.get(1).equals(1)){
                System.out.println("三等奖");
            }else {
                System.out.println("不好意思,您没有中奖");
            }
        }






    }
}
