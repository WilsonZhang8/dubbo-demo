package com.zghw.dubbo.base.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 使用容器启动dubbo服务
 * @author Administrator
 *
 */
public class DubboMain {
	public static void main(String args[]){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");
        context.start ();
        try {
            System.in.read ();
        } catch (IOException e) {
            e.printStackTrace ();
        }// 按任意键退出
	}
}	
