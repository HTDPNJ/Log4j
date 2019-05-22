package com.hfut.test;


import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Log4jTest.class);
        logger.debug("我是debug信息");
    }
}
