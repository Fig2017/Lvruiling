/**
 * Project Name:dt59homework
 * File Name:StudentInfo.java
 * Package Name:dt59homework
 * Date:2017年12月24日上午10:39:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 上午10:39:50 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class StudentInfo {
    String name;

    char sex;

    int age;

    void eat() {
        System.out.println("");
    }

    public static void main(String[] args) {
        StudentInfo student;
        student = new StudentInfo();
        student.name = "吕锐玲";
        student.sex = '女';
        student.age = 21;
        System.out.println("学生姓名为:" + student.name + "\n学生的性别为:" + student.sex);

    }
}
