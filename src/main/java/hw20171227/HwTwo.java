/**
 * Project Name:dt59homework
 * File Name:HwTwo.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:43:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:43:29 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class HwTwo {
    int age = 1;

    String name = "小可爱";

    String hobby = "睡觉";

    char sex = '母';

    public HwTwo() {
        // new HwTwo();
        int age = 2;

        String name = "大可爱";

        String hobby = "玩耍";

        char sex = '母';
        System.out.println(age);
        System.out.println(name);
        System.out.println(hobby);
        System.out.println(sex);
    }

    public static void main(String[] args) {
        new HwTwo();
    }
}
