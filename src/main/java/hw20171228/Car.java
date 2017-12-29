/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午7:45:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午7:45:04 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public abstract class Car {
    private String name;

    public int circle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCircle(int i) {
        return circle;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    public void summary() {
        System.out.println("我是一辆很贵的 豪车");

    }

}
