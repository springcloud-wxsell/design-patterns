package com.david.design.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * 原型模式,
 *  注意： clone() 方法会导致bug
 * Created by wangwei on 2019/10/25.
 */
public class Pig implements Cloneable {

    private String name;

    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }


    /**
     * 原型模式有bug，不重写父类 clone() 方法，是浅克隆
     * 原型模式必须需要重写父类的 clone() 方法，是深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        // 深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
