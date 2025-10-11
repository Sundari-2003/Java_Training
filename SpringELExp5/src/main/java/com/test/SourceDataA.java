package com.test;
 
import org.springframework.stereotype.Component;
 
@Component("sourceA")
public class SourceDataA {
 
	public String msg="Spring EL example from from source class";
	private String getMsg()
	{
		return msg;
	}
}
 
 
