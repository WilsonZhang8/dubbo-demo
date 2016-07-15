package com.zghw.dubbo.simple.service.impl;

import org.springframework.stereotype.Service;

import com.zghw.dubbo.simple.service.api.IHelloWorldService;

@Service
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String helloWorld(String name) {
		return "hellow :"+name;
	}

}
