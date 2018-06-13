package com.torres.jvm.chapter10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Torres on 2018-06-13 19:49.
 */
public class MapTest1 {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("hello", "你好");
        map.put("how are you?", "吃了没？");
        System.out.println((String) map.get("hello"));
        System.out.println((String) map.get("how are you?"));
    }


}
