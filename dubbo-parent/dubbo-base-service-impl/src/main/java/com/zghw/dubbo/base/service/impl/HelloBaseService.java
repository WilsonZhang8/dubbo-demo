package com.zghw.dubbo.base.service.impl;

import org.springframework.stereotype.Service;

import com.zghw.dubbo.base.service.api.IHelloBaseService;

@Service
public class HelloBaseService implements IHelloBaseService{

	@Override
	public String helloBase() {
		System.out.println("调用helloBase()");
		return "helloBase";
	}

}
