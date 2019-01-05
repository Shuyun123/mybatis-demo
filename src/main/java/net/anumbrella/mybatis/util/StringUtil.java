package net.anumbrella.mybatis.util;

/**
 * @author Anumbrella
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static void print(Object value){
        System.out.println(value);
    }
}

