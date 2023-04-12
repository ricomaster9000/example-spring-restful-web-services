package com.greatgamesonly.examples.springrestfulwebservices.helloworld;

public class HelloWorldBean {

	private String messageAct;

	public HelloWorldBean(String messageAct) {
		this.messageAct = messageAct;
	}

	public String getMessageAct() {
		return messageAct;
	}

	public void setMessageAct(String messageAct) {
		this.messageAct = messageAct;
	}
}
