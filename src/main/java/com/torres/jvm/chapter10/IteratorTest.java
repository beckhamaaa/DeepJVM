package com.torres.jvm.chapter10;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Torres on 2018-06-13 19:40.
 */
public class IteratorTest {

    public static void main(String[] args) {
        List list = Arrays.asList( new Integer[] {
                Integer.valueOf(1),
                Integer.valueOf(2),
                Integer.valueOf(3),
                Integer.valueOf(4) });

        int sum = 0;
        for (java.util.Iterator localIterator = list.iterator(); localIterator.hasNext(); ) {
            int i = ((Integer)localIterator.next()).intValue();
            sum += i;
        }
        System.out.println(sum);
    }


}
