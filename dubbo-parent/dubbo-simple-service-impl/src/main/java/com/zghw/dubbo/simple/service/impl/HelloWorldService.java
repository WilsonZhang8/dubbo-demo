package com.zghw.dubbo.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zghw.dubbo.base.service.api.IHelloBaseService;
import com.zghw.dubbo.simple.service.api.IHelloWorldService;

@Service
public class HelloWorldService implements IHelloWorldService {

	private IHelloBaseService helloBaseService;
	
	@Override
	public String helloWorld(String name) {
		return "hellow :"+name;
	}

	@Override
	public String helloBase() {
		return helloBaseService.helloBase();
	}
	
	@Autowired
	public void setHelloBaseService(@Qualifier("helloBaseService") IHelloBaseService helloBaseService) {
		this.helloBaseService = helloBaseService;
	}

}
