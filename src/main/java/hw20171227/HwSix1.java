/**
 * Project Name:dt59homework
 * File Name:HwSix1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午7:16:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午7:16:56 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class HwSix1 {
    public static void main(String[] args) {
        HwSix six = new HwSix();
        System.out.println(HwSix.name);
        System.out.println(HwSix.name());
        System.out.println(six.age + six.name);
    }
    /**
     * 加了static可以直接调用 没加则需要重新创建新对象。
     */

}
