package org.geekbang.ioc.java.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

/**
 * @author coy
 * @since 2020/9/5
 **/
public class BeanInfoDemo {
  public static void main(String[] args) throws IntrospectionException {

      // bean 自省是什么意思？
      BeanInfo beanInfo = Introspector.getBeanInfo(Person.class,Object.class);
    Stream.of(beanInfo.getPropertyDescriptors())
        .forEach(
            System.out::println);
  }
}
