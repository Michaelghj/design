package com.ghj.Singleton;

/**
 * 饿汉式--线程安全
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03(){}

    public static synchronized Singleton03 getInstance(){
        if (instance == null){
            instance = new Singleton03();
        }
        return instance;
    }
}
