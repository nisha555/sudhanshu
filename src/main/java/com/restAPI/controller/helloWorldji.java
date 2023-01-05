package com.restAPI.controller;

public class helloWorldji {
	
	private String msg;

	public helloWorldji(String msg) {
		this.msg=msg;
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "helloWorldji [msg=" + msg + "]";
	}
	

}
