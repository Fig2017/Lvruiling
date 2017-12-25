/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:43:23
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:43:23 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Vip {
    public static void main(String[] args) {
        Vip vip = new Vip();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t*****欢迎光临*****");
        System.out.println("\t1.至尊级");
        System.out.println("\t2.钻石级");
        System.out.println("\t3.铂金级");
        System.out.println("\t4.黄金级");
        System.out.println("\t5.白银级");
        System.out.println("请输入您的vip等级:");
        int num = scanner.nextInt();
        System.out.println("请输入您消费的金额:");
        double num1 = scanner.nextDouble();
        System.out.println("您本次消费金额为:" + vip.a(num, num1));
    }

    String vip1 = "至尊级";

    String vip2 = "钻石级";

    String vip3 = "铂金级";

    String vip4 = "黄金级";

    String vip5 = "白银级";

    double a(int b, double c) {
        return (0.7 + b * 0.05) * c;
    }
}
