package com.torres.jvm.chapter13;

/**
 * Created by Torres on 2018-06-13 19:58.
 * Atomically increment by one the current value.
 */
public class AtomicTest1 {

    /**
     *
     * @return the updated value
     */
    public final int incrementAndGet() {
        for (;;) {
            int current = get();
            int next = current + 1;
            if (compareAndSet(current, next))
                return next;
        }
    }


}
