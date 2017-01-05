package com.dubbo.demo.producer;

import com.dubbo.demo.common.IProcessData;

public class ProcessDataImpl implements IProcessData {

	public String hello(String name) {
		return "ProcessDataImpl";
	}

}
