/**
 * Project Name:dt59homework
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:22:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:22:27 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {
        Pet pet = new Cat();
        // cat.eat();
        Pet pet1 = new Dog();
        // dog.eat();
        Master master = new Master();
        master.feed(pet);
        master.feed(pet1);
    }

}
