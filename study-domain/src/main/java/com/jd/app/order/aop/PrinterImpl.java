package com.jd.app.order.aop;

/**
 * @author hanwensheng
 * @date 2019/12/2
 * PrinterImpl
 */
public class PrinterImpl implements Printer {

    public String print(String str1, String str2) {
        System.out.println("执行目标方法print：str1 = " + str1 + "\tstr2 =" + str2);
        this.printIntern();
//        ((PrinterImpl) AopContext.currentProxy()).printIntern();
        return str1+str2;
    }

    public void printIntern(){
        System.out.println("com.jd.app.order.aop.PrinterImpl.printIntern 。。。");
    }

}
