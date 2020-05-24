package com.jd.app.order.juc;

import com.jd.app.order.bean.Cat;
import com.jd.app.order.bean.Order;

import java.util.concurrent.atomic.*;

public class AtomicIntegerFieldUpdaterDemo {

    private volatile int money;
    private volatile long moneyLong;
    private volatile  Cat cat;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicLong atomicLong = new AtomicLong();
        AtomicBoolean atomicBoolean = new AtomicBoolean();

        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[5]);
        AtomicLongArray atomicLongArray = new AtomicLongArray(new long[5]);
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray<>(new Object[5]);

        //自旋demo
        Thread thread = Thread.currentThread();
        AtomicReference<Thread> threadAtomicReference = new AtomicReference<>();
        boolean isSuccess = threadAtomicReference.compareAndSet(null, thread);
        //ABA
        AtomicMarkableReference<Integer> threadAtomicMarkableReference = new AtomicMarkableReference<Integer>(100,false);
        AtomicStampedReference<Integer> threadAtomicStampedReference = new AtomicStampedReference<>(200, 1);

        //高并发下不加锁实现非安全类字段更新
//        AtomicIntegerFieldUpdaterDemo demo = new AtomicIntegerFieldUpdaterDemo();
//        AtomicIntegerFieldUpdater<AtomicIntegerFieldUpdaterDemo> money = AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterDemo.class, "money");
//        int result = money.incrementAndGet(demo);
//        int result1 = money.incrementAndGet(demo);
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(money.get(demo));
        AtomicLongFieldUpdater<AtomicIntegerFieldUpdaterDemo> update = AtomicLongFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterDemo.class,"moneyLong");
        AtomicReferenceFieldUpdater<AtomicIntegerFieldUpdaterDemo, Cat> cat = AtomicReferenceFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterDemo.class, Cat.class, "cat");


        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        System.out.println(longAdder.longValue());
        DoubleAdder doubleAdder = new DoubleAdder();
        LongAccumulator longAccumulator = new LongAccumulator(Long::sum,0);
        longAccumulator.accumulate(1);
        DoubleAccumulator doubleAccumulator = new DoubleAccumulator(Double::sum, 0);
        doubleAccumulator.accumulate(1);

    }
}
