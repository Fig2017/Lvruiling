/**
 * Project Name:dt59homework
 * File Name:TestHwThree.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:21:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:21:50 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestHwThree {
    public static void main(String[] args) {
        HwThree three = new HwThree();
        three.age = 3;
        three.name = "萌萌哒";
        three.hobby = "睡觉";
        three.sex = '母';
        System.out.println(three.age);
        System.out.println(three.name);
        System.out.println(three.hobby);
        System.out.println(three.sex);
    }
}
