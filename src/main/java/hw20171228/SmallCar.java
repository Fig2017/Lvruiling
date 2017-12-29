/**
 * Project Name:dt59homework
 * File Name:SmallCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:21:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:21:29 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class SmallCar extends Car {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        SmallCar smallcar = new SmallCar();
        smallcar.setLength(3);
        smallcar.setName("宝马");
        System.out.println(smallcar.getLength());
        System.out.println(smallcar.getName());

    }
}
