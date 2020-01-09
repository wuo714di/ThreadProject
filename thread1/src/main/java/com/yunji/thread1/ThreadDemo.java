package com.yunji.thread1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author changqing
 * @date 2020-01-08 19:23
 * @description:
 */
@Component
@Slf4j
public class ThreadDemo {
    public void openThread() {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("thread1;;;;;;;;start");
                    }
                }
        ).start();
        System.out.println("main；；；；；；；；；start");
    }

}
