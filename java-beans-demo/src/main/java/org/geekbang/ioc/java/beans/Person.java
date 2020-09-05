package org.geekbang.ioc.java.beans;

/**
 * @author coy
 * @since 2020/9/5
 * https://blog.csdn.net/xiao1_1bing/article/details/78063796
 **/
public class Person {
    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
