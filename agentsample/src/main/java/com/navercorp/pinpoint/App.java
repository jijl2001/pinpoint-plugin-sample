package com.navercorp.pinpoint;

import com.navercorp.plugin.sample.target.TargetClass02;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TargetClass02 targetClass02 = new TargetClass02();
        String ss = targetClass02.targetMethod("Hello World!1");
        System.out.println(ss);

        TargetClass02 targetClass022 = new TargetClass02();
        ss = targetClass022.targetMethod("Hello World!2");
        System.out.println(ss);

        TargetClass02 targetClass023 = new TargetClass02();
        ss = targetClass023.targetMethod("Hello World!3");
        System.out.println(ss);
    }
}
