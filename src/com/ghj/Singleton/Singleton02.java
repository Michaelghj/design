package com.ghj.Singleton;

/**
 * 饿汉--线程安全
 */
public class Singleton02 {
    private static Singleton02 instance = new Singleton02();
}
