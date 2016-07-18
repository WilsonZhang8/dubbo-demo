package com.zghw.dubbo.simple.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zghw.dubbo.simple.service.api.IHelloWorldService;
/**
 * 使用容器启动dubbo服务
 * @author Administrator
 *
 */
public class DubboMain {
	public static void main(String args[]){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");
        context.start ();
        IHelloWorldService helloWorldSerivce=(IHelloWorldService)context.getBean("helloWorldService");
        System.out.println(helloWorldSerivce.hello());
        try {
            System.in.read ();
        } catch (IOException e) {
            e.printStackTrace ();
        }// 按任意键退出
	}
}	
