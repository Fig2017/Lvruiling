/**
 * Project Name:dt59homework
 * File Name:HwFour.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:02:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:02:31 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class HwFour {
    int age;

    char sex;

    String name;

    public HwFour(int age) {
        this.age = age;
    }

    public HwFour(int age, char sex) {
        this.age = age;
        this.sex = sex;
        // System.out.printf(1, 'n');
    }

    public HwFour(int age, char sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        System.out.println(age);
        System.out.println(sex);
        System.out.println(name);
    }

}
