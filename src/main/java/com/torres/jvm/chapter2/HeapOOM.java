package com.torres.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Torres on 2018-06-13 18:24.
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
