/**
 * Project Name:dt59homework
 * File Name:Rabbit.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:34:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:34:43 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Rabbit {
    String name;

    char sex;

    String color;

    int age;

    void eat() {
        System.out.println("吃胡萝卜");
    }

    void sleep() {
        System.out.println("每天睡20个小时");
    }

    int catchinsert() {
        return 1;
    }

    public static void main(String[] args) {
        Rabbit rabbit;
        rabbit = new Rabbit();
        rabbit.name = "小可爱";
        rabbit.sex = '母';
        rabbit.color = "白色的";
        rabbit.age = 1;
        System.out.println("\t兔子的姓名:" + rabbit.name + "\n\t兔子的性别:" + rabbit.sex + "\n\t兔子的颜色:" + rabbit.color
                + "\n\t兔子的年龄:" + rabbit.age);
        rabbit.eat();
        rabbit.sleep();
        System.out.println("捉到的昆虫数:" + rabbit.catchinsert());
    }
}
