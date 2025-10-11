package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClientDataA {
	@Value("#{sourceA.msg}")
	private String text;

	@Override
	public String toString() {
		return "ClientDataA [text=" + text + "]";
	}
	
	
}
