package com.david.design.patterns.creational.singleton;

/**
 * Created by wangwei on 2019/9/1.
 *
 * 懒汉式：注重延迟加载，只有在使用它的时候在加载
 * 双重检查，线程安全
 */
public class LazyDoubleCheckSingleton {

    /**
     * 方式一： 不允许 2、3 进行重排序
     * volatile：修饰，重排序被禁止
     *  通过 double check 和 volatile 即保证了线程安全，又提高了效率
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        // 双重检查
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //intra-thread semantics 保证重排序不会改变单线程内的程序执行结果。
                    // 换句话说，intra-thread semantics 允许那些在单线程内，不会改变单线程程序执行结果的重排序。
                    /**
                     * new 会经历三个步骤
                     * 1. 分配内存给这个对象
                     * 2. 初始化对象
                     * 3. 设置 instance 指向刚分配的内存地址
                     *  注意： 步骤 2 和 3 允许重排序
                     *
                     *  场景：
                     *  单例-Double Check
                     *   线程0                                  线程1
                     *   1. 分配对象的内存空间
                     *   3 设置 instance 指向内存地址
                     *                                          判断 instance 是否为 null
                     *                                          线程1初次访问对象(报异常，因为线程 0 还未初始化对象)
                     *   2. 初始化对象
                     *   4. 初次访问对象
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
