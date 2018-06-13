package com.torres.jvm.chapter4;
    /* BTrace Script Template */
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * Created by Torres on 2018-06-13 18:54.
 */
public class TracingScript {


    @BTrace
        @OnMethod(
                clazz="org.fenixsoft.monitoring.BTraceTest",
                method="add",
                location=@Location(Kind.RETURN)
        )

        public static void func(@Self org.fenixsoft.monitoring.BTraceTest instance,int a,int b,@Return int result) {
            println("调用堆栈:");
            jstack();
            println(strcat("方法参数A:",str(a)));
            println(strcat("方法参数B:",str(b)));
            println(strcat("方法结果:",str(result)));
        }



}
