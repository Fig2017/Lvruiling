/**
 * Project Name:dt59homework
 * File Name:HwFive1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午5:46:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:46:35 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class HwFive1 {

    public static void main(String[] args) {
        HwFive five = new HwFive();
        five.setAge(3);
        five.setSex('母');
        five.setName("小可爱 ");

        System.out.println("这是一只" + five.getAge() + "岁的" + five.getSex() + "兔子，它的名字叫" + five.getName());

    }

}
