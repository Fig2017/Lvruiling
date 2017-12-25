/**
 * Project Name:dt59homework
 * File Name:Max.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午4:57:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午4:57:37 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Max {
    public static void main(String[] args) {
        System.out.println("请输入两个数字:s");
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int d = scanner.nextInt();
        Max max = new Max();
        max.num(c, d);

    }

    int num(int a, int b) {
        if (a > b) {
            System.out.println("最大值为:" + a);
            return a;
        } else {
            System.out.println("最大值为:" + b);
            return b;
        }
    }

}
