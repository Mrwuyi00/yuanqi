package org.smart4j.chapter2.util;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by linwu on 12/27/2017.
 * 自动创建get,set方法
 *
 */
public final class ClassSetAndGetUtil {

    public static Set<String> set(String className){
        Set<String> result = new HashSet<>();
        try{
            Class c = Class.forName(className);
            Method[] m = c.getMethods();
            for (int i = 0; i < m.length ; i++) {
                if (m[i].getName().substring(0,3).equals("set")){
                    result.add(m[i].getName());
                }
            }
        }catch (ClassNotFoundException e){
            return null;
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> result = set("org.smart4j.chapter2.model.Customer");
        result.forEach(r -> {
            System.out.println("customer."+r+"();");
        });
    }
}
