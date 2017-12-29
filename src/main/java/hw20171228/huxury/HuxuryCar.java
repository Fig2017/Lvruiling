/**
 * Project Name:dt59homework
 * File Name:HuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午5:25:25
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:25:25 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class HuxuryCar extends Car {

    public void summary() {
        getCircle(4);
        System.out.println("这是一辆很贵的 豪车");
        System.out.println(getCircle(4));
    }
}
